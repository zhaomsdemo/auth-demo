package com.zhaomsdemo.research.authdemo.vo;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Result<T> {

    T data;
    int code;
    String message;

    public static <T> Result<T> success(T data) {
        return Result.<T>builder().data(data).build();
    }

    public static <T> Result<T> success(T data, String message) {
        return Result.<T>builder().data(data).code(200).message(message).build();
    }

    public static <T> Result<T> fail(String message) {
        return Result.<T>builder().code(500).message(message).build();
    }

    public static <T> Result<T> fail(int code, String message) {
        return Result.<T>builder().code(code).message(message).build();
    }

    public static <T> Result<T> fail(int code, String message, T data) {
        return Result.<T>builder().code(code).message(message).data(data).build();
    }

    public static <T> Result<T> fail(T data) {
        return Result.<T>builder().data(data).build();
    }

    public static <T> Result<T> fail(T data, String message) {
        return Result.<T>builder().data(data).code(500).message(message).build();
    }

    public static <T> Result<T> fail(T data, int code) {
        return Result.<T>builder().data(data).code(code).build();
    }

    public static <T> Result<T> fail(T data, int code, String message) {
        return Result.<T>builder().data(data).code(code).message(message).build();
    }
}
