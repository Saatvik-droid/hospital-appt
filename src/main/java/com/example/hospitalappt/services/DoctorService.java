package com.example.hospitalappt.services;

import com.example.hospitalappt.entities.Doctor;
import com.example.hospitalappt.exceptions.notFoundException.DoctorNotFoundException;

import java.util.List;

public interface DoctorService {
    List<Doctor> getDoctors();

    Doctor getDoctorById(Long id) throws DoctorNotFoundException;

    Doctor createDoctor(Doctor doctor);

    void deleteDoctor(Long id);
}
