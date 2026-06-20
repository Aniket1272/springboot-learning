package com.example.crazycoder.interviewprep.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ArithmeticException.class)
    public String handleArithmeticException(ArithmeticException e) {
        return e.getMessage();
    }

    @ExceptionHandler(NullPointerException.class)
    public String handleNullPointerException(NullPointerException e) {
        return e.getMessage();
    }

    @ExceptionHandler(TestException.class)
    public String handleTestException(TestException e) {
        return e.getMessage();
    }
}
