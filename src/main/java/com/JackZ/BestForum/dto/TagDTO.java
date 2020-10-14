package com.JackZ.BestForum.dto;

import lombok.Data;

import java.util.List;

@Data
public class TagDTO {

    private String categoryName;
    private List<String> tags;
}
