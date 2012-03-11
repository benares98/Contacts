<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style type="text/css">
.even {
	background-color: silver;
}
</style>
	
<title>Registration Page</title>
</head>
<body>

<form:form name="contactForm" action="add.htm" commandName="contact">
	<table>
		<tr>
			<td>Name :</td>
			<td><form:input path="name" /></td>
		</tr>
		<tr>
			<td>Address :</td>
			<td><form:textarea path="address" /></td>
		</tr>
		<tr>
			<td>Phone :</td>
			<td><form:input path="phone" /></td>
		</tr>
		<tr>
			<td>Email :</td>
			<td><form:input path="email" /></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="Save Contact"></td>
		</tr>
	</table>
</form:form>
<form:form>
	<table>
		<tr>
			<td valign="top" width=600>
				<select id="formList">
					<c:forEach items="${contactList}" var="contact" varStatus="status">
						<option value="${contact.name}">${contact.name}</option>
					</c:forEach>
				</select>
			</td>
		</tr>
	</table>
</form:form>
<c:if test="${fn:length(contactList) > 0}">
	<table >
		<tr class="even">
			<th>Name</th>
			<th>Address</th>
			<th>Phone</th>
			<th>Email</th>
		</tr>
		<c:forEach items="${contactList}" var="contact" varStatus="status">
			<tr class="<c:if test="${status.count % 2 == 0}">even</c:if>">
				<td>${contact.name}</td>
				<td>${contact.address}</td>
				<td>${contact.phone}</td>
				<td>${contact.email}</td>
			</tr>
		</c:forEach>
	</table>
</c:if>
</body>
<script>
	function redirectToEditContact() {  
		 window.location = window.location.hostname + '/edit/' + this.options[this.selectedIndex].value;
		}  

		// add event listener to contactList
		var el = document.getElementById("formList");   
		el.addEventListener("click", redirectToEditContact, false);

	</script>
</html>
