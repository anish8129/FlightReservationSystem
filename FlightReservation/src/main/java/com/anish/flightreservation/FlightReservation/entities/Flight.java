package com.anish.flightreservation.FlightReservation.entities;

import java.io.Serializable;
import java.security.Timestamp;
import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "flight")
public class Flight extends AbstractEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	@Column(name = "flight_number")

	private String flight_number;
	@Column(name = "operating_airlines")
	private String operating_airlines;
	@Column(name = "departure_city")

	private String departure_city;
	@Column(name = "arrival_city")
	private String arrival_city;
	@Column(name = "departure_date")

	private String departure_date;
	@Column(name = "estimated_departure_time")
	private String estimated_departure_time;

	public String getFlight_no() {
		return flight_number;
	}

	public void setFlight_no(String flight_no) {
		this.flight_number = flight_no;
	}

	public String getOperating_airlines() {
		return operating_airlines;
	}

	public void setOperating_airlines(String operating_airlines) {
		this.operating_airlines = operating_airlines;
	}

	public String getDeparture_city() {
		return departure_city;
	}

	public void setDeparture_city(String departure_city) {
		this.departure_city = departure_city;
	}

	public String getArrival_city() {
		return arrival_city;
	}

	public void setArrival_city(String arrival_city) {
		this.arrival_city = arrival_city;
	}

	public String getDeparture_date() {
		return departure_date;
	}

	public void setDeparture_date(String departure_date) {
		this.departure_date = departure_date;
	}

	public String getEstimated_departure_time() {
		return estimated_departure_time;
	}

	public void setEstimated_departure_time(String estimated_departure_time) {
		this.estimated_departure_time = estimated_departure_time;
	}

	@Override
	public String toString() {
		return "Flight [flight_number=" + flight_number + ", operating_airlines=" + operating_airlines
				+ ", departure_city=" + departure_city + ", arrival_city=" + arrival_city + ", departure_date="
				+ departure_date + ", estimated_departure_time=" + estimated_departure_time + "]";
	}

}
