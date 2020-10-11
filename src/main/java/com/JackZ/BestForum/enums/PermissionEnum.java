package com.JackZ.BestForum.enums;

/**
 * @author JackZ
 * @version 2020-10-10
 */
public enum PermissionEnum implements BaseEnum {

    NO_PERMISSION(0, "NO PERMISSION"),
    NO_COMMERCIAL(1, "NO COMMERCIAL"),
    ANY_PERMITTED(2, "ALL PERMISSION");

    private Integer code;
    private String name;

    PermissionEnum(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    @Override
    public Integer getCode() {
        return this.code;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public static Integer getCodeByName(String name) {
        for (PermissionEnum e : PermissionEnum.values()) {
            if (e.getName().equals(name)) {
                return e.getCode();
            }
        }
        return null;
    }

    public static String getNameByCode(Integer code) {
        for (PermissionEnum e : PermissionEnum.values()) {
            if (e.getCode() == code) {
                return e.getName();
            }
        }
        return null;
    }

    public static PermissionEnum getPermissionByCode(Integer code) {
        for (PermissionEnum e : PermissionEnum.values()) {
            if (e.getCode() == code) {
                return e;
            }
        }
        return null;
    }
}
