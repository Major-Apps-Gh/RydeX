package com.mag.ride.entity;

import jakarta.persistence.*;


import com.mag.api.commons.utils.DriverJsonConverter;
import com.mag.api.commons.utils.UserJsonConverter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;




@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ride")
public class Ride {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @ManyToOne
//    @JoinColumn(name = "user_id")
//    private User user;
//
//    @ManyToOne
//    @JoinColumn(name = "driver_id")
//    private Driver driver;

//    @Convert(converter = UserJsonConverter.class) // Using the custom JSON converter
//    @Column(columnDefinition = "json")
//    private User userJsonData;
//    
//    @Convert(converter = DriverJsonConverter.class) // Using the custom JSON converter
//    @Column(columnDefinition = "json")
//    private Driver driverJsonData;
    private Integer driverId;
    
    
    private Integer userId;
    
    @Column(name = "pickup_location_latitude")
    private Float pickupLocationLatitude;

    @Column(name = "pickup_location_longitude")
    private Float pickupLocationLongitude;

    @Column(name = "dropoff_location_latitude")
    private Float dropoffLocationLatitude;

    @Column(name = "dropoff_location_longitude")
    private Float dropoffLocationLongitude;

    @Column(name = "status")
    private String status;

    @Column(name = "distance")
    private Float distance;

    @Column(name = "fare_amount")
    private Float fareAmount;

    @Column(name = "ride_start_time")
    private LocalDateTime rideStartTime;

    @Column(name = "ride_end_time")
    private LocalDateTime rideEndTime;

    // Constructors, getters, and setters

    // Additional methods if needed
}

