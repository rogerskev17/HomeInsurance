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
		<p style = "text-align:center"><b>Property Details</b></p>
		<form method = "post" action = "/CaseStudy/PropertyDetails">
			<table align = "center">
				<tr>
					<td><p>What is the market value of your home?</p></td>
					<td><p>$<input type = "number" name = "MarketValue"/></p></td>
				</tr>	
				<tr>
					<td><p>What year was your home originally built?</p></td>
					<td><p><input type = "number" name = "YearHomeBuilt"/></p></td>
				</tr>
				<tr>
					<td><p>Square Footage</p></td>
					<td><p><input type = "number" name = "SquareFeet"/>sq ft</p></td>
				</tr>
				<tr>
					<td><p>Dwelling style</p></td>
					<td>
						<select name = "DwellingStyle">
							<option value = "">-select-</option>
							<option value = "1 story">1 story</option>
							<option value = "1.5 story">1.5 story</option>
							<option value = "2 story">2 story</option>
							<option value = "3 story">3 story</option>
						</select>
					</td>
				</tr>
				<tr>
					<td><p>Roof Material</p></td>
					<td>
						<select name = "RoofMaterial">
							<option value = "">-select</option>
							<option value = "Concrete">Concrete</option>
							<option value = "Composite">Composite</option>
							<option value = "Wood">Wood</option>
							<option value = "Metal">Metal</option>
							<option value = "Clay">Clay</option>
							<option value = "Slate">Slate</option>
						</select>
				</tr>
				<tr>
					<td><p>Type of Garage</p></td>
					<td>
						<select name = "GarageType">
							<option value = "">-select-</option>
							<option value = "Attached">Attached</option>
							<option value = "Detached">Detached</option>
						</select>
					</td>
				</tr>
				<tr>
					<td><p>Number of full baths</p></td>
					<td>
						<select name = "NumFullBaths">
							<option value = "">-select-</option>
							<option value = "1">1</option>
							<option value = "2">2</option>
							<option value = "3">3</option>
						</select>
					<td>
				</tr>
				<tr>
					<td><p>Number of half baths</p></td>
					<td>
						<select name = "NumHalfBaths">
							<option value = "">-select-</option>
							<option value = "1">1</option>
							<option value = "2">2</option>
							<option value = "3">3</option>
						</select>
					</td>
				</tr>
				<tr>
					<td><p>Does your home have a swimming pool?</p></td>
					<td>
						<input type = "radio" name = "Pool" value = "Yes">Yes
						<input type = "radio" name = "Pool" value = "No">No
					</td>
				</tr>						
				<tr>
					<td align = "center">
						<input type = "submit" value = "Continue"/>
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>