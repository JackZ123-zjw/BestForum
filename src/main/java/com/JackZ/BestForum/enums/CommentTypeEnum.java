package com.JackZ.BestForum.enums;

public enum CommentTypeEnum implements BaseEnum {

    REPLY_POST(1, "Reply Post"),
    REPLY_COMMENT(2, "ReplyComment");

    private Integer code;
    private String name;

    CommentTypeEnum(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    @Override
    public Integer getCode() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }

    public static Integer getCodeByName(String name) {
        for (CommentTypeEnum e : CommentTypeEnum.values()) {
            if (e.getName().equals(name)) {
                return e.getCode();
            }
        }
        return null;
    }

    public static String getNameByCode(Integer code) {
        for (CommentTypeEnum e : CommentTypeEnum.values()) {
            if (e.getCode() == code) {
                return e.getName();
            }
        }
        return null;
    }

    public static CommentTypeEnum getCommentTypeByCode(Integer code) {
        for (CommentTypeEnum e : CommentTypeEnum.values()) {
            if (e.getCode() == code) {
                return e;
            }
        }
        return null;
    }
}
