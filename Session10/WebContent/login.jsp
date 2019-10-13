<%@ page import="co.edureka.controller.JDBCHelper"%>
<%@ page import="co.edureka.model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>

	<center>

	<h4>Logging In ${param.txtEmail} .....</h4>

	<%
		// Extract Data from Request
		User user = new User();
		user.email = request.getParameter("txtEmail");
		user.password = request.getParameter("txtPassword");
		
		// Saving the Data in Table in DataBase
		JDBCHelper db = new JDBCHelper();
		db.createConnection();
		db.loginUser(user);
		db.closeConnection();
	
		if(user.uid>0){
			
			// 1. Session Tracking - Cookies
			/*Cookie ck1 = new Cookie("keyName", user.name);
			Cookie ck2 = new Cookie("keyEmail", user.email);
			
			response.addCookie(ck1);
			response.addCookie(ck2);*/
			
			// 2. HttpSession Object
			// session is ref var implcitly available and pointing to HttpSession Object
			session.setAttribute("keyUser", user);
			//pageContext.setAttribute("keyUser", user, PageContext.SESSION_SCOPE);
			
			// 3. and 4 : explore yourself
			// Hidden FormFields and URL Re-Writing
			
	%>
			<%-- <h3>Thank You !! Login Successfully Done !! Welcome, <%= user.name %></h3>
			<a href="welcome.jsp">Click to Enter Home Page</a> --%>
			
			<jsp:forward page="welcome.jsp"/>
			
	<%				
		}else{
			response.sendRedirect("https://google.co.in");
	%>		
			<h3>Sorry !! Please try Again !!</h3>
	<%		
		}
		
	%>
	
	</center>

</body>
</html>