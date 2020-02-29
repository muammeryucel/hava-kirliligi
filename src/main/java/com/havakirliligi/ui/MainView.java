package com.havakirliligi.ui;

import org.springframework.beans.factory.annotation.Autowired;

import com.havakirliligi.CsbService;
import com.havakirliligi.model.AQIValue;
import com.havakirliligi.model.AirQualityStationDetail;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("")
public class MainView extends VerticalLayout {

	@Autowired
	private CsbService service;

	public MainView() {

		setSizeFull();
		
		Grid<AQIValue> aqiValues = new Grid<AQIValue>(AQIValue.class);
		aqiValues.setSizeFull();

		ComboBox<Station> stations = new ComboBox<Station>("Istasyon", Station.values());
		stations.addValueChangeListener(event -> {
			Station station = event.getValue();
			
			AirQualityStationDetail detail = service.getHavaKirliligi(station.getId());
			aqiValues.setItems(detail.getObjects().getAQIValues());
		});

		add(stations, aqiValues);
	}
}
