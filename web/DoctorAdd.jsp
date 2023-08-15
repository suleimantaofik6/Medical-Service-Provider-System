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
		<h2>Add New Doctor</h2>
		<s:form action="addActionDoctor" class="formTable">
			<s:textfield name="idDoctor" label="Doctor Id" class="formTextField"/>
			<s:textfield name="nameDoctor" label="Doctor Name" class="formTextField"/>
			<s:textfield name="majorDoctor" label="The Major" class="formTextField"/>
			<s:textfield name="addressDoctor" label="The Address" class="formTextField"/>
			<s:textfield name="phoneDoctor" label="Phone Number" class="formTextField"/>
			<s:submit value="Add Doctor" class="actionBtn"/>
		</s:form>
	</div>

</body>
</html>
