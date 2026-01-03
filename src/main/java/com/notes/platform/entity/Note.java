package com.notes.platform.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

/**
 * Author: shubhamsrivastava
 *
 **/
@Entity
@Getter
@Setter
public class Note {
    @Id
    @GeneratedValue
    private Long id;


    @ManyToOne
    private Discussion discussion;


    @Column(length = 10000)
    private String content;


    private Instant createdAt = Instant.now();
}
