package com.yuriy.ChatProject.exception.user;

public class UserNameAlreadyExistException extends RuntimeException {

    public UserNameAlreadyExistException(String message) {
        super(message);
    }

    public UserNameAlreadyExistException(String message, Throwable cause) {
        super(message, cause);
    }
}
