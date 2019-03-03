package com.flightCheckin.FlightCheckin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.flightCheckin.FlightCheckin.integration.ReservationRestClient;
import com.flightCheckin.FlightCheckin.integration.dto.Reservation;
import com.flightCheckin.FlightCheckin.integration.dto.ReservationUpdateRequest;

@Controller
public class CheckinController {
	
	@Autowired
	ReservationRestClient restClient;
	
	@RequestMapping("/showStartCheckin")
	public String showStartCheckin()
	{
		return "startCheckin";
		
	}
	
	@RequestMapping(value= "/startCheckin", method=RequestMethod.POST)
	public String startCheckin(@RequestParam("reservation_id")int id,ModelMap modelMap)
	{
		Reservation reservation = restClient.findReservation(id);
		modelMap.addAttribute("reservation",reservation);
		return "displayReservationDetails"; 
		
	}
	
	@RequestMapping(value= "/completeCheckin", method=RequestMethod.POST)
	public String completeCheckin(@RequestParam("number_of_bags")int bags,@RequestParam("reservation_id")int id,ModelMap modelMap)
	{
		ReservationUpdateRequest request=new ReservationUpdateRequest();
		request.setId(id);
		request.setChecked_in(1);
		request.setNumber_of_bags(bags);
		Reservation updateReservation = restClient.updateReservation(request);
		modelMap.addAttribute("reservation",updateReservation);
		return "confirmReservation"; 
		
	}	
}
