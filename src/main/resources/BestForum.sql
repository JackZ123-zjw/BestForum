--version 8.0.20
--Host: localhost

START TRANSACTION;
SET time_zone = "+00:00";


-- Database: `BestForum`

-- -------------------------------------------------------------

-- user
-- 存储用户信息

CREATE TABLE `user` (
    `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
    `account_id` VARCHAR(20) NOT NULL COMMENT '账户名',
    `email` VARCHAR(32) DEFAULT NULL COMMENT '邮箱',
    `qq_account_id` VARCHAR(64) DEFAULT NULL COMMENT 'QQ号',
    `baidu_account_id` VARCHAR(100) DEFAULT NULL COMMENT '百度账号',
    `weibo_account_id` VARCHAR(100) DEFAULT NULL COMMENT '微博账号',
    `nickname` VARCHAR(50) DEFAULT NULL COMMENT '用户昵称',
    `token` CHAR(36) DEFAULT NULL COMMENT '用户唯一识别码',
    `gmt_create` BIGINT(24) NOT NULL,
    `gmt_modified` BIGINT(24) NOT NULL,
    `avatar_url` VARCHAR(255) DEFAULT '/images/default_avatar.png' COMMENT '头像',
    `phone` VARCHAR(16) DEFAULT NULL COMMENT '手机号码',
    `password` VARCHAR(64) NOT NULL COMMENT '密码',
    `priority` INT(1) DEFAULT 0 COMMENT '用户等级',
    `score` INT(11) DEFAULT 0 COMMENT '用户积分',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- user_information
-- 用户信息

CREATE TABLE `user_information` (
    `user_id` BIGINT(20) NOT NULL COMMENT '用户id',
    `real_name` VARCHAR(50) DEFAULT NULL COMMENT '真实姓名',
    `description` VARCHAR(1024) DEFAULT NULL COMMENT '自我描述',
    `birthday` VARCHAR(20) DEFAULT NULL COMMENT '生日',
    `marriage` VARCHAR(5) DEFAULT NULL COMMENT '婚姻状况',
    `gender` VARCHAR(5) DEFAULT '外星人' COMMENT '性别',
    `blood_type` VARCHAR(5) DEFAULT NULL COMMENT '血型',
    `figure` VARCHAR(5) DEFAULT NULL COMMENT '身材',
    `constellation` VARCHAR(20) DEFAULT NULL COMMENT '星座',
    `education` VARCHAR(50) DEFAULT NULL COMMENT '学历',
    `occupation` VARCHAR(50) DEFAULT NULL COMMENT '工作',
    `location` VARCHAR(30) DEFAULT '北京-北京-东城区',
    CONSTRAINT `user_info` FOREIGN KEY `user_information` (`user_id`)
                            REFERENCES `user` (`id`)
                            ON DELETE CASCADE
                            ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


-- post
-- 帖子

CREATE TABLE `post` (
    `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
    `title` VARCHAR(120) NOT NULL COMMENT '帖子标题',
    `content` TEXT COMMENT '帖子内容',
    `gmt_create` BIGINT(24) NOT NULL,
    `gmt_modified` BIGINT(24) NOT NULL,
    `creator_id` BIGINT(20) NOT NULL COMMENT '发帖者id',
    `comment_count` INT(11) NOT NULL DEFAULT 0 COMMENT '评论数',
    `like_count` INT(11) NOT NULL DEFAULT 0 COMMENT '点赞数',
    `view_count` INT(11) NOT NULL DEFAULT 0 COMMENT '浏览数',
    `gmt_latest_comment` BIGINT(24) NOT NULL,
    `status` INT(1) NOT NULL DEFAULT '0' COMMENT '1加精，2置顶，3加精置顶',
    `columnname` INT(3) DEFAULT '2' COMMENT '专栏编号',
    `permission` INT(3) DEFAULT '0' COMMENT '授权信息',
    `tags` VARCHAR(256) COMMENT '标签，用，分隔',
    PRIMARY KEY (`id`),
    CONSTRAINT `user_post` FOREIGN KEY `post` (`creator_id`)
                            REFERENCES `user` (`id`)
                            ON DELETE CASCADE
                            ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- user_favourite
-- 用户收藏表

CREATE TABLE `user_favourite` (
    `user_id` BIGINT(20) NOT NULL,
    `post_id` BIGINT(20) NOT NULL,
    CONSTRAINT `user_fav_id` FOREIGN KEY `user_favourite` (`user_id`)
                              REFERENCES `user` (`id`),
    CONSTRAINT `post_fav_id` FOREIGN KEY `user_favourite` (`post_id`)
                              REFERENCES `post` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



-- notification
-- 通知

CREATE TABLE `notification` (
    `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
    `notifier_id` BIGINT(20) NOT NULL COMMENT '发送者id',
    `receiver_id` BIGINT(20) NOT NULL COMMENT '接受者通知',
    `outer_id` BIGINT(20) NOT NULL,
    `outer_name` VARCHAR(256) NOT NULL,
    `notificationtype` INT(1) NOT NULL COMMENT '1回复，2回复评论，3收藏，4点赞',
    `gmt_create` BIGINT(24) NOT NULL,
    `status` INT(1) NOT NULL DEFAULT 0 COMMENT '0未读，1已读',
    PRIMARY KEY (`id`),
    CONSTRAINT `user_noti1` FOREIGN KEY `notification` (`notifier_id`)
                            REFERENCES `user` (`id`)
                            ON DELETE CASCADE
                            ON UPDATE CASCADE,
    CONSTRAINT `user_noti2` FOREIGN KEY `notification` (`receiver_id`)
                            REFERENCES `user` (`id`)
                            ON DELETE CASCADE
                            ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- thumb
-- 点赞

CREATE TABLE `thumb` (
    `target_id` BIGINT(20) NOT NULL COMMENT '点赞目标',
    `thumbtype` INT(11) NOT NULL COMMENT '回复目标类型',
    `liker_id` BIGINT(20) NOT NULL COMMENT '点赞者id',
    `gmt_craete` BIGINT(24) NOT NULL,
    `gmt_modified` BIGINT(24) NOT NULL,
    CONSTRAINT `thumb_sender` FOREIGN KEY `thumb` (`liker_id`)
                               REFERENCES `user` (`id`)
                               ON DELETE CASCADE
                               ON UPDATE CASCADE,
    CONSTRAINT `thumb_target` FOREIGN KEY `thumb` (`target_id`)
                               REFERENCES `post` (`id`)
                               ON DELETE CASCADE
                               ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- comment
-- 评论

CREATE TABLE `comment` (
    `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
    `thumbtype` INT(11) NOT NULL COMMENT '1回复post,2回复评论',
    `parent_id` BIGINT(20) NOT NULL COMMENT '所回复的post或评论的id',
    `commentator` BIGINT(20) NOT NULL COMMENT '评论人',
    `gmt_create` BIGINT(24) NOT NULL,
    `gmt_modified` BIGINT(24) NOT NULL,
    `like_count` BIGINT(20) NOT NULL DEFAULT 0 COMMENT '点赞数',
    `content` VARCHAR(1024) NOT NULL COMMENT '回复内容',
    `comment_count` int(11) NOT NULL DEFAULT 0,
    PRIMARY KEY (`id`),
    CONSTRAINT `comment_user` FOREIGN KEY `comment` (`commentator`)
                              REFERENCES `user` (`id`)
                              ON DELETE CASCADE
                              ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- news
-- 新闻

CREATE TABLE `news` (
    `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
    `title` VARCHAR(128) NOT NULL COMMENT '新闻标题',
    `description` TEXT NOT NULL COMMENT '简单描述',
    `html` TEXT NOT NULL COMMENT '文本内容',
    `source` VARCHAR(16) NOT NULL COMMENT '来源',
    `link` VARCHAR(64) NOT NULL COMMENT '链接',
    `pub_date` TIMESTAMP NOT NULL COMMENT '发布日期',
    `view_count` INT(11) NOT NULL DEFAULT 0,
    `like_count` INT(11) NOT NULL DEFAULT 0,
    `comment_count` INT(11) NOT NULL DEFAULT 0,
    `gmt_latest_comment` BIGINT(24) NOT NULL,
    `status` INT(2) NOT NULL DEFAULT 1 COMMENT '状态',
    `columnname` INT(2) NOT NULL DEFAULT 0 COMMENT '专栏',
    `gmt_craete` BIGINT(24) NOT NULL,
    `gmt_modified` BIGINT(24) NOT NULL,
    `tags` VARCHAR(256),
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- advertisement
-- 新闻

CREATE TABLE `advertisement` (
    `id` BIGINT(11) NOT NULL AUTO_INCREMENT,
    `title` VARCHAR(256) DEFAULT NULL COMMENT '广告标题',
    `url` VARCHAR(512) DEFAULT NULL COMMENT '广告链接',
    `image` VARCHAR(256) DEFAULT NULL COMMENT '广告图片',
    `gmt_start` BIGINT(24) NOT NULL,
    `gmt_end` BIGINT(24) NOT NULL,
    `gmt_create` BIGINT(24) NOT NULL,
    `gmt_modified` BIGINT(24) NOT NULL,
    `status` INT(11) NOT NULL,
    `position` VARCHAR(10) NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


COMMIT;