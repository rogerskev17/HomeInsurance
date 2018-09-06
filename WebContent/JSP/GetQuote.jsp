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
<p style = "text-align:center"><b>Get quote</b></p>
<table align = "center">
<tr>
<td>
<!-- image goes in here -->
</td>
<td>
<table>
<tr>
<td><p>Residence Type </p></td>
<td>
<form action = "/CaseStudy/GetQuote" method = "post" required>
<select name = "ResidenceType" required>
<option value = "">Select a house type</option>
<option value = "Single-Family Home">Single-Family Home</option>
<option value = "Condo">Condo</option>
<option value = "Townhouse">Townhouse</option>
<option value = "Rowhouse">Rowhouse</option>
<option value = "Duplex">Duplex</option>
<option value = "Apartment">Apartment</option>
</select></td>
</tr>
<tr>
<td><p>Address Line 1</p></td>
<td><input type = "text" name ="AddressLine1" size = "49" maxlength = "49" required/></td>
</tr>
<tr>
<td><p>Address Line 2</p></td>
<td><input type = "text" name = "AddressLine2" size = "99" maxlength = "99" required/></td>
</tr>
<tr>
<td><p>City</p></td>
<td><input type = "text" name = "City" size = "14" maxlength = "14" required/></td>
</tr>
<tr>
<td><p>State</p></td>
<td><input type = "text" name = "State"  size = "14" maxlength = "14" required/></td>
</tr>
<tr>
<td><p> Zip </p></td>
<td><input type = "number" name = "Zip" size = "9" maxlength = "9" required/></td>
</tr>
<tr>
<td><p>Residence Use </td>
<td><select name = "ResidenceUse" required>
<option value = "">Select a home type</option>
<option value = "Primary">Primary</option>
<option value = "Secondary">Secondary</option>
<option value = "Rental Property">Rental Property</option>
</select>
</td>
</tr>
<tr>
<td></td>
<td><input type = "submit" value = "continue"/> </form></td>
</table>
</td>
</tr>
</table>
</body>
</html>