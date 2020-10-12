package com.JackZ.BestForum.Exception;

public class CustomisedException extends RuntimeException implements ICustomizedErrorCode {

    private String message;
    private Integer code;

    public CustomisedException(CustomisedErrorCode e) {
        this.message = e.getMessage();
        this.code = e.getCode();
    }

    @Override
    public String getMessage() {
        return null;
    }

    @Override
    public Integer getCode() {
        return null;
    }
}
