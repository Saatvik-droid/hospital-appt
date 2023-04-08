package com.example.hospitalappt.exceptions.notFoundException;

public class UserNotFoundException extends NotFoundException {
    public UserNotFoundException() {
        super("User not found", "User");
    }

    public UserNotFoundException(String message) {
        super(message, "User");
    }
}
