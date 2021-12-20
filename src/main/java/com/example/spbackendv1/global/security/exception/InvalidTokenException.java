package com.example.spbackendv1.global.security.exception;

import com.example.spbackendv1.global.error.ErrorCode;
import com.example.spbackendv1.global.error.exception.CustomException;

public class InvalidTokenException extends CustomException {
    public static CustomException EXCEPTION =
            new InvalidTokenException();

    private InvalidTokenException() {
        super(ErrorCode.EXPIRED_TOKEN);
    }
}
