package com.anish.flightreservation.FlightReservation.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.anish.flightreservation.FlightReservation.entities.Flight;
import com.anish.flightreservation.FlightReservation.repos.FlightRepo;

@Controller
public class FlightController {

	private  static final Logger LOGGER = LoggerFactory.getLogger(FlightController.class);
	
	@Autowired
	FlightRepo flightRepo;
	
	@RequestMapping(value="/findFlight",method=RequestMethod.POST)
	public String findFlight(@RequestParam("from") String from,@RequestParam("to") String to,@RequestParam("departureDate") String departureDate,ModelMap modelMap) {
		LOGGER.info("Inside findFligt Meothd"+ from+"  "+ to +" "+departureDate);
		String departureDa=departureDate.replace('/','-');
		List<Flight> flight = flightRepo.findFlight(from,to,departureDate);
		modelMap.addAttribute("flights",flight);
		return "findFlight"; 
	}
}
