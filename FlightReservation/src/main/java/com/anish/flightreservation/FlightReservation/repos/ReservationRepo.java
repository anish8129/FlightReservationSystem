package com.anish.flightreservation.FlightReservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.anish.flightreservation.FlightReservation.entities.Reservation;

public interface ReservationRepo extends JpaRepository<Reservation, Integer> {

	@Query("from Reservation where id=:id")
	Reservation findOne(@Param("id") int id);

}
