package com.notes.platform.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.Id;

/**
 * Author: shubhamsrivastava
 *
 **/
@Entity
@Getter
@Setter
public class PatientProfile {
    @Id
    private Long id;


    @OneToOne
    @MapsId
    private User user;


    private String name;
    private String location;
}