<%@ page import="co.edureka.controller.JDBCHelper"%>
<%@ page import="co.edureka.model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
</head>
<body>

	<%
		// Extract Data from Request
		User user = new User();
		user.name = request.getParameter("txtName");
		user.email = request.getParameter("txtEmail");
		user.password = request.getParameter("txtPassword");
		
		// Saving the Data in Table in DataBase
		JDBCHelper db = new JDBCHelper();
		db.createConnection();
		int i = db.registerUser(user);
		db.closeConnection();
	
		if(i>0){
	%>
			<h3>Thank You !! You are Registered with us dear, <%= user.name %></h3>
	<%				
		}else{
	%>		
			<h3>Sorry !! You are Not Registered with us, <%= user.name %> Please try Again !!</h3>
	<%		
		}
		
	%>

</body>
</html>