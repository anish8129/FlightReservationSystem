<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register User</title>
</head>
<body>
	<form action="registerUser" method="post">
		<pre>
		First Name: <input type="text" name="f_name" />
		Last Name: <input type="text" name="l_name" />
		Email: <input type="text" name="email" />
		Password: <input type="password" name="password" />
		Confirm Password: <input type="password" name="confirmPassword" />
		<input type="submit" value="register" />
	<pre>
	</form>


</body>
</html>