package com.station.domain.trains.model;

import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Operator {
	@JsonProperty("context")
	private String context;
	
	@JsonProperty("@id")
	private String id;
	
	@JsonProperty("@type")
	private String type;
	
	@JsonProperty("dc:date")
	private OffsetDateTime date;
	
	@JsonProperty("owl:sameAs")
	private String sameAs;
	
	@JsonProperty("dc:title")
	private String title;
	
	@JsonProperty("odpt:operatorTitle")
	private OperatorTitle operatorTitle;
}