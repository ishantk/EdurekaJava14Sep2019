<%@page import="co.edureka.model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page buffer="8kb" %>
<%@ page isThreadSafe="true" %> <!-- Synchronized -->    
<%@ page errorPage="errorpage.jsp" %> 	<!-- Link the Page which will Handle Exceptions -->
<%@ include file="header.jsp" %>   		<!-- HTML or JSP -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Tags</title>
</head>
<body>

<center>

	<h3>Welcome to JSP</h3>
	
	<h4>Area of Circle with radius 12.12 is: <% out.print(area(12.12)); %> </h4>
	<%-- a is: <% out.print(a); %> error --%>
	
	<h4>Scriptlet Tag:</h4>
	<%
		
		int a = 10, b=20;
		int sum = a + b;
		out.print("Sum is: "+sum); // out Implicitly Available in JSP as Reference to PrintWriter Object
	%>
	
	<br>
	a is: <% out.print(a); %>
	
	<h4>Declarative Tag:</h4>
	<%!
		
		double PI = 3.14;
		double area(double radius){
			return PI * radius * radius;
		}
	%>
	
	<jsp:include page="header.jsp"/>
	
	<h4>Area of Circle with radius 2.2 is: <% out.print(area(2.2)); %> </h4>
	<h4>Area of Circle with radius 21.21 is: <%= area(2.2) %> </h4>
	<h4>Area of Circle with radius 3.3 is: <%= area(3.3) %> </h4>

	<%
		int[] array = {10, 20, 30, 40, 50};
	%>
	
	<%-- <h4>Element at 14th Index is: <%= array[14] %></h4> --%>
	
	
	<%
		// Object Construction in Java
		User uRef1 = new User();
		// Using Setter Methods to Write Data in Object
		uRef1.setUid(101);
		uRef1.setName("Mike");
		uRef1.setEmail("mike@example.com");
		uRef1.setPassword("mike123");
	%>
	<br/>
	<h4><%=uRef1.getName() %> Details: [  <%= uRef1.getUid() %>  | <%= uRef1.getEmail() %> | <%= uRef1.getPassword() %>]</h4>	
	<!-- Object Construction in JSP Action Tag  -->
	<jsp:useBean id="uRef2" class="co.edureka.model.User"/>
	<!-- Set data in Object -->
	<jsp:setProperty property="uid" name="uRef2" value="201"/>
	<jsp:setProperty property="name" name="uRef2" value="Fionna"/>
	<jsp:setProperty property="email" name="uRef2" value="fionna@example.com"/>
	<jsp:setProperty property="password" name="uRef2" value="fionna123"/>
	
	<h4>
	<jsp:getProperty property="name" name="uRef2"/> [  <jsp:getProperty property="uid" name="uRef2"/>  | <jsp:getProperty property="email" name="uRef2"/> | <jsp:getProperty property="password" name="uRef2"/>]</h4>
	
	
	<c:forEach var="i" begin="1" end="10">
		<c:out value="${i}"/> <br/>
	</c:forEach>

</center>

</body>
</html>