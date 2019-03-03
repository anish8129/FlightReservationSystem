package com.anish.flightreservation.FlightReservation.service;

import org.springframework.stereotype.Service;

import com.anish.flightreservation.FlightReservation.dto.ReservationRequest;
import com.anish.flightreservation.FlightReservation.entities.Reservation;


public interface ReservationService {
	
	
	public Reservation bookFlight(ReservationRequest request);

}
