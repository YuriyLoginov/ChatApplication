package com.yuriy.ChatProject.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class DefaultError {
    private int statusCode;
    private String message;
}
