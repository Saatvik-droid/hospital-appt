package com.example.hospitalappt.services;

import com.example.hospitalappt.dao.MedicineDao;
import com.example.hospitalappt.entities.Medicine;
import com.example.hospitalappt.exceptions.notFoundException.MedicineNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicineServiceImpl implements MedicineService {
    @Autowired
    private MedicineDao medicineDao;

    @Override
    public List<Medicine> getMedicines() {
        return (List<Medicine>) medicineDao.findAll();
    }

    @Override
    public Medicine getMedicineById(Long id) throws MedicineNotFoundException {
        return medicineDao.findById(id).orElseThrow(MedicineNotFoundException::new);
    }

    @Override
    public Medicine createMedicine(Medicine medicine) {
        return medicineDao.save(medicine);
    }

    @Override
    public void deleteMedicine(Long id) {
        medicineDao.deleteById(id);
    }
}
