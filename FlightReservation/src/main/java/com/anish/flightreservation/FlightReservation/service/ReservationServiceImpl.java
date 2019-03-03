package com.anish.flightreservation.FlightReservation.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.anish.flightreservation.FlightReservation.controller.UserController;
import com.anish.flightreservation.FlightReservation.dto.ReservationRequest;
import com.anish.flightreservation.FlightReservation.entities.Flight;
import com.anish.flightreservation.FlightReservation.entities.Passenger;
import com.anish.flightreservation.FlightReservation.entities.Reservation;
import com.anish.flightreservation.FlightReservation.repos.FlightRepo;
import com.anish.flightreservation.FlightReservation.repos.PassengerRepo;
import com.anish.flightreservation.FlightReservation.repos.ReservationRepo;
import com.anish.flightreservation.FlightReservation.util.EmailUtil;
import com.anish.flightreservation.FlightReservation.util.PDFGenerator;

@Service
public class ReservationServiceImpl implements ReservationService {

	@Value("${directory_path}")
	private String directory;

	private  static final Logger LOGGER = LoggerFactory.getLogger(ReservationServiceImpl.class);
	
	@Autowired
	FlightRepo flightRepo;

	@Autowired
	PassengerRepo passengerRepo;

	@Autowired
	ReservationRepo reservationRepo;

	@Autowired
	PDFGenerator pdfGenerator;

	@Autowired
	EmailUtil emailUtil;

	@Override
	public Reservation bookFlight(ReservationRequest request) {

		LOGGER.info("Inside Service layer booFlight Method  "+request );
		int flight_id = request.getFlight_id();
		Flight flight = flightRepo.findOne(flight_id);

		Passenger passenger = new Passenger();
		passenger.setF_name(request.getPass_fName());
		passenger.setL_name(request.getPass_lName());
		passenger.setEmail(request.getEmail());
		passenger.setPhone(request.getPhone());
		Passenger savedPassenger = passengerRepo.save(passenger);
		
		LOGGER.info("Inside Service layer booFlight Method Saving the passenger  "+savedPassenger );
		
		Reservation reservation = new Reservation();
		reservation.setFlight(flight);
		reservation.setPassenger(savedPassenger);
		reservation.setChecked_in(0);
		Reservation savedReservation = reservationRepo.save(reservation);
		
		LOGGER.info("Inside Service layer booFlight Method Saving the reservation  "+savedReservation );
		
		String path = directory+ savedReservation.getId() + ".pdf";
		pdfGenerator.generateTicket(savedReservation, path);
		
		emailUtil.sendTicket(savedPassenger.getEmail(), path);
		
		return savedReservation;
		
		
	}
}
