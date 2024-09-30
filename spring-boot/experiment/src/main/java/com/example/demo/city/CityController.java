package com.example.demo.city;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityController {

	@GetMapping(path = "/city-details")
	public City getCityDetails() {
		return new City(1,"Bangalore",200000);
	}
}
