package com.notes.platform.repository;

import com.notes.platform.entity.Discussion;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Author: shubhamsrivastava
 *
 **/
public interface DiscussionRepository
        extends JpaRepository<Discussion, Long> {
}
