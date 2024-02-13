package com.yuriy.EnglishLearnProject.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class UserExceptionHandler {
    @ExceptionHandler(value = {UserNotFoundException.class})
    public UserException handleUserNotFoundException(UserNotFoundException userNotFoundException) {
        return new UserException(
                userNotFoundException.getMessage(),
                userNotFoundException.getCause(),
                HttpStatus.NOT_FOUND
        );
    }

    @ExceptionHandler(value = {UserAlreadyExistException.class})
    public UserException handleUserAlreadyExistException(UserAlreadyExistException userAlreadyExistException) {
        return new UserException(
                userAlreadyExistException.getMessage(),
                userAlreadyExistException.getCause(),
                HttpStatus.BAD_REQUEST
        );
    }
}
