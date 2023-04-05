package com.example.hospitalappt.service;

import com.example.hospitalappt.entities.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> getUsers();

    Optional<User> getUserById(Long id);

    User createUser(User user);

    void deleteUser(Long id);
}
