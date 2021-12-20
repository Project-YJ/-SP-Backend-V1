package com.example.spbackendv1.domain.user.facade;

import com.example.spbackendv1.domain.user.entity.User;
import com.example.spbackendv1.domain.user.exception.UserNotFoundByEmailException;
import com.example.spbackendv1.domain.user.exception.UserNotFoundByUseridException;
import com.example.spbackendv1.domain.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.regex.Pattern;

@RequiredArgsConstructor
@Component
public class UserFacade {

    private static final String pattern = "^[\\w\\.-]{1,64}@[\\w\\.-]{1,252}\\.\\w{2,4}$";

    private final UserRepository userRepository;

    public User getUserById(String id) {
        if(Pattern.matches(pattern, id))
            return getUserByEmail(id);
        return getUserByUserid(id);
    }

    public User getUserByEmail(String id) {
        return userRepository.findByEmail(id)
                .orElseThrow(() -> UserNotFoundByEmailException.EXCEPTION);
    }

    public User getUserByUserid(String id) {
        return userRepository.findById(id)
                .orElseThrow(() -> UserNotFoundByUseridException.EXCEPTION);
    }

}
