package com.example.spbackendv1.global.security.exception;

import com.example.spbackendv1.global.error.ErrorCode;
import com.example.spbackendv1.global.error.exception.CustomException;

public class ExpiredTokenException extends CustomException {

    public static CustomException EXCEPTION =
            new ExpiredTokenException();

    private ExpiredTokenException() {
        super(ErrorCode.EXPIRED_TOKEN);
    }
}
