package com.notes.platform.repository;

import com.notes.platform.entity.PatientProfile;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Author: shubhamsrivastava
 *
 **/
public interface PatientRepository
        extends JpaRepository<PatientProfile, Long> {
}