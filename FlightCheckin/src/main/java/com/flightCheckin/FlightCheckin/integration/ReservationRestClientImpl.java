package com.flightCheckin.FlightCheckin.integration;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.flightCheckin.FlightCheckin.integration.dto.Reservation;
import com.flightCheckin.FlightCheckin.integration.dto.ReservationUpdateRequest;

@Component
public class ReservationRestClientImpl implements ReservationRestClient {

	private static final String Reservation_Rest_Url= "http://localhost:8080/reservations/";

	@Override
	public Reservation findReservation(int id) {
		RestTemplate restTemplate = new RestTemplate();
		Reservation reservation = restTemplate.getForObject(Reservation_Rest_Url + id,
				Reservation.class);
		return reservation;
	}

	@Override
	public Reservation updateReservation(ReservationUpdateRequest request) {
		RestTemplate restTemplate = new RestTemplate();
		Reservation reservation = restTemplate.postForObject(Reservation_Rest_Url, request, Reservation.class);
		return reservation;
	}

}
