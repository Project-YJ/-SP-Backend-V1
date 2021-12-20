package com.example.spbackendv1.global.security;

import com.example.spbackendv1.global.security.jwt.JwtFilter;
import com.example.spbackendv1.global.security.jwt.JwtProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.security.config.annotation.SecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.DefaultSecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@RequiredArgsConstructor
public class FilterConfig extends SecurityConfigurerAdapter<DefaultSecurityFilterChain, HttpSecurity> {

    private final JwtProvider jwtProvider;

    @Override
    public void configure(HttpSecurity security) {
        JwtFilter jwtFilter = new JwtFilter(jwtProvider);
        ExceptionFilter exceptionFilter = new ExceptionFilter();

        security.addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class);
        security.addFilterBefore(exceptionFilter, JwtFilter.class);
    }

}