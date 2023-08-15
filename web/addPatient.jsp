<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add New Product</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>

	<%@ include file="header.jsp" %>

	<div align="center">
		<h2>Add New Patient</h2>
		<s:form action="addActionPatient" class="formTable">
			<s:textfield name="patientId" label="Patient Id" class="formTextField"/>
			<s:textfield name="patientName" label="Patient Name" class="formTextField"/>
			<s:textfield name="patiantAge" label="Patient Age" class="formTextField"/>
			<s:textfield name="patientGender" label="Patient Gender" class="formTextField"/>
			<s:textfield name="patientPhone" label="Patient Phone" class="formTextField"/>
			<s:submit value="Add Patient" class="actionBtn"/>
		</s:form>
	</div>

</body>
</html>
