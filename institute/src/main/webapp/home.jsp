<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="join-courses.do" method="post">
		<%
			Map<String, String> allCourses = (Map<String, String>) application.getAttribute("courses");
			for (String course : allCourses.keySet()) {
		%>

			<div>
				<label> <input type="checkbox" name="course" value="<%=course%>"><%=course%>
				</label>
			</div>
		<%
			}
		%>
		
		<input type="submit" value="Join" />
	</form>
</body>
</html>