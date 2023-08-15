<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="pippo" uri="/struts-dojo-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
<link rel="stylesheet" href="css/style.css">
<pippo:head />
</head>
<body>

<%@ include file="header.jsp" %>

<div align="center">
	<h2>Add new transaction</h2>
	<s:form action="TransectionSelectPatientData" class="filterPanel">
		<s:textfield name="patientId" label="Patient ID"  class="formTextField"/>
	</s:form>
</div>
<div align="center">
	<h2>Doctors list</h2>
	<s:form action="TransectionSelectDoctorsData" class="filterPanel">
		<s:textfield name="doctorName" label="Doctor Name" class="formTextField"/>
		<s:hidden name="patientId" value="%{#parameters.patientId}" />
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
				<a href="TransectionSelectServicesData?doctorId=<s:property value="#doctor.idDoctor"/>
				&patientId=<s:property value="patientId"/>">
					<button class="actionBtn">Chose</button>
				</a>
			</td>
		</tr>
	</s:iterator>

</table>

</body>


</html>
