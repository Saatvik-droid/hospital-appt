package com.example.hospitalappt.services;

import com.example.hospitalappt.entities.Medicine;
import com.example.hospitalappt.exceptions.notFoundException.MedicineNotFoundException;

import java.util.List;

public interface MedicineService {
    List<Medicine> getMedicines();

    Medicine getMedicineById(Long id) throws MedicineNotFoundException;

    Medicine createMedicine(Medicine medicine);

    void deleteMedicine(Long id);
}
