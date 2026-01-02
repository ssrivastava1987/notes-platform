package com.notes.platform.repository;

import com.notes.platform.entity.PsychologistProfile;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Author: shubhamsrivastava
 *
 **/
public interface PsychologistRepository
        extends JpaRepository<PsychologistProfile, Long> {
}
