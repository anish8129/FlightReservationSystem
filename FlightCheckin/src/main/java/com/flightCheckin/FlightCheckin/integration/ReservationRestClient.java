package com.flightCheckin.FlightCheckin.integration;

import com.flightCheckin.FlightCheckin.integration.dto.Reservation;
import com.flightCheckin.FlightCheckin.integration.dto.ReservationUpdateRequest;

public interface ReservationRestClient {
	
	public Reservation findReservation(int id); 
	
	public Reservation updateReservation(ReservationUpdateRequest request); 

}