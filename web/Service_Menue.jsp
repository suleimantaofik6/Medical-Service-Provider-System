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
		<h2>Services list</h2>
		<s:form action="SelectServicesData" class="filterPanel">
			<s:textfield name="name" label="Service Name" class="formTextField"/>
			<s:submit value="Search User" class="actionBtn"/>
		</s:form>
	</div>

	<table width="750" class="productTable" align="center">
		<thead>
			<tr>
				<th>Service ID</th>
				<th>Service Name</th>
				<th>Service Price</th>
				<th colspan="2">Actions</th>
			</tr>
		</thead>

		<s:iterator value="Servecies" var="Services">
			<tr>
				<td>
					<s:property value="#Services.id"/>
				</td>
				<td>
					<s:property value="#Services.name"/>
				</td>
				<td>
					<s:property value="#Services.price"/>
				</td>
				<td>
					<a
					href="UpdateServiceInterface?id=<s:property value="#Services.id"/>">
						<button class="actionBtn">Update</button>
					</a>
				</td>

				<td>
					<a href="DeleteService?id=<s:property value="#Services.id"/>">
						<button class="actionBtn">Delete</button>
					</a>
				</td>
			</tr>
		</s:iterator>

	</table>
	<script src="jscript.js"></script>

</body>
</html>
