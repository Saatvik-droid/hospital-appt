package com.example.hospitalappt.dao;

import com.example.hospitalappt.entities.DoctorUserAppt;
import org.springframework.data.repository.CrudRepository;

public interface DoctorUserApptDao extends CrudRepository<DoctorUserAppt, Long> {
}
