package com.notes.platform.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

/**
 * Author: shubhamsrivastava
 *
 **/
@Entity
@Getter
@Setter
public class WritingSpace {
    @Id
    private Long psychologistId;


    @OneToOne
    @MapsId
    private PsychologistProfile psychologist;


    @Column(length = 20000)
    private String content;
}
