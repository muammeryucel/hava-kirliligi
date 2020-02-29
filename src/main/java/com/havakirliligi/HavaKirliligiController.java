package com.havakirliligi;

import java.time.LocalDateTime;
import java.time.Month;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.havakirliligi.model.AirQualityStationDetail;

@RestController
public class HavaKirliligiController {

	@Autowired
	private CsbService service;

	@GetMapping("/")
	public AirQualityStationDetail getHavaKirliligi() {

		LocalDateTime now = LocalDateTime.now();
		
		int year = now.getYear();
		Month month = now.getMonth();
		int dayOfMonth = now.getDayOfMonth();
		int hour = now.getHour();

		return service.getHavaKirliligi("291d6758-cd2d-4bd3-bcb5-1280baf23a40", year, month.ordinal() + 1, dayOfMonth,
				hour);
	}

}
