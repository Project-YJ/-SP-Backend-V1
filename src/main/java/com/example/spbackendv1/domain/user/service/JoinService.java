package com.example.spbackendv1.domain.user.service;

import com.example.spbackendv1.domain.user.api.dto.request.JoinRequest;
import com.example.spbackendv1.domain.user.entity.User;
import com.example.spbackendv1.domain.user.repository.UserJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class JoinService {

    private final UserJpaRepository userJpaRepository;

    public void realize(JoinRequest joinRequest) {
        userJpaRepository.save(new User(joinRequest));
    }
}
