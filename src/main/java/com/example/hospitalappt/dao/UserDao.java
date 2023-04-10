package com.example.hospitalappt.dao;

import com.example.hospitalappt.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<User, Long> {

}
