package com.JackZ.BestForum.enums;

/**
 * @author JackZ
 * @version 2020-10-11
 */
public enum NotificationStatusEnum implements BaseEnum {

    UNREAD(0, "UNREAD"),
    READ(1, "READ");

    private Integer code;
    private String name;

    NotificationStatusEnum(Integer code, String name) {
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
        for (NotificationStatusEnum e : NotificationStatusEnum.values()) {
            if (e.getName().equals(name)) {
                return e.getCode();
            }
        }
        return null;
    }

    public static String getNameByCode(Integer code) {
        for (NotificationStatusEnum e : NotificationStatusEnum.values()) {
            if (e.getCode() == code) {
                return e.getName();
            }
        }
        return null;
    }

    public static NotificationStatusEnum getNotificationStatusByCode(Integer code) {
        for (NotificationStatusEnum e : NotificationStatusEnum.values()) {
            if (e.getCode() == code) {
                return e;
            }
        }
        return null;
    }
}
