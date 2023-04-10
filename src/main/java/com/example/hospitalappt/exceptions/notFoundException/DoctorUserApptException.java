package com.example.hospitalappt.exceptions.notFoundException;

import com.example.hospitalappt.entities.DoctorUserAppt;

public class DoctorUserApptException extends NotFoundException {
    public DoctorUserApptException() {
        super(DoctorUserAppt.class.getSimpleName());
    }

    public DoctorUserApptException(String message) {
        super(message);
    }
}
