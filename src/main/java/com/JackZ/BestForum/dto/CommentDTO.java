package com.JackZ.BestForum.dto;

import com.JackZ.BestForum.model.User;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CommentDTO {

    private Long id;
    private Integer type;
    private Long parentId;
    private Long commentator;
    private Long gmtCreate;
    private Long gmtModified;
    private Integer likeCount;
    private Integer commentCount;
    private String content;
    private User user;

}
