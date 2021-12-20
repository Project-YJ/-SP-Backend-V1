package com.example.spbackendv1.global.error;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {

    USER_NOT_FOUND_BY_EMAIL(404, "User Not Found By Email"),
    USER_NOT_FOUND_BY_USERID(404, "User Not Found By Userid"),
    INVALID_PASSWORD(401, "Invalid Password"),

    INVALID_TOKEN(401, "Invalid Token"),
    EXPIRED_TOKEN(401, "Expired Token")
    ;

    private final int status;
    private final String message;
}
