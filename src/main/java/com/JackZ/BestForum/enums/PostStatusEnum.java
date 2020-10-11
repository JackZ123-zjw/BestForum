package com.JackZ.BestForum.enums;

public enum PostStatusEnum implements BaseEnum {

    NORMAL(0, "Normal Post"),
    DIGEST(1, "DIGEST POST"),
    TOP(2, "TOP POST"),
    DIGEST_AND_TOP(3, "DIGEST AND TOP POST");

    PostStatusEnum(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    private Integer code;
    private String name;

    @Override
    public Integer getCode() {
        return this.code;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public static Integer getCodeByName(String name) {
        for (PostStatusEnum e : PostStatusEnum.values()) {
            if (e.getName().equals(name)) {
                return e.getCode();
            }
        }
        return null;
    }

    public static String getNameByCode(Integer code) {
        for (PostStatusEnum e : PostStatusEnum.values()) {
            if (e.getCode() == code) {
                return e.getName();
            }
        }
        return null;
    }

    public static PostStatusEnum getPostStatusByCode(Integer code) {
        for (PostStatusEnum e : PostStatusEnum.values()) {
            if (e.getCode() == code) {
                return e;
            }
        }
        return null;
    }
}
