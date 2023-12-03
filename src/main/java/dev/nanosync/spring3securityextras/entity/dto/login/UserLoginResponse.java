package dev.nanosync.spring3securityextras.entity.dto.login;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserLoginResponse {
    private String accessToken;
    private String refreshToken;
}
