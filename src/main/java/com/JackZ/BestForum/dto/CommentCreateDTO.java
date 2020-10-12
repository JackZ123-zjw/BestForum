package com.JackZ.BestForum.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CommentCreateDTO {

    private Long commentator;
    private Long parentId;
    private String content;
    private Integer type;
}
