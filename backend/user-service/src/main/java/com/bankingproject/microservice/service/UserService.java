package com.bankingproject.microservice.service;

import com.bankingproject.microservice.model.User;
import com.bankingproject.microservice.repository.UserRepository;
import org.springframework.stereotype.Service;
import com.bankingproject.microservice.dto.UserDTO;

import java.util.List;
import java.util.stream.Collectors; // Burada Collectors içe aktarıldı

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public List<UserDTO> getAllUsers() {
        return userRepository.findAll().stream()
            .map(user -> new UserDTO(user.getUsername(), user.getEmail())) // DTO dönüşümü
            .collect(Collectors.toList());
    }
}
