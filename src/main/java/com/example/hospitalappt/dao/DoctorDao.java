package com.example.hospitalappt.dao;


import com.example.hospitalappt.entities.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorDao extends JpaRepository<Doctor, Long> {

}
