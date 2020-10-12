package com.JackZ.BestForum.model;

public class Post {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column post.id
     *
     * @mbg.generated Mon Oct 12 17:03:04 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column post.title
     *
     * @mbg.generated Mon Oct 12 17:03:04 CST 2020
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column post.gmt_create
     *
     * @mbg.generated Mon Oct 12 17:03:04 CST 2020
     */
    private Long gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column post.gmt_modified
     *
     * @mbg.generated Mon Oct 12 17:03:04 CST 2020
     */
    private Long gmtModified;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column post.creator_id
     *
     * @mbg.generated Mon Oct 12 17:03:04 CST 2020
     */
    private Long creatorId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column post.comment_count
     *
     * @mbg.generated Mon Oct 12 17:03:04 CST 2020
     */
    private Integer commentCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column post.like_count
     *
     * @mbg.generated Mon Oct 12 17:03:04 CST 2020
     */
    private Integer likeCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column post.view_count
     *
     * @mbg.generated Mon Oct 12 17:03:04 CST 2020
     */
    private Integer viewCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column post.gmt_latest_comment
     *
     * @mbg.generated Mon Oct 12 17:03:04 CST 2020
     */
    private Long gmtLatestComment;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column post.status
     *
     * @mbg.generated Mon Oct 12 17:03:04 CST 2020
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column post.columnname
     *
     * @mbg.generated Mon Oct 12 17:03:04 CST 2020
     */
    private Integer columnname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column post.permission
     *
     * @mbg.generated Mon Oct 12 17:03:04 CST 2020
     */
    private Integer permission;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column post.tags
     *
     * @mbg.generated Mon Oct 12 17:03:04 CST 2020
     */
    private String tags;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column post.content
     *
     * @mbg.generated Mon Oct 12 17:03:04 CST 2020
     */
    private String content;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column post.id
     *
     * @return the value of post.id
     *
     * @mbg.generated Mon Oct 12 17:03:04 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column post.id
     *
     * @param id the value for post.id
     *
     * @mbg.generated Mon Oct 12 17:03:04 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column post.title
     *
     * @return the value of post.title
     *
     * @mbg.generated Mon Oct 12 17:03:04 CST 2020
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column post.title
     *
     * @param title the value for post.title
     *
     * @mbg.generated Mon Oct 12 17:03:04 CST 2020
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column post.gmt_create
     *
     * @return the value of post.gmt_create
     *
     * @mbg.generated Mon Oct 12 17:03:04 CST 2020
     */
    public Long getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column post.gmt_create
     *
     * @param gmtCreate the value for post.gmt_create
     *
     * @mbg.generated Mon Oct 12 17:03:04 CST 2020
     */
    public void setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column post.gmt_modified
     *
     * @return the value of post.gmt_modified
     *
     * @mbg.generated Mon Oct 12 17:03:04 CST 2020
     */
    public Long getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column post.gmt_modified
     *
     * @param gmtModified the value for post.gmt_modified
     *
     * @mbg.generated Mon Oct 12 17:03:04 CST 2020
     */
    public void setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column post.creator_id
     *
     * @return the value of post.creator_id
     *
     * @mbg.generated Mon Oct 12 17:03:04 CST 2020
     */
    public Long getCreatorId() {
        return creatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column post.creator_id
     *
     * @param creatorId the value for post.creator_id
     *
     * @mbg.generated Mon Oct 12 17:03:04 CST 2020
     */
    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column post.comment_count
     *
     * @return the value of post.comment_count
     *
     * @mbg.generated Mon Oct 12 17:03:04 CST 2020
     */
    public Integer getCommentCount() {
        return commentCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column post.comment_count
     *
     * @param commentCount the value for post.comment_count
     *
     * @mbg.generated Mon Oct 12 17:03:04 CST 2020
     */
    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column post.like_count
     *
     * @return the value of post.like_count
     *
     * @mbg.generated Mon Oct 12 17:03:04 CST 2020
     */
    public Integer getLikeCount() {
        return likeCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column post.like_count
     *
     * @param likeCount the value for post.like_count
     *
     * @mbg.generated Mon Oct 12 17:03:04 CST 2020
     */
    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column post.view_count
     *
     * @return the value of post.view_count
     *
     * @mbg.generated Mon Oct 12 17:03:04 CST 2020
     */
    public Integer getViewCount() {
        return viewCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column post.view_count
     *
     * @param viewCount the value for post.view_count
     *
     * @mbg.generated Mon Oct 12 17:03:04 CST 2020
     */
    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column post.gmt_latest_comment
     *
     * @return the value of post.gmt_latest_comment
     *
     * @mbg.generated Mon Oct 12 17:03:04 CST 2020
     */
    public Long getGmtLatestComment() {
        return gmtLatestComment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column post.gmt_latest_comment
     *
     * @param gmtLatestComment the value for post.gmt_latest_comment
     *
     * @mbg.generated Mon Oct 12 17:03:04 CST 2020
     */
    public void setGmtLatestComment(Long gmtLatestComment) {
        this.gmtLatestComment = gmtLatestComment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column post.status
     *
     * @return the value of post.status
     *
     * @mbg.generated Mon Oct 12 17:03:04 CST 2020
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column post.status
     *
     * @param status the value for post.status
     *
     * @mbg.generated Mon Oct 12 17:03:04 CST 2020
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column post.columnname
     *
     * @return the value of post.columnname
     *
     * @mbg.generated Mon Oct 12 17:03:04 CST 2020
     */
    public Integer getColumnname() {
        return columnname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column post.columnname
     *
     * @param columnname the value for post.columnname
     *
     * @mbg.generated Mon Oct 12 17:03:04 CST 2020
     */
    public void setColumnname(Integer columnname) {
        this.columnname = columnname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column post.permission
     *
     * @return the value of post.permission
     *
     * @mbg.generated Mon Oct 12 17:03:04 CST 2020
     */
    public Integer getPermission() {
        return permission;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column post.permission
     *
     * @param permission the value for post.permission
     *
     * @mbg.generated Mon Oct 12 17:03:04 CST 2020
     */
    public void setPermission(Integer permission) {
        this.permission = permission;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column post.tags
     *
     * @return the value of post.tags
     *
     * @mbg.generated Mon Oct 12 17:03:04 CST 2020
     */
    public String getTags() {
        return tags;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column post.tags
     *
     * @param tags the value for post.tags
     *
     * @mbg.generated Mon Oct 12 17:03:04 CST 2020
     */
    public void setTags(String tags) {
        this.tags = tags;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column post.content
     *
     * @return the value of post.content
     *
     * @mbg.generated Mon Oct 12 17:03:04 CST 2020
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column post.content
     *
     * @param content the value for post.content
     *
     * @mbg.generated Mon Oct 12 17:03:04 CST 2020
     */
    public void setContent(String content) {
        this.content = content;
    }
}