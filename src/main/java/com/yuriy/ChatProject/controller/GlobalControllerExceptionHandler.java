package com.yuriy.ChatProject.controller;

import com.yuriy.ChatProject.exception.DefaultError;
import com.yuriy.ChatProject.exception.user.UserNameAlreadyExistException;
import com.yuriy.ChatProject.exception.user.UserNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@Slf4j
@ControllerAdvice
public class GlobalControllerExceptionHandler {

    @ExceptionHandler(value = {UserNotFoundException.class})
    public ResponseEntity<DefaultError> handleUserNotFoundException(UserNotFoundException e) {
        log.error(e.getMessage(), e);
        return new ResponseEntity<>(new DefaultError(
                HttpStatus.NOT_FOUND.value(),
                e.getMessage()), HttpStatus.NOT_FOUND
        );
    }

    @ExceptionHandler(value = {UserNameAlreadyExistException.class})
    public ResponseEntity<DefaultError> handleUserAlreadyExistException(UserNameAlreadyExistException e) {
        log.error(e.getMessage(), e);
        return new ResponseEntity<>(new DefaultError(
                HttpStatus.FORBIDDEN.value(),
                e.getMessage()), HttpStatus.FORBIDDEN
        );
    }
}
