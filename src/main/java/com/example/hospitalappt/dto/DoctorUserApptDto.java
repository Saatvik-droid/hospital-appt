package com.example.hospitalappt.dto;

public class DoctorUserApptDto {
    public Long id;
    public Long doctor_id;
    public Long user_id;

    public DoctorUserApptDto(Long id, Long doctor_id, Long user_id) {
        this.id = id;
        this.doctor_id = doctor_id;
        this.user_id = user_id;
    }

    public DoctorUserApptDto() {
    }
}
