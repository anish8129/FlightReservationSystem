<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
	import="java.util.*,com.anish.flightreservation.FlightReservation.entities.Flight"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Reservation Completion</title>
</head>
<body>
	<h2>Reservation Completion</h2>
	Airline:<%=((Flight) (request.getAttribute("flight"))).getOperating_airlines()%>
	From:<%=((Flight) (request.getAttribute("flight"))).getDeparture_city()%>
	To:<%=((Flight) (request.getAttribute("flight"))).getArrival_city()%>
	<h2>Passenger Details</h2>
	<form action="completeReservation" method="post">
	<pre>
		First Name: <input type="text" name="pass_fName" /> 
		Last Name: <input
			type="text" name="pass_lName" /> 
		Email: <input type="email"
			name="email" />
		Mobile: <input type="text" name="phone" />

		<h2>Card Details</h2>
		Name on the Card: <input type="text" name="nameOnTheCard" /> Card
		Card Number: <input type="text" name="cardNumber" /> 
		Expiry Date: <input type="text" name="expiryDate" /> 
		Security Code: <input type="text" name="securityCode" />
		<input type="hidden" name="flight_id" value="<%=((Flight)(request.getAttribute("flight"))).getId()%>" />
		<input type="submit" value="Confirm" />
	</pre></form>

</body>
</html>