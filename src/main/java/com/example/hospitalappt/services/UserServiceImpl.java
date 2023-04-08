package com.example.hospitalappt.services;

import com.example.hospitalappt.dao.UserDao;
import com.example.hospitalappt.entities.User;
import com.example.hospitalappt.exceptions.notFoundException.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getUsers() {
        return userDao.findAll();
    }

    @Override
    public Optional<User> getUserById(Long id) throws UserNotFoundException {
        return Optional.ofNullable(userDao.findById(id).orElseThrow(UserNotFoundException::new));
    }

    @Override
    public User createUser(User user) {
        return userDao.save(user);
    }

    @Override
    public void deleteUser(Long id) {
        userDao.deleteById(id);
    }
}
