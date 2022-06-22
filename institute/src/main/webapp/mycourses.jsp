<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>My Courses</h1>
	<ul>
	<%
		Map<String, String> allCourses = (Map<String, String>) session.getAttribute("userCourses");
		for (String course : allCourses.keySet()) {
	%>
		<li><%= course %></li>
	<%
		}
	%>
	</ul>
</body>
</html>