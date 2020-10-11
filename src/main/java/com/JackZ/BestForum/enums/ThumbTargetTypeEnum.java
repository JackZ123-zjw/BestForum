package com.JackZ.BestForum.enums;

/**
 * @author JackZ
 * @version 2020-10-11
 */
public enum ThumbTargetTypeEnum implements BaseEnum {

    POST(1, "Thumb post"),
    COMMENT(2, "Thumb comment"),
    SUB_COMMENT(3, "Thumb sub comment"),
    NEWS(4, "Thumb news");

    private Integer code;
    private String name;

    ThumbTargetTypeEnum(Integer code, String name) {
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
        for (ThumbTargetTypeEnum e : ThumbTargetTypeEnum.values()) {
            if (e.getName().equals(name)) {
                return e.getCode();
            }
        }
        return null;
    }

    public static String getNameByCode(Integer code) {
        for (ThumbTargetTypeEnum e : ThumbTargetTypeEnum.values()) {
            if (e.getCode() == code) {
                return e.getName();
            }
        }
        return null;
    }

    public static ThumbTargetTypeEnum getThumbTargetByCode(Integer code) {
        for (ThumbTargetTypeEnum e :ThumbTargetTypeEnum.values()) {
            if (e.getCode() == code) {
                return e;
            }
        }
        return null;
    }
}
