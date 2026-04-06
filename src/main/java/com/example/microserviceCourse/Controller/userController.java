package com.example.microserviceCourse.Controller;

import com.example.microserviceCourse.service.UserService;
import com.example.microserviceCourse.service.UserServiceImp;
import com.example.microserviceCourse.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class userController {

    @Autowired
    UserService userService;


    @GetMapping(path = "users/get")
    public List<User> getAll() {
        return userService.getAllUser();
    }

}
