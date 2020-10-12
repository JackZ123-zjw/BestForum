package com.JackZ.BestForum.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserDTO {

    private Long id;
    private String accountId;
    private String email;
    private String qqAccountId;
    private String baiduAccountId;
    private String weiboAccountId;
    private String nickname;
    private String avatarUrl;
    private String phone;
    private Long gmtCreate;
    private Long gmtModified;
    private Integer rank;
    private Integer score;

}
