package com.mag.driver.entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Driver")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Driver {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(name = "first_name")
  private String firstName;

  @Column(name = "last_name")
  private String lastName;
  
  @Column(name = "email", unique = true)
  private String email;

  @Column(name = "password")
  private String password;

  @Column(name = "phone_number")
  private String phoneNumber;

  @Column(name = "car_make")
  private String carMake;

  @Column(name = "car_model")
  private String carModel;

  @Column(name = "car_year")
  private String carYear;

  @Column(name = "car_color")
  private String carColor;

  @Column(name = "license_plate")
  private String licensePlate;

  @Column(name = "rating")
  private Float rating;

  // Constructors, getters, and setters

  // Additional methods if needed
}
