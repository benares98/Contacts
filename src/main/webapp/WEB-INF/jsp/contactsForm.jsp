<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link rel=stylesheet type="text/css" href="/Contacts/contacts.css">

<title></title>
</head>
<body>
	<div id="container">
		<div id="row">
			<div id="left">
				<div class="column-in"></div>
			</div>
			<div id="middle">
				<div class="column-in">
					<p>Granny's Addressbook</p>
					<div class="contactBox">
						<form:form id="meow" name="contactForm" action="add.htm"
							commandName="contact">
							<table>
								<tr>
									<td><form:hidden path="id" /></td>
									<td>Name :</td>
									<td><form:input path="name" /></td>
								</tr>
								<tr>
									<td>Address :</td>
									<td><form:input path="address" /></td>
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
					</div>
				</div>
			</div>
			<div id="right">
				<div class="column-in">
					<div class="contactList">
						<form:form>
							<table>
								<tr>
									<td ><select id="formList"
										size="${fn:length(contactList) + 10}">
											<option value="new">New Contact</option>
											<c:forEach items="${contactList}" var="contact"
												varStatus="status">
												<option value="${contact.id}">${contact.name}</option>
											</c:forEach>
									</select></td>
								</tr>
							</table>
						</form:form>
					</div>
				</div>
				<div class="column-in">
					<div class="deleteBox">			
						<c:if test="${fn:length(contactList) > 0}">
							<form>
								<input type="button" value="delete" onclick="deleteContact();" />
							</form>
						</c:if>
					</div>
				</div>
			</div>
		</div>
		
	</div>
</body>
<script type="text/javascript" src="/Contacts/contacts.js"></script>
</html>
