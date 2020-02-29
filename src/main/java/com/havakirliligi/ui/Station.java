package com.havakirliligi.ui;

public enum Station {

	ANKARA_KAYAS("073ba16f-a576-45ee-b0cf-e56aa70f2253"),
	ANKARA_SINCAN("733f07df-4743-4510-92b9-c5a6602a7f00"),
	ANKARA_SITELER("6edbea5e-e575-4f89-9d7b-621c2e0c6c44"),
	ANKARA_SIHHIYE("85a31f14-edd1-40a2-9757-8445e8184725");
	
	private String id;

	private Station(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
}
