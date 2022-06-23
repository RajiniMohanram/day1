<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	<style type="text/css">
		header{
			display: inline-block;
			height: 100px;
			border-bottom: 1px solid;
			background-color: #abc4ed;
			width: 100%;
		}
		span{
			float:right;
		}
	</style>
</head>
<body>
	<header>
		Softeon Institute
	</header>
	<span>Hello ${param.user}</span>
</body>
</html>