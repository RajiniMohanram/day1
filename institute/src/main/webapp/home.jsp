<%@page import="java.util.*, model.Course"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>	

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="banner.jsp">
		<jsp:param value="Student" name="user"/>
	</jsp:include>
	<form action="join-courses.do" method="post">
		<c:forEach var="c" items="${applicationScope.courses}">
			<c:if test="${c.value.duration > 2 }">
				<div>
					<label> 
						<input type="checkbox" name="course" value="${c.key}">
						${c.value.courseName}
					</label>
				</div>		
			</c:if>
		</c:forEach>
		<input type="submit" value="Join" />
	</form>
</body>
</html>