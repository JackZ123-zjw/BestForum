package com.JackZ.BestForum.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class NotificationDTO {

    private Long id;
    private Long notifierId;
    private Long receiverId;
    private Long outerId;
    private String outerName;
    private Integer type;
    private Long gmtCreate;
    private Integer status;

}
