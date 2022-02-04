<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html><%@ page isELIgnored="false" %>
<body>
<h2>Welcome to Customer Management Application</h2>

<c:url value="/showForm" var="url"/>
 <a href="<c:out value='${url}'/>">Click Here</a>
</body>
</html>
