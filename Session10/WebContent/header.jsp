<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Shopping World</title>
</head>
<body>

	<%
		Date date = new Date();
	%>

	<center>
		================================
		<br/>
		<h3>Welcome to Shopping World !!</h3>
		[<%= date %>]
		<br/>
		================================
	</center>

</body>
</html>