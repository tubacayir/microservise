package com.example.microserviceCourse.service;


import com.example.microserviceCourse.user.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public interface UserService {
    User createUser(User user);
    User getUserById(Long id);
    List<User> getAllUser();


}
