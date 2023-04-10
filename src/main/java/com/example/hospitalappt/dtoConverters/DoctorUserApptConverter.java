package com.example.hospitalappt.dtoConverters;

import com.example.hospitalappt.dto.DoctorUserApptDto;
import com.example.hospitalappt.entities.Doctor;
import com.example.hospitalappt.entities.DoctorUserAppt;
import com.example.hospitalappt.entities.User;

public class DoctorUserApptConverter {
    public static DoctorUserAppt convert(DoctorUserApptDto doctorUserApptDto) {
        Doctor doctor = new Doctor();
        doctor.setId(doctorUserApptDto.doctor_id);
        User user = new User();
        user.setId(doctorUserApptDto.user_id);
        DoctorUserAppt doctorUserAppt = new DoctorUserAppt();
        doctorUserAppt.setDoctor(doctor);
        doctorUserAppt.setUser(user);
        return doctorUserAppt;
    }

    public static DoctorUserApptDto convert(DoctorUserAppt doctorUserAppt) {
        return new DoctorUserApptDto(doctorUserAppt.getId(), doctorUserAppt.getDoctor().getId(), doctorUserAppt.getUser().getId());
    }
}
