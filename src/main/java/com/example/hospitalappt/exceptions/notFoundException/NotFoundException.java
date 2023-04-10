package com.example.hospitalappt.exceptions.notFoundException;

public class NotFoundException extends Exception{

    private String resourceName = "Resource";

    public NotFoundException() {
        super("Resource not found");
    }


    public NotFoundException(String resourceName) {
        super(resourceName + " not found");
        this.resourceName = resourceName;
    }
    public NotFoundException(String message, String resourceName) {
        super(message);
        this.resourceName = resourceName;
    }

    public String getResourceName() {
        return resourceName;
    }
}
