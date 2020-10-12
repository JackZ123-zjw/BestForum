package com.JackZ.BestForum.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PostCreateDTO {

    private Long creatorId;
    private String title;
    private String content;
    private String tags;
    private Integer column;
    private Integer permission;

}
