package com.example.hospitalappt.controller;

import com.example.hospitalappt.entities.Doctor;
import com.example.hospitalappt.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class HomeController {
    @Autowired
    private DoctorService doctorService;

    @GetMapping("/")
    public String home() {
        return "Hello";
    }

    @GetMapping("/doctors")
    public List<Doctor> getDoctors() {
        return doctorService.getDoctors();
    }

    @GetMapping("/doctors/{doctorId}")
    public Optional<Doctor> getDoctor(@PathVariable Long doctorId){
        return doctorService.getDoctorById(doctorId);
    }

    @PostMapping("/doctors")
    public Doctor createDoctor(@RequestBody Doctor doctor){
        return doctorService.createDoctor(doctor);
    }
}
