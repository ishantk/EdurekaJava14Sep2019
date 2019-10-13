<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %> <!-- Setting the JSP Page as Error Page -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Error</title>
</head>
<body>

	<center>
		<h3>OOPS !! Something Went Wrong !!</h3>
		[ <%= exception %> ]   <!-- exception is ref var pointing to Object of Exception -->
		<br/>
		[Error Message: <%= exception.getMessage() %>]
		<br/>
	</center>

</body>
</html>