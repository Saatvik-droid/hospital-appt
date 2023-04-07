package com.example.hospitalappt.services;

import com.example.hospitalappt.dao.DoctorDao;
import com.example.hospitalappt.entities.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorServiceImpl implements DoctorService {
    @Autowired
    private DoctorDao doctorDao;

    @Override
    public List<Doctor> getDoctors() {
        return doctorDao.findAll();
    }

    public Optional<Doctor> getDoctorById(Long id) {
        return doctorDao.findById(id);
    }

    @Override
    public Doctor createDoctor(Doctor doctor) {
        return doctorDao.save(doctor);
    }

    @Override
    public void deleteDoctor(Long id) {
        doctorDao.deleteById(id);
    }
}
