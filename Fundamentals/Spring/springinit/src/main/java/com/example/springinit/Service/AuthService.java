package com.example.springinit.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.example.springinit.model.User;
import com.example.springinit.repository.UserRepository;
import com.example.springinit.security.JwtUtil;

@Component
public class AuthService {
    private final UserRepository userRepository;
    private final JwtUtil jwtUtil;
    private final PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
    
    @Autowired
    public AuthService(UserRepository userRepository, JwtUtil jwtUtil) {
        this.userRepository = userRepository;
        this.jwtUtil = jwtUtil;
    }

    public String registerUser(String  username, String password){
        if (userRepository.findByUsername(username).isPresent()){
            throw new RuntimeException("User already exists");
        }

        User user = new User(username, passwordEncoder.encode(password));
        userRepository.save(user);
        return "user created successfully !!"; 
    }

    public String authenticateUser(String username, String password){
        Optional<User> user = userRepository.findByUsername(username);

        if (user.isPresent()) {
            User u = user.get();
            if (passwordEncoder.matches(password, u.getPassword())){
                return jwtUtil.generateToken(username);
            }
        }
        throw new RuntimeException("Invalid username or password");
    }
}
