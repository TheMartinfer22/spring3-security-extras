package dev.nanosync.spring3securityextras.entity.dto.login;

import lombok.Data;

@Data
public class UserLoginRequest {
    private String email;
    private String password;
}
