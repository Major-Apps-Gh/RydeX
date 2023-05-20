package com.mag.providerservice.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "vehicles")
public class ServProvided {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "make")
    private String make;

    @Column(name = "model")
    private String model;

    @Column(name = "year")
    private int year;

    @Column(name = "license_plate")
    private String licensePlate;

    @ManyToOne
    @JoinColumn(name = "driver_id")
    private Driver driver;

    @ManyToOne
    @JoinColumn(name = "fleet_owner_id")
    private Provider fleetOwner;

    // Constructors, getters, and setters

    // Additional methods if needed
}

