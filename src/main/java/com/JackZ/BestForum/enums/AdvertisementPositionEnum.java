package com.JackZ.BestForum.enums;

public enum AdvertisementPositionEnum implements BaseEnum{

    AD_NAV(1, "At Navigation"),
    AD_SIDE(2, "At side"),
    AD_FOOTER(3, "At footer"),
    AD_HEADER(4, "At Header");

    private Integer code;
    private String name;

    AdvertisementPositionEnum(Integer code, String name) {
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
        for (AdvertisementPositionEnum e : AdvertisementPositionEnum.values()) {
            if (e.getName().equals(name)) {
                return e.getCode();
            }
        }
        return null;
    }

    public static String getNameByCode(Integer code) {
        for (AdvertisementPositionEnum e : AdvertisementPositionEnum.values()) {
            if (e.getCode() == code) {
                return e.getName();
            }
        }
        return null;
    }

    public static AdvertisementPositionEnum getAdvertisementPositionByCode(Integer code) {
        for (AdvertisementPositionEnum e : AdvertisementPositionEnum.values()) {
            if (e.getCode() == code) {
                return e;
            }
        }
        return null;
    }
}
