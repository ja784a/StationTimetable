package com.station.domain.trains.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.station.domain.trains.service.StationTimetableService;

@Service
public class StationTimetableServiceImpl implements StationTimetableService {
	
	private final WebClient webClient;
	
	public StationTimetableServiceImpl(WebClient webClient) {
		this.webClient = webClient;
	}
	
	@Override
	public String getStationTimetable() {
		 return webClient.get()
	                .uri(uriBuilder -> uriBuilder
	                        .queryParam("odpt:operator", "odpt.Operator:JR-East")
	                        .queryParam("odpt:railway", "odpt.Railway:JR-East.ChuoRapid")
	                        .queryParam("odpt:station", "odpt.Station:JR-East.ChuoRapid.Tokyo")
	                        .queryParam("odpt:railDirection", "odpt.RailDirection:JR-East.Outbound")
	                        .queryParam("odpt:calendar", "odpt.Calendar:Weekday")
	                        .queryParam("acl:consumerKey", "あなたのAPIキー")
	                        .build())
	                .retrieve()
	                .bodyToMono(String.class)
	                .block();
	}
}