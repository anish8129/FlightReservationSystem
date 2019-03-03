package com.anish.flightreservation.FlightReservation.controller;

import org.apache.catalina.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.anish.flightreservation.FlightReservation.entities.F_User;
import com.anish.flightreservation.FlightReservation.repos.UserRepo;


@Controller
public class UserController {
	@Autowired
	private UserRepo userRepo;
	
	private  static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);
	
	@RequestMapping("/showReg")
	public String showRegistratioPage()
	{
		LOGGER.info("Inside the showRegistration method");
		return "login/registerUser";
	}
	
	@RequestMapping("/showLogin")
	public String showLoginPage()
	{
		LOGGER.info("Inside the showLogin method");
		return "login/login";
	}
	
	@RequestMapping(value="/registerUser",method=RequestMethod.POST)
	public String registerUser(@ModelAttribute("user") F_User user)
	{
		LOGGER.info("Inside the registerUser method"+ user);
		userRepo.save(user);
		
		return "login/login";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(@RequestParam("email") String email,@RequestParam("password") String passowrd,ModelMap modelMap)
	{
		LOGGER.info("inside Login method" +email+" "+passowrd);
		F_User user = userRepo.findByEmail(email);
		if(user.getPassword().equals(passowrd))
			return "findFlight";
		else
			modelMap.addAttribute("msg","Wrong Password Please try again.");
		return "login/login";
	}
	
	
	

}
 	