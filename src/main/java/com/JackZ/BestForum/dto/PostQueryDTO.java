package com.JackZ.BestForum.dto;

import lombok.Data;

@Data
public class PostQueryDTO {

    private String search;
    private String sort;
    private Long time;
    private String tags;
    private Integer page;
    private Integer size;

}
