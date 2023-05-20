package com.mag.user.entity;




import com.fasterxml.jackson.annotation.JsonRawValue;
import com.mag.api.commons.model.Ride;


import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.mag.api.commons.utils.*;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "`User`")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private Integer paymentMethodId;

	
//	@Convert(converter = RideJsonConverter.class) // Using the custom JSON converter
//	@Column(columnDefinition = "json")
//	private Ride jsonData;
	  
//	@Column(name = "params", columnDefinition = "json")
//	@JsonRawValue
//	private String params;


}

