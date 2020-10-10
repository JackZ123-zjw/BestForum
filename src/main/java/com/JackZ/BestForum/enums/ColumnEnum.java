package com.JackZ.BestForum.enums;

public enum ColumnEnum implements BaseEnum {

    ASK(1, "CONSULTING"),
    SHARE(2, "SHARE EXPERIENCE"),
    SUGGEST(3, "SUGGESTION"),
    CHAT(4, "CHAT FREELY"),
    NOTICE(5, "NOTICE"),
    NEWS(6, "NEWS"),
    OTHER(9, "OTHER");


    private Integer code;
    private String name;

    ColumnEnum(Integer code, String name) {
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

    @Override
    public Integer getCodeByName(String name) {
        for (ColumnEnum e : ColumnEnum.values()) {
            if (e.getName().equals(name)) {
                return e.getCode();
            }
        }
        return null;
    }

    @Override
    public String getNameByCode(Integer code) {
        for (ColumnEnum e : ColumnEnum.values()) {
            if (e.getCode() == code) {
                return e.getName();
            }
        }
        return null;
    }
}
