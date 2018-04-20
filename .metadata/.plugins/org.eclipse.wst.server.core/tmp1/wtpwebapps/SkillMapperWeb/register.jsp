<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
div.ex1 {
	text-align: right width:300px;
	padding: 10px;
	border: 5px solid grey;
	margin: 0px
}
</style>
<body>
	<h1>Registration Form</h1>
	<div class="ex1">
		<form action="RegistrationController" method="post">
			<table style="with: 50%">				
				<tr>
					<td>Employee Id</td>
					<td><input type="text" name="employeeId" /></td>
				</tr>
				<tr>
					<td>Employee Name</td>
					<td><input type="text" name="employeeName" /></td>
				</tr>
				<tr>
					<td>Email</td>
					<td><input type="text" name="email" /></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="emppassword" /></td>
				</tr>
				<tr>
					<td>Role Type</td>
					<td><select name="role_type">
							<option value="UNKNOWN">UNKNOWN</option>
							<option value="Trainer">Trainer</option>
							<option value="Employer">Employer</option>
							<option value="HR">HR</option>
					</select></td>
				</tr>
				<tr>
					<td>Department Name</td>
					<td><input type="text" name="deptname" /></td>
				</tr>
			</table>

			<input type="submit" value="Register" />
		</form>
		<c:forEach items="${sessionScope.errors}" var="item">
			<c:out value="${item.key}" />
			<c:out value="${item.value}" />
		</c:forEach>
	</div>
</body>
</html>