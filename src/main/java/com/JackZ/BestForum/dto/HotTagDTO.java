package com.JackZ.BestForum.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class HotTagDTO implements Comparable<Object> {

    private String name;
    private Integer priority;

    @Override
    public int compareTo(Object o) {
        return this.getPriority() - ((HotTagDTO) o).getPriority();
    }
}
