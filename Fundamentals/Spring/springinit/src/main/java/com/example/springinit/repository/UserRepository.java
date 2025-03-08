package com.example.springinit.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.springinit.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
