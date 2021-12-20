package com.example.spbackendv1.domain.user.exception;

import com.example.spbackendv1.global.error.ErrorCode;
import com.example.spbackendv1.global.error.exception.CustomException;

public class InvalidPasswordException extends CustomException {
    public static CustomException EXCEPTION =
            new InvalidPasswordException();

    private InvalidPasswordException() {
        super(ErrorCode.INVALID_PASSWORD);
    }
}
