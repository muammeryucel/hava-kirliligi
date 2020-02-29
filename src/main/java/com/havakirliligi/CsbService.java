package com.havakirliligi;

import java.util.Arrays;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.havakirliligi.model.AirQualityStationDetail;

@Service
public class CsbService {

	private static final String URL = "http://www.havaizleme.gov.tr/Services/GetAirQualityStationDetail";
	private static final String BODY = "stationId=%s&Year=%d&Month=%d&Day=%d&Hour=%d";

	private RestTemplate restTemplate;

	public CsbService(RestTemplateBuilder restTemplateBuilder) {
		restTemplate = restTemplateBuilder.build();
		restTemplate.setInterceptors(Arrays.asList((request, body, execution) -> {
			// CSB servisi content type olarak aplication/json (typo hatasi application
			// yerine tek p ile yazmislar) donuyor. Bu yuzden manuel duzelttik
			ClientHttpResponse response = execution.execute(request, body);
			response.getHeaders().setContentType(MediaType.APPLICATION_JSON);
			return response;
		}));
	}

	public AirQualityStationDetail getHavaKirliligi(String stationId, int year, int month, int day, int hour) {

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

		String body = String.format(BODY, stationId, year, month, day, hour);
		HttpEntity<String> entity = new HttpEntity<String>(body, headers);

		ResponseEntity<AirQualityStationDetail> result = restTemplate.postForEntity(URL, entity,
				AirQualityStationDetail.class);

		return result.getBody();
	}
}
