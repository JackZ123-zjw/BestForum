package com.JackZ.BestForum.dto;

import com.JackZ.BestForum.model.User;
import lombok.Data;

@Data
public class PostDTO {

    private Long id;
    private String title;
    private String content;
    private Long gmtCreate;
    private Long gmtModified;
    private Long lastComment;
    private User user;
    private Integer likeCount;
    private Integer viewCount;
    private Integer commentCount;
    private Integer status;
    private Integer column;
    private Integer permission;
    private String tags;

}
