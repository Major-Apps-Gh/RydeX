package com.mag.driver.VO;

import java.util.List;

import com.mag.api.commons.model.Ride;
import com.mag.driver.entity.Driver;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {
	
	private Driver driver;
	private List<Ride> rides;

}
