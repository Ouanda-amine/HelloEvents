package com.example.HelloEvents.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter @Setter
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long idreservation;
    @ManyToOne
    private Client client;

    @ManyToOne
    private Evenement evenement;


}
