package com.JackZ.BestForum.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserCreateDTO {

    private String accountId;
    private String password;
    private String nickname;

}
