<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Form</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>

<table width="1400"  align="center" style="border: none;">
	<thead>
		<tr style="background: #8cbbe5;">
			<td style="width: 400px"><h1 style="color: #426b1f ; padding-left: 10px">Medical Center System</h1></td>
			<td><img src="images/parteners.JPEG" alt="parteners123" class="log_in_img"></td>
			<td style="padding-left: 400px"><button type="button" class="actionBtn" style="align-items: center">Sign Up</button> </td>
		</tr>
		<tr class="log_in_header" style="height: 500px">
			<td>
				<img src="images/appointment.jpg" alt="appointment_pic" style="width: 400px; height: 500px">
			</td>
			<td>
				<div align="center">
					<h2>Login</h2>
					<s:form action="loginAction" class="loginForm">
						<s:textfield name="userName" id="usernameField" label="User Name" class="formTextField" />
						<s:password name="password" label="Password" class="formTextField" />
						<s:submit value="Login" class="actionBtn" />
					</s:form>
				</div>
			</td>
			<td><img src="images/appointment_girl.png" alt="appointment_girl" style="padding-left: 50px ;height: 500px;width: 400px"></td>
		</tr>
		<tr style="background: #8cbbe5;">
			<td style="width: 400px"><div style="padding-left: 100px"> <h4 style="color: #426b1f ">Hsham Abdalgny Abdalwhab Ngim	</h4>
				<h4 style="color: #426b1f ">Taofik Ahmed Suleiman</h4>
				<h4 style="color: #426b1f ">Daniel </h4>
			</div>
			</td>
			<td><img src="images/MAIA.JPEG" alt="parteners123" class="log_in_img"></td>
			<td>
				<div style="padding-left: 50px"><p>Contact us via email: <h4>ngim.hsham@gmail.com : dtanyimadu@gmail.com</h4>
					<h4>taofikahmed.suleiman@studentmail.unicas.it</h4>
				</div>
			</td>
		</tr>
	</thead>
</table>


<script src="jscript.js"></script>


</body>
</html>
