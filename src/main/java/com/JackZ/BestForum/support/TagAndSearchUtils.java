package com.JackZ.BestForum.support;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.stream.Collectors;

public class TagAndSearchUtils {


    public static String trimSearch(String search) {
        if (StringUtils.isNotBlank(search)) {
            String[] tags = StringUtils.split(search, ",");
            search = Arrays
                    .stream(tags)
                    .filter(StringUtils::isNotBlank)
                    .map(t -> t.replace("+", "").replace("+", "").replace("*", ""))
                    .filter(StringUtils::isNotBlank)
                    .collect(Collectors.joining("|"));
        }
        return search;
    }

}
