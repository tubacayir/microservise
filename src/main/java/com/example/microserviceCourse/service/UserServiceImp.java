package com.example.microserviceCourse.service;

import com.example.microserviceCourse.repository.UserRepository;
import com.example.microserviceCourse.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class UserServiceImp implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return user;
    }

    @Override
    public User getUserById(Long id) {
        return null;
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }
}
