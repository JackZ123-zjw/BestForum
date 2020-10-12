package com.JackZ.BestForum.enums;

public enum SortEnum {

    HOT,
    HOT30,
    HOT7,
    NO,
    NEW,
    GOOD;

    public static Long getLatestTimeBySortEnum(SortEnum sortEnum) {
        if (sortEnum.equals(HOT7)) {
            return System.currentTimeMillis() - 1000L * 60 * 60 * 24 * 7;
        }
        if (sortEnum.equals(HOT30)) {
            return System.currentTimeMillis() - 1000L * 60 * 60 * 24 * 30;
        }
        return System.currentTimeMillis();
    }
}
