<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="banner.jsp">
		<jsp:param value="Administrator" name="user"/>
	</jsp:include>
	<form action="add-course.do" method="post">
		<div>
			<label> 
				Enter Course Code: 
				<input type="text" name="courseCode" />
			</label>
		</div>
	
		<div>
			<label> 
				Enter Course Name: 
				<input type="text" name="courseName" />
			</label>
		</div>
		<div>
			<label>
				Enter Course Duration:
				<input type="number" name="duration" />
			</label>
		</div>
		<div>
			<label>
				Enter Fees:
				<input type="text" name="fees" />
			</label>
		</div>
		<input type="submit" value="Add New Course" />
	</form>
</body>
</html>