package com.example.hospitalappt.services;

import com.example.hospitalappt.entities.Doctor;

import java.util.List;
import java.util.Optional;

public interface DoctorService {
    List<Doctor> getDoctors();

    Optional<Doctor> getDoctorById(Long id);

    Doctor createDoctor(Doctor doctor);

    void deleteDoctor(Long id);
}
