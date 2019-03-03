<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body>
<% if(request.getAttribute("msg")!=null) {%>
	<h3><%=request.getAttribute("msg") %></h3>
	<%} %>
	<form action="login" method="post">
		<pre>
		Email: <input type="text" name="email" />
		Password: <input type="password" name="password" />
		<input type="submit" value="Login" />
	<pre>
	</form>
	
	
</body>
</html>