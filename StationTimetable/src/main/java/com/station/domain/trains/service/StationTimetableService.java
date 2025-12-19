package com.station.domain.trains.service;

import java.util.List;

import com.station.domain.trains.model.StationTimetable;

public interface StationTimetableService {
	public List<StationTimetable> fetchStationTimetable();
}