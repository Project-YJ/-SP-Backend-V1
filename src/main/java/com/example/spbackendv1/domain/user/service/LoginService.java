package com.example.spbackendv1.domain.user.service;

import com.example.spbackendv1.domain.user.api.dto.request.LoginRequest;
import com.example.spbackendv1.domain.user.entity.User;
import com.example.spbackendv1.domain.user.exception.InvalidPasswordException;
import com.example.spbackendv1.domain.user.facade.UserFacade;
import com.example.spbackendv1.global.security.jwt.JwtProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class LoginService {

    private final PasswordEncoder passwordEncoder;
    private final JwtProvider jwtProvider;
    private final UserFacade userFacade;

    public void realize(LoginRequest loginRequest) {

        User user = userFacade.getUserById(loginRequest.getId());
        if( passwordEncoder.matches(loginRequest.getPassword(), user.getPassword()) )
            throw InvalidPasswordException.EXCEPTION;

        jwtProvider.generateToken(loginRequest.getId());
    }
}
