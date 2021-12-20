package com.example.spbackendv1.domain.user.api;

import com.example.spbackendv1.domain.user.api.dto.request.JoinRequest;
import com.example.spbackendv1.domain.user.api.dto.request.LoginRequest;
import com.example.spbackendv1.domain.user.api.dto.response.TokenResponse;
import com.example.spbackendv1.domain.user.service.JoinService;
import com.example.spbackendv1.domain.user.service.LoginService;
import com.example.spbackendv1.domain.user.service.ReissueService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("user")
public class UserController {

    private final JoinService joinService;
    private final LoginService loginService;
    private final ReissueService reissueService;
    
    @PostMapping
    public void join(@RequestBody JoinRequest joinRequest) {
        joinService.realize(joinRequest);
    }

    @PutMapping
    public TokenResponse login(@RequestBody LoginRequest loginRequest) {
        return loginService.realize(loginRequest);
    }

    @PatchMapping
    public TokenResponse reissue(@RequestParam("yj-refresh") String refreshToken) {
        return reissueService.realize(refreshToken);
    }
}
