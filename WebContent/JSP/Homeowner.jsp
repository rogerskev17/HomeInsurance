<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
		<p style = "text-align:center;"><font size = "6"><strong>Homeowner Insurance</strong></font></p>
		<br>
		<div align = "center">
			<a href = "Home.jsp">Home</a>
			<a href = "GetQuote.jsp">Get Quote</a>
		</div>
		<hr/>
		<p style = "text-align:center"><b>Homeowner Information</b></p>
		<table align = "center">
			<tr>
				<td><!-- House image goes here --></td>
				<td>
					<form action = "/CaseStudy/Homeowner" method = "post" required>
						<table>
							<tr>
								<td><p>First Name</p></td>
								<td><input type = "text" name = "firstName" size = "30" maxlength = "30"/></td>
							</tr>
							<tr>
								<td><p>Last Name</p></td>
								<td><input type = "text" name = "lastName" size = "30" maxlength = "30"/></td>
							</tr>
							<tr>
								<td><p>Date of Birth (yyyy/MM/dd)</p></td>
								<td>
									<input type = "date" name = "birthDateYear" maxlength = "4" size = "4"/>/
									<input type = "date" name = "birthDateMonth" maxlength = "2" size = "2"/>/
									<input type = "date" name = "birthDateDay" maxlength = "2" size = "2"/>
								</td>
							</tr>
							<tr>
								<td><p>Are you retired?</p></td>
								<td>								
									<input type = "radio" name = "retired" value = "Yes">Yes
									<input type = "radio" name = "retired" value = "No">No
									<br>								
								</td>
							</tr>
							<tr>
								<td><p>Social Security Number (no dashes)</p></td>
								<td>
									<input type = "text" name = "ssn" maxlength = "9" size = "9"/>
								</td>
							</tr>
							<tr>
								<td>Email Address</td>
								<td><input type = "text" name = "emailAddress" size = "50" maxlength = "50"/></td>
							</tr>
							<tr>
								<td>
									<a href = "PropertyDetails.jsp"><button>Continue</button></a>
								</td>
								<td>
								</td>
							</tr>
						</table>
					</form>
				</td>
			</tr>
		</table>
	</body>
</html>