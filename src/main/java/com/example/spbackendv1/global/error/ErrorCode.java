package com.example.spbackendv1.global.error;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {

    USER_NOT_FOUND_BY_EMAIL(400, "User Not Found By Email"),
    USER_NOT_FOUND_BY_USERID(400, "User Not Found By Userid"),
    INVALID_PASSWORD(400, "User Not Found By Email"),
    ;

    private final int status;
    private final String message;
}
