package com.anish.flightreservation.FlightReservation.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.anish.flightreservation.FlightReservation.dto.ReservationUpdateRequest;
import com.anish.flightreservation.FlightReservation.entities.Reservation;
import com.anish.flightreservation.FlightReservation.repos.ReservationRepo;

@RestController
public class ReservationRestController {
	
	private  static final Logger LOGGER = LoggerFactory.getLogger(ReservationRestController.class);
	
	@Autowired
	ReservationRepo reservationRepo;

	@RequestMapping("/reservations/{id}")
	public Reservation findReservation(@PathVariable("id") int id)
	{ 
		LOGGER.info("Inside findResrvation method " + id);
		return reservationRepo.findOne(id);
	}
	
	@RequestMapping("/reservations")
	public Reservation updateReservation(@RequestBody ReservationUpdateRequest request)
	{
		LOGGER.info("Inside updateResrvation method " + request);
		Reservation reservation = reservationRepo.findOne(request.getId());
		reservation.setChecked_in(request.getChecked_in());
		reservation.setNumber_of_bags(request.getNumber_of_bags());
		return reservationRepo.save(reservation);
		
	}
}
