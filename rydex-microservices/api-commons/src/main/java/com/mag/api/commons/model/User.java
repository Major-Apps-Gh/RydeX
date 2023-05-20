package com.mag.api.commons.model;



import com.mag.api.commons.utils.*;


import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor

//@TypeDefs({ @TypeDef(name = "json", typeClass = JsonStringType.class) }) // Custom JSON type definition
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private String paymentMethodId;
//	@Type(type = "json") // Using the custom JSON type
//    @Column(columnDefinition = "json")
//    private String rydes;
	
	  @Convert(converter = RideJsonConverter.class) // Using the custom JSON converter
	    @Column(columnDefinition = "json")
	    private Ride jsonData;
	  
//	@Column(name = "params", columnDefinition = "json")
//	@JsonRawValue
//	private String params;


}

