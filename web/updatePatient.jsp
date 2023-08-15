<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Product</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>

	<%@ include file="header.jsp" %>
	
	<div align="center">
		<h2>Update Patients Data</h2>
		<s:form action="updatePatient" class="formTable">
			<s:textfield name="patientId" label="patient Id" class="formTextField" readonly="true"/>
			<s:textfield name="patientName" label="patient Name" class="formTextField"/>
			<s:textfield name="patiantAge" label="patient Age" class="formTextField"/>
			<s:textfield name="patientGender" label="patient Gender" class="formTextField"/>
			<s:textfield name="patientPhone" label="patient Phone" class="formTextField"/>
			<s:submit value="Update Patient" class="actionBtn"/>
		</s:form>
	</div>
	<script src="jscript.js"></script>

</body>
</html>
