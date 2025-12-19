package com.station.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.station.domain.trains.model.StationTimetable;
import com.station.domain.trains.service.StationTimetableService;

@Controller
public class StationTimetableController {
	@Autowired
	private StationTimetableService timetableService;
	
	@GetMapping("/")
	public String getStationTimetable(Model model) {
		List<StationTimetable> timetable = timetableService.fetchStationTimetable();
		
		model.addAttribute("timetable", timetable);
		
		return "sattion-timetable";
	}
}