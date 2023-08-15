<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="pippo" uri="/struts-dojo-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
<link rel="stylesheet" href="css/style.css">
<pippo:head />
</head>
<body>

	<%@ include file="header.jsp" %>
	<div align="center">
		<h2>Doctors list</h2>
		<s:form action="SelectDoctorData" class="filterPanel">
			<s:textfield name="doctorName" label="Doctor Name" class="formTextField"/>
			<s:submit value="Search Doctor" class="actionBtn"/>
		</s:form>
	</div>

	<table width="750" class="productTable" align="center">
		<thead>
			<tr>
				<th>Doctor ID</th>
				<th>Doctor Name</th>
				<th>The Major</th>
				<th>The Address</th>
				<th>Phone Number</th>
				<th colspan="2">Actions</th>
			</tr>
		</thead>

		<s:iterator value="Doctors" var="doctor">
			<tr>
				<td>
					<s:property value="#doctor.idDoctor"/>
				</td>
				<td>
					<s:property value="#doctor.nameDoctor"/>
				</td>
				<td>
					<s:property value="#doctor.majorDoctor"/>
				</td>
				<td>
					<s:property value="#doctor.addressDoctor"/>
				</td>
				<td>
					<s:property value="#doctor.phoneDoctor"/>
				</td>
				<td>
					<a
					href="UpdateDoctorsInterface?idDoctor=<s:property value="#doctor.idDoctor"/>">
						<button class="actionBtn">Update</button>
					</a>
				</td>
				<td>
					<a href="DeleteDoctors?idDoctor=<s:property value="#doctor.idDoctor"/>">
						<button class="actionBtn">Delete</button>
					</a>
				</td>
			</tr>
		</s:iterator>

	</table>
</body>
</html>
