package com.yuriy.ChatProject.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@AllArgsConstructor
public class UserException {
    private final String message;
    private final Throwable throwable;
    private final HttpStatus httpStatus;
}
