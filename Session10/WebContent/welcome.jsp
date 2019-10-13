<%@ page import="co.edureka.model.User"%>
<%@ page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
</head>
<body>

	<%
		/*User user = new User();
	
		Cookie[] ckArr = request.getCookies();
		
		for(Cookie ck : ckArr){
			if(ck.getName().equals("keyName")){
				user.name = ck.getValue();
			}
			
			if(ck.getName().equals("keyEmail")){
				user.email = ck.getValue();
			}
		}*/
		
		User user = (User)session.getAttribute("keyUser");
		//User user = pageContext.getAttribute("keyUser", PageContext.SESSION_SCOPE);
	%>

	<center>
		<h3>Welcome User <%= user.name %></h3>
		[ <%= user.email %> ]
		
		<%
			Date date = new Date();
		%>
		
		<h4>Its: <%= date %></h4>
		
	</center>

</body>
</html>