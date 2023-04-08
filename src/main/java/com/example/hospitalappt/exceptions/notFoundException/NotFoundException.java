package com.example.hospitalappt.exceptions.notFoundException;

public class NotFoundException extends Exception{

    private String resourceName;

    public NotFoundException() {
        super("Resource not found");
    }

    public NotFoundException(String message) {
        super(message);
    }

    public NotFoundException(String message, String resourceName) {
        super(message);
        this.resourceName = resourceName;
    }

    public String getResourceName() {
        return resourceName;
    }
}
