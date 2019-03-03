package com.anish.flightreservation.FlightReservation.dto;

public class ReservationRequest {

	private int flight_id;
	private String pass_fName;
	private String pass_lName;
	private String email;
	private String phone;
	private String nameOnTheCard;
	private String cardNumber;
	private String expiryDate;
	private String securityCode;

	public int getFlight_id() {
		return flight_id;
	}

	public void setFlight_id(int flight_id) {
		this.flight_id = flight_id;
	}

	public String getPass_fName() {
		return pass_fName;
	}

	public void setPass_fName(String pass_fName) {
		this.pass_fName = pass_fName;
	}

	public String getPass_lName() {
		return pass_lName;
	}

	public void setPass_lName(String pass_lName) {
		this.pass_lName = pass_lName;
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

	public String getNameOnTheCard() {
		return nameOnTheCard;
	}

	public void setNameOnTheCard(String nameOnTheCard) {
		this.nameOnTheCard = nameOnTheCard;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getSecurityCode() {
		return securityCode;
	}

	public void setSecurityCode(String securityCode) {
		this.securityCode = securityCode;
	}

}
