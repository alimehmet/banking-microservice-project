package com.bankingproject.microservice.repository;

import com.bankingproject.microservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
