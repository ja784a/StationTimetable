package com.station.client.impl;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.station.client.ExternalApiClient;

@Service
public class ExternalApiClientImpl implements ExternalApiClient {
	
	private final WebClient webClient;
	
	public ExternalApiClientImpl(WebClient webClient) {
		this.webClient = webClient;
	}
	
	
	String apikey = "ev2hgeb4ygby5phqaj6h1e792l5xnogekpkd24f90rl8xmxf42uq4hhrgo8lzlti";
	
	@Override
	public String getStationTimetable() {
		 return webClient.get()
	                .uri(uriBuilder -> uriBuilder
	                		.path("/api/v4/odpt:StationTimetable")
	                        .queryParam("odpt:operator", "odpt.Operator:JR-East")
	                        .queryParam("odpt:railway", "odpt.Railway:JR-East.ChuoRapid")
	                        .queryParam("odpt:station", "odpt.Station:JR-East.ChuoRapid.Tokyo")
	                        .queryParam("odpt:railDirection", "odpt.RailDirection:JR-East.Outbound")
	                        .queryParam("odpt:calendar", "odpt.Calendar:Weekday")
	                        .queryParam("acl:consumerKey",apikey)
	                        .build())
	                .retrieve()
	                .bodyToMono(String.class)
	                .block();
	}
}