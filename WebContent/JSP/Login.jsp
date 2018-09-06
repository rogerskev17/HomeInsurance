<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import = "java.io.PrintWriter" %>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
	<title>Welcome</title>
	</head>
	<body>
		<p style = "text-align:center;">Homeowner Insurance</p>
		<hr style = "color:#AADD44;"/>
		<table width = "100%">
			<colgroup>
			<col style ="width: 50%"/>
			<col style = "width: 50%"/>
			</colgroup>
			<tr>
				<td>
					Lorem ipsum dolor sit amet, consectetur adipiscing elit.
					Nullam at mauris auctor, accumsan magna nec, rutrum orci. Vestibulum dapibus
					pharetra leo a aliquam. Mauris tincidunt porttitor scelerisque. Nulla consequat
					erat sed nulla dapibus, placerat venenatis lectus feugiat. Ut mattis suscipit
					nunc, quis tincidunt augue fringilla eu. Etiamrci.
				</td>
				<td>         
    				<form method = "post" action = "/CaseStudy/Login">
    				<p><b>User Id:</b></p>
    				<input type = "text" name = "Username" maxlength = "19" size = "19" required/>
   					<p><b>Password:</b></p>
    				<input type = "password" name = "Password" maxlength = "19" size = "19" required/>
    				<br>    				
    				<font color = red> ${InvalidPassword} </font>
    				<br>    				
    				<input type = "submit" value = "Login" />
    				<input type = "reset" value = "Reset" />
    				<%session.removeAttribute("InvalidPassword"); %>
    				
    				<!-- <input type = "hidden" name = "redirect" value = "../home.jsp"> -->
    				</form>
     				<p>New User? <a href ="RegisterUser.jsp"> Register Here.</a> </p>   
     			</td>
     		</tr>
     </table>
     <hr/>
	 <p style = "text-align:center;">
	 Copyright &copy; 2018 Homeownerinsurance.com. All rights reserved
	 </p>
	<%//instantiate objects from other classes here such as the DAOs %>
	</body>
</html>