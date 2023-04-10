package com.example.hospitalappt.exceptions.notFoundException;

import com.example.hospitalappt.entities.Doctor;

public class DoctorNotFoundException extends NotFoundException {

    public DoctorNotFoundException() {
        super(Doctor.class.getSimpleName());
    }

    public DoctorNotFoundException(String message) {
        super(message);
    }
}
