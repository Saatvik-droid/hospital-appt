package com.example.hospitalappt.dao;

import com.example.hospitalappt.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {

}
