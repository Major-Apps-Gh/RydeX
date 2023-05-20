package com.mag.user.VO;

import com.mag.api.commons.model.Ride;
import com.mag.user.entity.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {
	
	private User user;
	private Ride ride;

}
