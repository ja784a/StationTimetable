package com.station.domain.trains.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.station.domain.trains.model.StationTimetable;
import com.station.domain.trains.service.StationTimetableService;

@Service 
public class StationTimetableServiceImpl implements StationTimetableService {
	@Autowired
	private WebClient webClient;
	
	public List<StationTimetable> fetchStationTimetable() {

	    return webClient.get()
	            .uri("https://api.odpt.org/api/v4/odpt:StationTimetable")
	            .retrieve()
	            .bodyToFlux(StationTimetable.class)
	            .collectList()
	            .block();
	}
}