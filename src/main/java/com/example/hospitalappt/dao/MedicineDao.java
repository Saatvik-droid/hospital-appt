package com.example.hospitalappt.dao;

import com.example.hospitalappt.entities.Medicine;
import org.springframework.data.repository.CrudRepository;

public interface MedicineDao extends CrudRepository<Medicine, Long> {
}
