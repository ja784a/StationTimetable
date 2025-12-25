package com.station.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.DefaultUriBuilderFactory;

@Configuration
public class WebClientConfig {

	@Bean
	public WebClient webClient() {
	    DefaultUriBuilderFactory factory =
	        new DefaultUriBuilderFactory("https://api.odpt.org");
	    factory.setEncodingMode(DefaultUriBuilderFactory.EncodingMode.NONE);

	    return WebClient.builder()
	        .uriBuilderFactory(factory)
	        .defaultHeader(HttpHeaders.USER_AGENT, "StationTimetable/1.0")
	        .build();
	}
}