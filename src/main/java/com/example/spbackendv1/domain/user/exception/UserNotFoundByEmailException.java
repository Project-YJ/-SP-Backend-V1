package com.example.spbackendv1.domain.user.exception;

import com.example.spbackendv1.global.error.ErrorCode;
import com.example.spbackendv1.global.error.exception.CustomException;

public class UserNotFoundByEmailException extends CustomException {
    public static CustomException EXCEPTION =
            new UserNotFoundByEmailException();

    private UserNotFoundByEmailException() {
        super(ErrorCode.USER_NOT_FOUND_BY_EMAIL);
    }
}
