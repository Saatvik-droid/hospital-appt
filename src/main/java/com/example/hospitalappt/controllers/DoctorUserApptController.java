package com.example.hospitalappt.controllers;

import com.example.hospitalappt.dao.DoctorUserApptDao;
import com.example.hospitalappt.dto.DoctorUserApptDto;
import com.example.hospitalappt.dtoConverters.DoctorUserApptConverter;
import com.example.hospitalappt.entities.DoctorUserAppt;
import com.example.hospitalappt.exceptions.notFoundException.DoctorUserApptException;
import com.example.hospitalappt.services.DoctorService;
import com.example.hospitalappt.services.DoctorUserApptService;
import com.example.hospitalappt.services.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DoctorUserApptController {
    @Autowired
    private DoctorUserApptService doctorUserApptService;

    @Autowired
    private DoctorService doctorService;

    @Autowired
    private UserService userService;
    @Autowired
    private DoctorUserApptDao doctorUserApptDao;

    @GetMapping("/appointment")
    public List<DoctorUserApptDto> getUsers() {
        return doctorUserApptService.getAppointments().stream().map(DoctorUserApptConverter::convert).toList();
    }

    @GetMapping("/appointment/{appointmentId}")
    public DoctorUserApptDto getAppointmentById(@PathVariable Long appointmentId) throws DoctorUserApptException {
        return DoctorUserApptConverter.convert(doctorUserApptService.getAppointmentById(appointmentId));
    }

    @PostMapping("/appointment")
    @ResponseStatus(HttpStatus.CREATED)
    public DoctorUserAppt createAppointment(@Valid @RequestBody DoctorUserApptDto doctorUserApptDto) {
        return doctorUserApptService.createAppointment(DoctorUserApptConverter.convert(doctorUserApptDto));
    }

    @DeleteMapping("/appointment/{appointmentId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteAppointment(@PathVariable Long appointmentId) {
        doctorUserApptService.deleteAppointment(appointmentId);
    }
}
