package com.example.microserviceCourse.Controller;

import com.example.microserviceCourse.service.UserService;
import com.example.microserviceCourse.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
public class userController {

    @Autowired
    UserService userService;


    @GetMapping(path = "users/get")
    public List<User> getAll() {
        return userService.getAllUser();
    }

    @PostMapping(path = "/newUser")
    public ResponseEntity<User> createUser(@RequestBody User users){
        userService.createUser(users);
        return ResponseEntity.created(null).build();
    }
    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }


}
