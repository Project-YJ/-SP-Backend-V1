package com.example.spbackendv1.global.error.exception;

import com.example.spbackendv1.global.error.ErrorCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class CustomException extends RuntimeException{

    private final ErrorCode errorCode;

}
