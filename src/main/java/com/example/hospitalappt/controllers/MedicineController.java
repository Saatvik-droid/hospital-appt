package com.example.hospitalappt.controllers;

import com.example.hospitalappt.entities.Medicine;
import com.example.hospitalappt.exceptions.notFoundException.MedicineNotFoundException;
import com.example.hospitalappt.services.MedicineService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MedicineController {
    @Autowired
    private MedicineService medicineservice;

    @GetMapping("/medicine")
    public List<Medicine> getMedicines() {
        return medicineservice.getMedicines();
    }


    @GetMapping("/medicine/{medicineId}")
    public Medicine getMedicineById(@PathVariable Long medicineId) throws MedicineNotFoundException {
        return medicineservice.getMedicineById(medicineId);
    }

    @PostMapping("/medicine")
    @ResponseStatus(HttpStatus.CREATED)
    public Medicine createMedicine(@Valid @RequestBody Medicine medicine) {
        return medicineservice.createMedicine(medicine);
    }

    @DeleteMapping("/medicine/{medicineId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteMedicine(@PathVariable Long medicineId) {
        medicineservice.deleteMedicine(medicineId);
    }

}
