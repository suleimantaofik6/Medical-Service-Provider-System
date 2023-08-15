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
			<h2>Add new transaction</h2>
			<s:form action="SelectPatientData" class="filterPanel">
				<s:textfield name="id" label="transaction ID" class="formTextField"/>
				<s:textfield name="FK_Patient" label="Patient ID" class="formTextField"/>
				<s:textfield name="FK_Doctor" label="Doctor ID" class="formTextField"/>
				<s:textfield name="FK_employee" label="User ID" class="formTextField"/>
				<s:submit value="Search Patient" class="actionBtn"/>
			</s:form>
		</div>
	<iframe src="TransectionPations.jsp" width="100%" height="400px"></iframe>
	<script src="jscript.js"></script>

</body>
</html>