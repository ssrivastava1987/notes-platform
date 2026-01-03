package com.notes.platform.controller;

import com.notes.platform.entity.User;
import com.notes.platform.repository.UserRepository;
import org.springframework.web.bind.annotation.*;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Author: shubhamsrivastava
 *
 **/
@RestController
@RequestMapping("/users")
public class UserController {

    private final UserRepository repo;
    private final PasswordEncoder encoder;

    public UserController(UserRepository repo, PasswordEncoder encoder) {
        this.repo = repo;
        this.encoder = encoder;
    }

    @PostMapping
    public User create(@RequestBody User user) {
        user.setPassword(encoder.encode(user.getPassword()));
        return repo.save(user);
    }

    @GetMapping
    public List<User> all() {
        return repo.findAll();
    }
}
