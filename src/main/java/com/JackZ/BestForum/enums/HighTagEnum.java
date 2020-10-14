package com.JackZ.BestForum.enums;

public enum HighTagEnum implements BaseEnum {

    PROGRAM_LANGUAGE(0, "开发语言"),
    PLATFORM_FRAMEWORK(1, "平台框架"),
    SERVERS(2, "服务器"),
    SQL(3, "数据库"),
    DEVELOPMENT_TOOLS(4, "开发工具");

    private Integer code;
    private String message;

    HighTagEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public Integer getCode() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }
}
