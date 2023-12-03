package dev.nanosync.spring3securityextras.entity.dto.register;

import dev.nanosync.spring3securityextras.entity.Role;
import lombok.Data;

@Data
public class UserRegisterRequest {
    private String email;
    private String password;
    private Role role;
}
