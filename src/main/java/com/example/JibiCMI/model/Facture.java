package com.example.JibiCMI.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;


@Getter
@Setter
@Entity
public class Facture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String factref;

    private int month;

    private LocalDateTime echeance;

    private Long clientid;

    private LocalDateTime datepaiement;
    @Enumerated(EnumType.STRING)
    private Statusfacture statusfacture;

    private double montant;

    @ManyToOne(fetch  = FetchType.EAGER)
    @JoinColumn(name = "CreanceID", nullable = false)
    private Creance creance;



}
