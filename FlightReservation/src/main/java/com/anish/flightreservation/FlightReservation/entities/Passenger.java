package com.anish.flightreservation.FlightReservation.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "passenger")
public class Passenger extends AbstractEntity {

	private String f_name;
	private String l_name;
	private String email;
	private String phone;

	public String getF_name() {
		return f_name;
	}

	public void setF_name(String f_name) {
		this.f_name = f_name;
	}

	public String getL_name() {
		return l_name;
	}

	public void setL_name(String l_name) {
		this.l_name = l_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Passenger [f_name=" + f_name + ", l_name=" + l_name + ", email=" + email + ", phone=" + phone + "]";
	}

}
