package com.anish.flightreservation.FlightReservation.repos;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.anish.flightreservation.FlightReservation.entities.F_User;

public interface UserRepo extends JpaRepository<F_User, Integer> {
	
	public F_User findByEmail(String email);

}
