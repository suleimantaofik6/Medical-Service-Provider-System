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

<%--<div align="center">--%>
<%--	<h2>Please chose a patient to display his medical recored</h2>--%>
<%--	<s:form action="TransectionSelectPatientDataMenue" class="filterPanel">--%>
<%--		<s:textfield name="patientName" label="Patient Name" class="formTextField"/>--%>
<%--		<s:submit value="Search Patient" class="actionBtn"/>--%>
<%--	</s:form>--%>
<%--</div>--%>

<table width="750" class="productTable" align="center">
	<thead>
	<tr>
		<th>Transaction ID</th>
		<th>Patient ID</th>
		<th>Patient Name</th>
		<th>Doctor ID</th>
		<th>Doctor Name</th>
		<th>Service ID</th>
		<th>Service Name</th>
		<th>Action</th>
	</tr>
	</thead>

	<s:iterator value="medicalRecorde" var="med">
		<tr>
			<td>
				<s:property value="#med.id"/>
			</td>
			<td>
				<s:property value="#med.patientId"/>
			</td>
			<td>
				<s:property value="#med.patientName"/>
			</td>
			<td>
				<s:property value="#med.idDoctor"/>
			</td>
			<td>
				<s:property value="#med.nameDoctor"/>
			</td>
			<td>
				<s:property value="#med.serviceId"/>
			</td>
			<td>
				<s:property value="#med.serviceName"/>
			</td>
			<td>
				<a href="TransectionDeleteMedicalRecorde?id=<s:property value="#med.id"/>
				&patientId=<s:property value="#med.patientId"/>">
					<button class="actionBtn">Delete</button>
				</a>
			</td>
		</tr>
	</s:iterator>

</table>

</body>


</html>
