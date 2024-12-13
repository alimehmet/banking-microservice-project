package com.bankingproject.microservice.controller;

import com.bankingproject.microservice.model.User;
import com.bankingproject.microservice.service.UserService;
import org.springframework.web.bind.annotation.*;
import com.bankingproject.microservice.dto.UserDTO;

import java.util.List;

@RestController
@RequestMapping("/api/users") 
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.createUser(user); 
    }

    @GetMapping
    public List<UserDTO> getAllUsers() {
        return userService.getAllUsers();
    }
}
