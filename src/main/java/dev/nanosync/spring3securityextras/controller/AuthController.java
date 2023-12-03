package dev.nanosync.spring3securityextras.controller;

import dev.nanosync.spring3securityextras.entity.dto.login.UserLoginRequest;
import dev.nanosync.spring3securityextras.entity.dto.login.UserLoginResponse;
import dev.nanosync.spring3securityextras.entity.dto.register.UserRegisterRequest;
import dev.nanosync.spring3securityextras.entity.dto.register.UserRegisterResponse;
import dev.nanosync.spring3securityextras.service.AuthService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("v1/auth")
public class AuthController {

    private final AuthService service;

    public AuthController(AuthService service) {
        this.service = service;
    }


    @PostMapping("register")
    public ResponseEntity<UserRegisterResponse> register(
            @RequestBody UserRegisterRequest request
    ) {
        return ResponseEntity.ok(service.register(request));
    }
    @PostMapping("login")
    public ResponseEntity<UserLoginResponse> authenticate(
            @RequestBody UserLoginRequest request
    ) {
        return ResponseEntity.ok(service.authenticate(request));
    }

    @PostMapping("refresh")
    public void refreshToken(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws IOException {
        service.refreshToken(request, response);
    }
}
