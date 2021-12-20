package com.example.spbackendv1.global.error.handler;

import com.example.spbackendv1.global.error.ErrorCode;
import com.example.spbackendv1.global.error.ErrorResponse;
import com.example.spbackendv1.global.error.exception.CustomException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(CustomException.class)
    public ResponseEntity<ErrorResponse> handleGlobal(CustomException e) {
        final ErrorCode errorCode = e.getErrorCode();
        return new ResponseEntity<>(
                new ErrorResponse(errorCode.getMessage()), HttpStatus.valueOf(errorCode.getStatus())
        );
    }
}
