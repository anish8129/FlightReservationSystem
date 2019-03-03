<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>confirmReservation</title>
</head>
<body>
<h1>Reservation Completed</h1>

<h2>Flight Details</h2>
	
	Airlines: ${reservation.flight.operating_airlines}<br/>
	<%-- Flight Number: ${reservation.flight.flight_number}<br/> --%>
	From: ${reservation.flight.departure_city}<br/>
	To: ${reservation.flight.arrival_city}<br/>
	Date Of Departure: ${reservation.flight.departure_date}<br/>

	<h2>Passenger Details</h2>
	
	First Name: ${reservation.passenger.f_name}<br/>
	Last Name: ${reservation.passenger.l_name}<br/>
	Email: ${reservation.passenger.email}<br/>
	Mobile Number: ${reservation.passenger.phone}<br/>

<h2>Reservation completed</h2>
	Reservation Id: ${reservation.id}<br/>
	<%-- Number of Bags: ${reservation.number_of_Bags}<br/> --%>

</body>
</html>