<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<sql:query var="rs" dataSource="bankDB">
		SELECT * FROM ifsc;
	</sql:query>


	<h1>Add New Account</h1>
	<form action="add-account.do" method="post">
		<div>
			<label>
				Account Number: 
				<input type="text" name="accountNumber" value="<%= Math.round(Math.random()*10000) %>" readonly/>
			</label>
		</div>
		<div>
			<label>
				Account Name: <input type="text" name="accountName" />
			</label>
		</div>
		<div>
			<label>
				Opening Balance:
				<input type="number" name="accountBalance" />
			</label>
		</div>
		<div>
			<label>
				Bank Branch:
				<select name="ifsc">
					<c:forEach items="${rs.rows}" var="row">
						<option value="${row.ifsc_code }">${row.branch}-${row.city}</option>
					</c:forEach>
				</select>
			</label>
		</div>
		<div>
			<input type="submit" value="Add Account"/>
			<input type="reset" value="Clear" />
		</div>
	</form>
	
	<c:if test="${not empty msg}">
		<span style="color:green">${msg}</span>
	</c:if>
	<c:if test="${not empty err }">
		<span style="color:red">${err}</span>
	</c:if>
	
	
	
	
	
	
	
	
</body>
</html>