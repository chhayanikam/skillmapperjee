<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Data</title>
</head>
<style>
div.ex {
	text-align: right width:300px;
	padding: 10px;
	border: 5px solid grey;
	margin: 0px
}
</style>
<body>
	<h1>Registration Form</h1>
	<div class="ex">
		<form action="ProfileController" method="post">
			<table style="with: 50%">				
				<tr>
					<td>Employee Id</td>
					<td><input type="text" name="employeeId" /></td>
				</tr>
				<tr>
					<td>Employee Name</td>
					<td><input type="text" name="employeename" /></td>
				</tr>
				<tr>
					<td>City</td>
					<td><input type="text" name="city" /></td>
				</tr>
				<tr>
					<td>Region</td>
					<td><input type="text" name="region" /></td>
				</tr>
				<tr>
					<td>Qualification</td>
					<td><input type="text" name="qualification" /></td>
				</tr>
				<tr>
					<td>Supervisor Name</td>
					<td><input type="text" name="supervisorname" /></td>
				</tr>		
				<tr>
					<td>Photo</td>
					<td><input type="file" name="photo" /></td>
				</tr>		
						
			</table>
			<input type="submit" value="Add To Profile" />
		</form>
	</div>
</body></html>