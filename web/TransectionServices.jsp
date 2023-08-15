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
		<h2>Add new transaction</h2>
		<s:form action="TransectionSelectServicesData" class="filterPanel">
			<s:textfield name="patientId" label="Patient ID"  class="formTextField"/>
			<s:textfield name="doctorId" label="Doctor ID" class="formTextField"/>
		</s:form>
	</div>


	<div align="center">
		<h2>Services list</h2>
		<s:form action="TransectionSelectServicesData" class="filterPanel">
			<s:textfield name="name" label="Service Name" class="formTextField"/>
			<s:hidden name="patientId" value="%{#parameters.patientId}" />
			<s:hidden name="doctorId" value="%{#parameters.doctorId}" />
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
					href="AddTransactionAction?FK_Doctor=<s:property value="doctorId"/>&
				FK_Patient=<s:property value="patientId"/>&Fk_Service=<s:property value="#Services.id"/>">
						<button class="actionBtn" >Add</button>
					</a>
				</td>
			</tr>
		</s:iterator>

	</table>
	<script>
		function addServiceConfirmation() {
			var confirmation = confirm('Do you want to add another service to the patient?');

			if (confirmation) {
				// User clicked "Yes", perform any additional actions or redirect here
			} else {
				window.location.href = 'TransactionAdd.jsp'; // Replace 'another-page.jsp' with the desired URL
			}
		}
	</script>
</body>
</html>
