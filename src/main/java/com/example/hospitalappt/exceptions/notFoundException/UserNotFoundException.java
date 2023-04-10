package com.example.hospitalappt.exceptions.notFoundException;

import com.example.hospitalappt.entities.User;

public class UserNotFoundException extends NotFoundException {
    public UserNotFoundException() {
        super(User.class.getSimpleName());
    }

    public UserNotFoundException(String message) {
        super(message, User.class.getSimpleName());
    }
}
