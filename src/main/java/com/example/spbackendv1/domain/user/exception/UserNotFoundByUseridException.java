package com.example.spbackendv1.domain.user.exception;

import com.example.spbackendv1.global.error.ErrorCode;
import com.example.spbackendv1.global.error.exception.CustomException;

public class UserNotFoundByUseridException extends CustomException {
    public static CustomException EXCEPTION =
            new UserNotFoundByUseridException();

    private UserNotFoundByUseridException() {
        super(ErrorCode.USER_NOT_FOUND_BY_USERID);
    }
}
