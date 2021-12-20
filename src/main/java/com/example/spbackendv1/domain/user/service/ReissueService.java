package com.example.spbackendv1.domain.user.service;

import com.example.spbackendv1.domain.user.api.dto.response.TokenResponse;
import com.example.spbackendv1.global.security.jwt.JwtProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ReissueService {

    private final JwtProvider jwtProvider;

    public TokenResponse realize(String refreshToken) {
        return jwtProvider.reissue(refreshToken);
    }
}
