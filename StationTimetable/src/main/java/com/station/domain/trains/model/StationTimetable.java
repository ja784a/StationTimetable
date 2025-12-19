package com.station.domain.trains.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class StationTimetable {

    @JsonProperty("@context")
    private String context;

    @JsonProperty("@type")
    private String type;

    @JsonProperty("odpt:stationTimetableObject")
    private List<StationTimetableObject> timetableObjects;
}







