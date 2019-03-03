package com.anish.flightreservation.FlightReservation.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "f_user")
public class F_User extends AbstractEntity {
	@Column(name="f_name")
	private String f_name;
	@Column(name="l_name")
	private String l_name;
	private String email;
	private String password;

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "F_User [f_name=" + f_name + ", l_name=" + l_name + ", email=" + email + "]";
	}

}
