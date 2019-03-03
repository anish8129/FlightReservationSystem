package com.anish.flightreservation.FlightReservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anish.flightreservation.FlightReservation.entities.Passenger;

public interface PassengerRepo extends JpaRepository<Passenger, Integer> {

}
