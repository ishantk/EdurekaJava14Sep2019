<%@ page import="java.sql.Statement"%>
<%@ page import="java.sql.ResultSet"%>
<%@ page import="java.sql.DriverManager"%>
<%@ page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	
	// We will be exepcting name from the request
	String name = request.getParameter("name");

	try{
		
		// 1. Load the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// 2. Create Connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/edureka", "root", "");
		
		// 3. Write and Execute SQL Statement
		String sql = "select * from User where name like '"+name+"%'";
		Statement st = connection.createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		// Sending Response Back to Client with name and email from Table
		while(rs.next()){
			String str = rs.getString(2)+" | "+rs.getString(3);
			out.print(str+"<br/>");
		}
		
		// 4. Close conenction
		connection.close();
		
	}catch(Exception e){
		out.print("Something Went Wrong !!");
	}

%>    
