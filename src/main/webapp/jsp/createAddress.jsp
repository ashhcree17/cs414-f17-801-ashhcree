<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
	<head>
		<style type="text/css">
			h2 {
				background-color: #c7c7c7;
			    font-family:Arial, sans-serif;
			    font-size:34px;
			    text-align: center;
			    padding:10px 5px;
			    border-style:solid;
			    border-width:1px;
			    overflow:hidden;
			    word-break:normal;
			    border-color:#ccc;
			    color:#333;
			}
			
			body {
			    background-color: #f0f0f0;
			    font-family:Arial, sans-serif;
			    font-size:14px;
			    font-weight:normal;
			    padding:10px 5px;
			    overflow:hidden;
			    word-break:normal;
			    color:#333;
			    border:none;
			}
		</style>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Address Registration</title>
	</head>
	<body>
		<form:form id="regForm" modelAttribute="address" action="createAddressProcess"
			method="post">
			<table>
				<tr>
					<td><form:label path="addressid">Address Id:</form:label></td>
					<td><form:input path="addressid" name="addressid" id="addressid" /></td>
				</tr>
				<tr>
					<td><form:label path="street1">Street 1</form:label></td>
					<td><form:input path="street1" name="street1" id="street1" /></td>
				</tr>
				<tr>
					<td><form:label path="street2">Street 2</form:label></td>
					<td><form:input path="street2" name="street2" id="street2" /></td>
				</tr>
				<tr>
					<td><form:label path="city">City</form:label></td>
					<td><form:input path="city" name="city" id="city" /></td>
				</tr>
				<tr>
					<td><form:label path="state">State</form:label></td>
					<td><form:input path="state" name="state" id="state" /></td>
				</tr>
				<tr>
					<td><form:label path="zipcode">Zip Code</form:label></td>
					<td><form:input path="zipcode" name="zipcode" id="zipcode" /></td>
				</tr>
	
				<tr>
					<td></td>
					<td><form:button id="register" name="register">Register</form:button></td>
				</tr>
				<tr></tr>
				<tr>
					<td></td>
					<td><a href="welcome">Manager Home</a></td>
				</tr>
			</table>
		</form:form>
	</body>
</html>