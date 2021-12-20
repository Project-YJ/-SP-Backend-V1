package com.example.spbackendv1.global.security.jwt;

import com.example.spbackendv1.domain.user.api.dto.response.TokenResponse;
import com.example.spbackendv1.domain.user.entity.RefreshToken;
import com.example.spbackendv1.domain.user.repository.RefreshTokenRepository;
import com.example.spbackendv1.global.security.setting.JwtProperties;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Date;

@RequiredArgsConstructor
@Component
public class JwtProvider {

    private final JwtProperties jwtProperties;
    private final RefreshTokenRepository refreshTokenRepository;

    public TokenResponse generateToken(String id) {
        String access = generateAccessToken(id);
        String refresh = generateRefreshToken(id);

        refreshTokenRepository.save(
                RefreshToken.builder()
                        .id(id)
                        .refreshToken(refresh)
                        .expiration(jwtProperties.getRefreshExp())
                        .build()
        );

        return new TokenResponse(access, refresh);
    }

    public String generateAccessToken(String id) {
        return Jwts.builder()
                .setSubject(id)
                .claim("type", "access")
                .signWith(SignatureAlgorithm.HS256, jwtProperties.getSecretKey())
                .setExpiration(
                        new Date(System.currentTimeMillis() + jwtProperties.getAccessExp() * 1000)
                )
                .setIssuedAt(new Date())
                .compact();
    }

    public String generateRefreshToken(String id) {
        return Jwts.builder()
                .setSubject(id)
                .claim("type", "refresh")
                .signWith(SignatureAlgorithm.HS256, jwtProperties.getSecretKey())
                .setExpiration(
                        new Date(System.currentTimeMillis() + jwtProperties.getRefreshExp() * 1000)
                )
                .setIssuedAt(new Date())
                .compact();
    }

}
