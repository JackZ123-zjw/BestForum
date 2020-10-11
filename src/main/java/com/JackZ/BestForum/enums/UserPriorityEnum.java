package com.JackZ.BestForum.enums;

public enum UserPriorityEnum implements BaseEnum {


    LEVEL_0(0, "LEVEL0"),
    LEVEL_1(1, "LEVEL1"),
    LEVEL_2(2, "LEVEL2"),
    LEVEL_3(3, "LEVEL3"),
    LEVEL_4(4, "LEVEL4"),
    LEVEL_5(5, "LEVEL5"),
    LEVEL_6(6, "LEVEL6"),
    ADMINISTRATOR(7, "ADMINISTRATOR");


    private Integer code;
    private String name;

    UserPriorityEnum(Integer code, String name) {
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
        for (UserPriorityEnum e : UserPriorityEnum.values()) {
            if (e.getName().equals(name)) {
                return e.getCode();
            }
        }
        return null;
    }

    public static String getNameByCode(Integer code) {
        for (UserPriorityEnum e : UserPriorityEnum.values()) {
            if (e.getCode() == code) {
                return e.getName();
            }
        }
        return null;
    }

    public static UserPriorityEnum getUsrPriorityByCode(Integer code) {
        for (UserPriorityEnum e : UserPriorityEnum.values()) {
            if (e.getCode() == code) {
                return e;
            }
        }
        return null;
    }
}
