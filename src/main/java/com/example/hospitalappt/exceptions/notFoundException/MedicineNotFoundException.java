package com.example.hospitalappt.exceptions.notFoundException;

import com.example.hospitalappt.entities.Medicine;

public class MedicineNotFoundException extends NotFoundException {

    public MedicineNotFoundException() {
        super(Medicine.class.getSimpleName());
    }

    public MedicineNotFoundException(String message) {
        super(message);
    }
}
