<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Register User</title>
	</head>
	<body>
		<p style = "text-align:center;"><strong><font size = "6">Homeowner Insurance</font></strong></p>
		<hr/>
		<p style = "text-align:center;"><strong>User Details</strong></p>
		<br>
		<br>
		<p style = "text-align:center;">Note: Password must be 19 characters maximum with numbers and characters only.</p>
		<br>
		<br>
		<table align = "center">
			<tr>
				<td>User Id </td>
				<td>
					<form method = "post" action = "/CaseStudy/RegisterUser">
					<input type = "text" name = "User Id"/>
				</td>
			</tr>
			<tr>
				<td>Password </td>
				<td>
				<input type = "password" name = "Password" size = "19" maxlength = "19"/>
				</td>
			</tr>
			<tr>
				<td>Re-enter password</td>
				<td>
				<input type = "password" name = "Re-enter password" size = "19" maxlength = "19"/>
				<br>
				<font color = red> ${PasswordMismatch} </font> 
				</td>
			</tr>
			<tr>
				<td>
				</td>
				<td>
					<input type = "submit" value = "Login"/>
					<input type = "reset" value = "Reset" />
					<%session.removeAttribute("PasswordMismatch"); %>
					</form>
				</td>
			
			</tr>
		</table>
		<hr/>
		<p style = "text-align:center;">
		Copyright &copy; 2018 Homeownerinsurance.com. All rights reserved
		</p>
	</body>
</html>