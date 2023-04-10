package com.example.hospitalappt.services;

import com.example.hospitalappt.dao.DoctorUserApptDao;
import com.example.hospitalappt.entities.DoctorUserAppt;
import com.example.hospitalappt.exceptions.notFoundException.DoctorUserApptException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorUserApptServiceImpl implements DoctorUserApptService{
    @Autowired
    private DoctorUserApptDao doctorUserApptDao;

    @Override
    public List<DoctorUserAppt> getAppointments() {
        return (List<DoctorUserAppt>) doctorUserApptDao.findAll();
    }

    @Override
    public DoctorUserAppt getAppointmentById(Long id) throws DoctorUserApptException {
        return doctorUserApptDao.findById(id).orElseThrow(DoctorUserApptException::new);
    }

    @Override
    public DoctorUserAppt createAppointment(DoctorUserAppt doctorUserAppt) {
        return doctorUserApptDao.save(doctorUserAppt);
    }

    @Override
    public void deleteAppointment(Long id) {
        doctorUserApptDao.deleteById(id);

    }
}
