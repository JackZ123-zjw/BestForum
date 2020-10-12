package com.JackZ.BestForum.dto;

import com.JackZ.BestForum.Exception.CustomisedException;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResultDTO<T> {

    private Integer code;
    private String message;
    private T data;

    public static ResultDTO errorOf(Integer code, String message) {
        return ResultDTO.builder()
                .code(code)
                .message(message)
                .build();
    }

    public static ResultDTO errorOf(CustomisedException e) {
        return errorOf(e.getCode(), e.getMessage());
    }

    public static ResultDTO okOf() {
        return ResultDTO.builder()
                .code(200)
                .message("请求成功")
                .build();
    }

    public static <T> ResultDTO okOf(T t) {
        return ResultDTO.builder()
                .code(200)
                .message("请求成功")
                .data(t)
                .build();
    }
}
