package com.example.spbackendv1.domain.user.api;

import com.example.spbackendv1.domain.user.api.dto.request.JoinRequest;
import com.example.spbackendv1.domain.user.api.dto.request.LoginRequest;
import com.example.spbackendv1.domain.user.service.JoinService;
import com.example.spbackendv1.domain.user.service.LoginService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("user")
public class UserController {

    private final JoinService joinService;
    private final LoginService loginService;
    
    @PostMapping
    public void join(@RequestBody JoinRequest joinRequest) {
        joinService.realize(joinRequest);
    }

    @PutMapping
    public void login(@RequestBody LoginRequest loginRequest) {
        loginService.realize();
    }
}
