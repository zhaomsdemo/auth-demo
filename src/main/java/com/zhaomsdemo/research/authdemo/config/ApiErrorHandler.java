package com.zhaomsdemo.research.authdemo.config;

import com.zhaomsdemo.research.authdemo.exception.NotFoundException;
import com.zhaomsdemo.research.authdemo.vo.Result;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApiErrorHandler {

    @ExceptionHandler(NotFoundException.class)
    public Result handleNotFoundException(NotFoundException e) {
        return Result.fail(e.getMessage());
    }
}
