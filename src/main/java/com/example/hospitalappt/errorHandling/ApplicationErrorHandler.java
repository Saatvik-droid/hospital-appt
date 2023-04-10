package com.example.hospitalappt.errorHandling;

import com.example.hospitalappt.exceptions.notFoundException.DoctorNotFoundException;
import com.example.hospitalappt.exceptions.notFoundException.NotFoundException;
import com.example.hospitalappt.exceptions.notFoundException.UserNotFoundException;
import jakarta.validation.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ApplicationErrorHandler {

    @ExceptionHandler(ConstraintViolationException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Map<String, String> handleConstraintViolationException(ConstraintViolationException exception) {
        Map<String, String> errorMapping = new HashMap<>();
        exception.getConstraintViolations().forEach(error -> errorMapping.put(error.getPropertyPath().toString(), error.getMessage()));
        return errorMapping;
    }

    @ExceptionHandler(NotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Map<String, String> handleNotFoundException(NotFoundException exception) {
        Map<String, String> errorMapping = new HashMap<>();
        errorMapping.put(exception.getResourceName(), exception.getMessage());
        return errorMapping;
    }

    @ExceptionHandler(SQLIntegrityConstraintViolationException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Map<String, String> handleForeignKeyException(SQLIntegrityConstraintViolationException exception) throws NotFoundException {
        String msg = exception.getMessage();
        if (msg.contains("doctor_id")) {
            return handleNotFoundException(new DoctorNotFoundException());
        } else if (msg.contains("user_id")) {
            return handleNotFoundException(new UserNotFoundException());
        } else {
            return handleNotFoundException(new NotFoundException());
        }
    }
}
