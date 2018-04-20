<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Form</title>
</head>
<body>
<center><h1>Login Page</h1></center>
<form action="LoginController" method="post">
User name : <input type="text" name="email"><br><br>
Password  : <input type="password" name="pass"><br><br>

<input type="submit" value="Login">
<a href="register.jsp"> Register here </a>

</form>
</body>
</html>