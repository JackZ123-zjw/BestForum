package com.JackZ.BestForum.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FileDTO {

    private int success;
    private String message;
    private String url;

}
