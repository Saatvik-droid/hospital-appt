package com.example.hospitalappt.errorHandling;

import com.example.hospitalappt.exceptions.notFoundException.UserNotFoundException;
import jakarta.validation.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ApplicationErrorHandler {

    @ExceptionHandler(ConstraintViolationException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Map<String, String> ConstraintViolationExceptionHandler(ConstraintViolationException exception) {
        Map<String, String> errorMapping = new HashMap<>();
        exception.getConstraintViolations().forEach(error -> errorMapping.put(error.getPropertyPath().toString(), error.getMessage()));
        return errorMapping;
    }

    @ExceptionHandler(UserNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Map<String, String> UserNotFoundExceptionHandler(UserNotFoundException exception) {
        Map<String, String> errorMapping = new HashMap<>();
        errorMapping.put(exception.getResourceName(), exception.getMessage());
        return errorMapping;
    }

}
