package com.example.hospitalappt.services;

import com.example.hospitalappt.entities.User;
import com.example.hospitalappt.exceptions.notFoundException.UserNotFoundException;

import java.util.List;

public interface UserService {
    List<User> getUsers();

    User getUserById(Long id) throws UserNotFoundException;

    User createUser(User user);

    void deleteUser(Long id);
}
