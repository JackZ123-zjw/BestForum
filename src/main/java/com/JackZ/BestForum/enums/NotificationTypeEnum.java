package com.JackZ.BestForum.enums;

/**
 * @author JackZ
 * @version 2020-10-11
 */
public enum NotificationTypeEnum implements BaseEnum{

    REPLY_POST(1, "Reply Post"),
    REPLY_COMMENT(2, "Reply comment"),
    FAVOURITE(3, "Favourite"),
    THUMB(4, "THUMB");

    private Integer code;
    private String name;

    NotificationTypeEnum(Integer code, String name) {
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
        for (NotificationTypeEnum e : NotificationTypeEnum.values()) {
            if (e.getName().equals(name)) {
                return e.getCode();
            }
        }
        return null;
    }

    public static String getNameByCode(Integer code) {
        for (NotificationTypeEnum e : NotificationTypeEnum.values()) {
            if (e.getCode() == code) {
                return e.getName();
            }
        }
        return null;
    }

    public static NotificationTypeEnum getNotificationTypeByCode(Integer code) {
        for (NotificationTypeEnum e : NotificationTypeEnum.values()) {
            if (e.getCode() == code) {
                return e;
            }
        }
        return null;
    }
}
