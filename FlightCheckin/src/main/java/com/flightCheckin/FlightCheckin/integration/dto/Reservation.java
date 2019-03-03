package com.flightCheckin.FlightCheckin.integration.dto;

public class Reservation {

	private int id;
	private int checked_in;
	private int number_of_bags;
	private Passenger passenger;
	private Flight flight;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getChecked_in() {
		return checked_in;
	}
	public void setChecked_in(int checked_in) {
		this.checked_in = checked_in;
	}
	public int getNumber_of_bags() {
		return number_of_bags;
	}
	public void setNumber_of_bags(int number_of_bags) {
		this.number_of_bags = number_of_bags;
	}
	public Passenger getPassenger() {
		return passenger;
	}
	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}


	
}
