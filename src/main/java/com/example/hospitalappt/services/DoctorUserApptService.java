package com.example.hospitalappt.services;

import com.example.hospitalappt.entities.DoctorUserAppt;
import com.example.hospitalappt.exceptions.notFoundException.DoctorUserApptException;

import java.util.List;

public interface DoctorUserApptService {
    List<DoctorUserAppt> getAppointments();

    DoctorUserAppt getAppointmentById(Long id) throws DoctorUserApptException;

    DoctorUserAppt createAppointment(DoctorUserAppt doctorUserAppt);

    void deleteAppointment(Long id);
}
