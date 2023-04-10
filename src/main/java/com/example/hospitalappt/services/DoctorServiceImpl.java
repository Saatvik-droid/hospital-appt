package com.example.hospitalappt.services;

import com.example.hospitalappt.dao.DoctorDao;
import com.example.hospitalappt.entities.Doctor;
import com.example.hospitalappt.exceptions.notFoundException.DoctorNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorServiceImpl implements DoctorService {
    @Autowired
    private DoctorDao doctorDao;

    @Override
    public List<Doctor> getDoctors() {
        return (List<Doctor>) doctorDao.findAll();
    }

    public Doctor getDoctorById(Long id) throws DoctorNotFoundException{
        return doctorDao.findById(id).orElseThrow(DoctorNotFoundException::new);
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
