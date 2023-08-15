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
		<h2>Patients data</h2>
		<s:form action="SelectPatientData" class="filterPanel">
			<s:textfield name="patientName" label="Patient Name" class="formTextField"/>
			<s:submit value="Search Patient" class="actionBtn"/>
		</s:form>
	</div>

	<table width="750" class="productTable" align="center">
		<thead>
			<tr>
				<th>Patient ID</th>
				<th>Patient Name</th>
				<th>Patient Age</th>
				<th>Patient Gender</th>
				<th>Patient Phone</th>
				<th colspan="2">Actions</th>
			</tr>
		</thead>

		<s:iterator value="Patients" var="Patients">
			<tr>
				<td>
					<s:property value="#Patients.patientId"/>
				</td>
				<td>
					<s:property value="#Patients.patientName"/>
				</td>
				<td>
					<s:property value="#Patients.patiantAge"/>
				</td>
				<td>
					<s:property value="#Patients.patientGender"/>
				</td>
				<td>
					<s:property value="#Patients.patientPhone"/>
				</td>
				<td>
					<a
					href="updatePatientInterface?patientId=<s:property value="#Patients.patientId"/>">
						<button class="actionBtn">Update</button>
					</a>
				</td>
				<td>
					<a href="DeletePatient?patientId=<s:property value="#Patients.patientId"/>">
						<button class="actionBtn">Delete</button>
					</a>
				</td>
			</tr>
		</s:iterator>

	</table>
	<script src="jscript.js"></script>

</body>
</html>
