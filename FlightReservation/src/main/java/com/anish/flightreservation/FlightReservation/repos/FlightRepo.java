package com.anish.flightreservation.FlightReservation.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.anish.flightreservation.FlightReservation.entities.Flight;

public interface FlightRepo extends JpaRepository<Flight, Integer> {

	@Query("from Flight f where f.departure_city = :departure_city and f.arrival_city = :arrival_city and f.departure_date = :departure_date")
	public List<Flight> findFlight(@Param("departure_city") String from, @Param("arrival_city") String to,
			@Param("departure_date") String departureDate);

	@Query("from Flight f where f.id = :id")
	public Flight findOne(@Param("id") int flightId);

}
