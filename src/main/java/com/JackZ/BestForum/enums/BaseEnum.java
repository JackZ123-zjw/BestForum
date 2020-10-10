package com.JackZ.BestForum.enums;

public interface BaseEnum {

    Integer getCode();
    String getName();
    Integer getCodeByName(String name);
    String getNameByCode(Integer code);
}
