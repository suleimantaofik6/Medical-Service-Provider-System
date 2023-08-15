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
		<h2>Update Services Data</h2>
		<s:form action="UpdateServices" class="formTable">
			<s:textfield name="id" label="Service Id" class="formTextField" readonly="true"/>
			<s:textfield name="name" label="Service Name" class="formTextField"/>
			<s:textfield name="price" label="Service Price" class="formTextField"/>
			<s:submit value="Update Services" class="actionBtn"/>
		</s:form>
	</div>
	<script src="jscript.js"></script>

</body>
</html>
