package com.JackZ.BestForum.enums;

public enum UserPriorityEnum implements BaseEnum {


    LEVEL_0(0, "LEVEL0", 0, 99),
    LEVEL_1(1, "LEVEL1", 100, 199),
    LEVEL_2(2, "LEVEL2", 200, 399),
    LEVEL_3(3, "LEVEL3", 400, 799),
    LEVEL_4(4, "LEVEL4", 800, 1599),
    LEVEL_5(5, "LEVEL5", 1600, 3199),
    LEVEL_6(6, "LEVEL6", 3200, Integer.MAX_VALUE),
    ADMINISTRATOR(7, "ADMINISTRATOR", -1, -1);


    private Integer code;
    private String name;
    private Integer minScore;
    private Integer maxScore;

    UserPriorityEnum(Integer code, String name, Integer minScore, Integer maxScore) {
        this.code = code;
        this.name = name;
        this.minScore = minScore;
        this.maxScore = maxScore;
    }

    @Override
    public Integer getCode() {
        return this.code;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public Integer getMinScore() {return this.minScore;}

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

    public static Integer getMinScoreByLevel(String level) {
        for (UserPriorityEnum e : UserPriorityEnum.values()) {
            if (e.getName().equals(level)) return e.getMinScore();
        }
        return 0;
    }

    public static Integer getLevelByScore(Integer score) {
        for (UserPriorityEnum e : UserPriorityEnum.values()) {
            if (score >= e.getMinScore() && score <= e.getMinScore()) return e.getCode();
        }
        return null;
    }
}
