<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" 
    import="java.util.*,com.anish.flightreservation.FlightReservation.entities.Flight"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Find your flights</h2>
	<form action="findFlight" method="post">
		From: <input type="text" name="from" />
		To: <input type="text" name="to" />
		Departure Date: <input type="text" name="departureDate" />
		<input type="submit" value="Search" />
	<pre>
	</form>
	<% if (request.getAttribute("flights")!=null) {%>
		<table>
			<tr><th>Airlines</th><th>From</th><th>To</th><th>Departure Date</th><th>Flight No.</th></tr>
			<% List<Flight> flight=(ArrayList<Flight>)(request.getAttribute("flights"));
				for(Flight f: flight) { %>
		<tr>
			<td><%=f.getOperating_airlines() %></td>
			<td><%=f.getDeparture_city() %></td>
			<td><%=f.getArrival_city() %></td>
			<td><%=f.getDeparture_date() %></td>
			<td><%=f.getFlight_no() %></td>
			<td><a href="showCompleteReservation?flightId=<%=f.getId()%>">select</a></td>
		</tr>
		<%} %>
	</table>
		<%} %>
</body>
</html>