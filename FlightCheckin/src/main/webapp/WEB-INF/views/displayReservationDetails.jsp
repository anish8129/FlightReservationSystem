<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Reservation Details</title>
</head>
<body>
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

	<form action="completeCheckin" method="post">
		Enter the Number of Bags: <input type="text" name="number_of_bags">
		<input type="hidden" value="${reservation.id}" name="reservation_id">
		<input type="submit" value="Checkin">
	</form>

</body>
</html>