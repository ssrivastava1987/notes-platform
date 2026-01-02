package com.notes.platform.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

/**
 * Author: shubhamsrivastava
 *
 **/
@Entity
@Getter
@Setter
public class Discussion {
    @Id
    @GeneratedValue
    private Long id;


    @ManyToOne
    private PsychologistProfile psychologist;


    @ManyToOne
    private PatientProfile patient;


    private boolean locked;


    private String lockPasswordHash;
}
