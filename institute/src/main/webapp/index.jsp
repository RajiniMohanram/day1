<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="banner.jsp">
		<jsp:param value="Guest" name="user"/>
	</jsp:include>
	<% java.util.Date today = new java.util.Date(); %>
	
	<h3>
		Login Date:
		<fmt:formatDate value="<%= today %>" pattern="dd-MMM-yyyy"/>
	</h3>
	
	
	<form action="login.do" method="post">
		<div>
			<label>
				Enter Username:<input type="text" name="username" />
			</label>
		</div>
		<div>
			<label>
				Enter Password: <input type="password" name="password" />
			</label>
		</div>
		<div>
			<input type="submit" value="Login" />
			<input type="reset" value="Clear" />
		</div>
	</form>
	<span style="color:red">${err}</span>
</body>
</html>