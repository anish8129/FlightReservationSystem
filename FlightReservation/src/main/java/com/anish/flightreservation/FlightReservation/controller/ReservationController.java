package com.anish.flightreservation.FlightReservation.controller;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.anish.flightreservation.FlightReservation.dto.ReservationRequest;
import com.anish.flightreservation.FlightReservation.entities.Flight;
import com.anish.flightreservation.FlightReservation.entities.Reservation;
import com.anish.flightreservation.FlightReservation.repos.FlightRepo;
import com.anish.flightreservation.FlightReservation.service.ReservationService;

@Controller
public class ReservationController {

	private  static final Logger LOGGER = LoggerFactory.getLogger(ReservationController.class);
	
	@Autowired
	FlightRepo flightRepo;
	
	@Autowired
	ReservationService reservationService;

	@RequestMapping("/showCompleteReservation")
	public String showCompleteReservation(@RequestParam("flightId") int flightId, ModelMap modelMap) {
		LOGGER.info("Inside showComplete reervation method  "+ flightId);
		Flight flight = flightRepo.findOne(flightId);
		modelMap.addAttribute("flight", flight);
		return "completeReservation";
	}

	@RequestMapping(value = "/completeReservation", method = RequestMethod.POST)
	public String completeReservation(ReservationRequest reservationRequest,ModelMap modelMap) {
		LOGGER.info("Inside completereservation method  "+ reservationRequest);
		Reservation bookFlight = reservationService.bookFlight(reservationRequest);
		modelMap.addAttribute("msg", "Reservation created succesfully and the id is  "+bookFlight.getId());
		return "reservationConfirmation";
	}
}
