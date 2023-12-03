package dev.nanosync.spring3securityextras.entity.dto.register;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserRegisterResponse {
    private String accessToken;
    private String refreshToken;
}
