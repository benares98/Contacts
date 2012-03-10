<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Contacts</title>
</head>
<body>
	<form name="contacts">
		<table border=0>
			<tr>
				<td valaign="top" width=175>
					Contacts
					<br>
					<button type="button">Add Contact</button>
					<c:if test="${fn:length(contactList) >0}">
					<select name="name" size=${fn:length(contactList)}>
						<c:forEach items="${userList}" var="contact">
							<option value="${user.name}">${user.name}</option>
						</c:forEach>
					</select>
					</c:if>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>