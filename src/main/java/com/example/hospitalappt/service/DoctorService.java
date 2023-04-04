package com.example.hospitalappt.service;

import com.example.hospitalappt.entities.Doctor;

import java.util.List;
import java.util.Optional;

public interface DoctorService {
     List<Doctor> getDoctors();

     Optional<Doctor> getDoctorById(long id);

     Doctor createDoctor(Doctor doctor);

     void deleteDoctor(long id);
}
