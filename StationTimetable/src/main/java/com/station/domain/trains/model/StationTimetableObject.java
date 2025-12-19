package com.station.domain.trains.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class StationTimetableObject {

    @JsonProperty("odpt:departureTime")
    private String departureTime;

    @JsonProperty("odpt:destinationStation")
    private List<String> destinationStation;

    @JsonProperty("odpt:trainType")
    private String trainType;
}