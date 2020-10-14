package com.JackZ.BestForum.Exception;


public enum CustomisedErrorCode implements ICustomizedErrorCode{

    USER_NOT_FOUND(2001, "用户不存在"),
    POST_NOT_FOUND(2002, "帖子不存在"),
    CREATOR_NOT_MATCH(2003, "用户不匹配"),
    CATEGORY_NOT_FOUND(2004, "分类不存在");


    private String message;
    private Integer code;

    CustomisedErrorCode(Integer code, String message) {
        this.message = message;
        this.code = code;
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
