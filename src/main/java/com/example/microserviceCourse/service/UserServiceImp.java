package com.example.microserviceCourse.service;

import com.example.microserviceCourse.repository.UserRepository;
import com.example.microserviceCourse.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class UserServiceImp implements UserService {
    @Autowired
    UserRepository userRepository;

    List<User> users = new ArrayList<>();

    @Override
    public User createUser(User user) {
      userRepository.save(user);
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

    @Override
    public void deleteUser(Long id) {
        if (!userRepository.existsById(id)) {
            throw new RuntimeException("user not found " + id);
        }

        userRepository.deleteById(id);
    }


}

