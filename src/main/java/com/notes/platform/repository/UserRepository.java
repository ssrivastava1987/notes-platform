package com.notes.platform.repository;

import com.notes.platform.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Author: shubhamsrivastava
 *
 **/
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}