package com.example.hospitalappt.dao;


import com.example.hospitalappt.entities.Doctor;
import org.springframework.data.repository.CrudRepository;

public interface DoctorDao extends CrudRepository<Doctor, Long> {

}
