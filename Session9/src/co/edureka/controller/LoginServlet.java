package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.edureka.model.User;


@WebServlet({ "/LoginServlet", "/Login" }) // URL Mappings
public class LoginServlet extends HttpServlet {

	// doPost will be executed only if client sends a post request to LoginServlet
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(">> LoginServlet doPost Executed");
		
		// 1. Create User Object
		User user = new User();
		
		// 2. Read the Request Data and put it in User Object
		user.email = request.getParameter("txtEmail");
		user.password = request.getParameter("txtPassword");
		
		System.out.println(">> User Details: "+user);
		
		// 3. Saved the data of User Object permanently in DataBase
		JDBCHelper db = new JDBCHelper();
		db.createConnection();
		db.loginUser(user);
		db.closeConnection();
		
		// 4. Acknowledge back User with response
		response.setContentType("text/html"); // Type of Response (MIME)
		// To write response to the client we use PrintWriter Object
		PrintWriter out = response.getWriter();
		
		//out.print("test	1");
		
		String message = "";
				
		if(user.uid>0) {
			message = user.name+" Logged In Successfully";
		}else {
			message = user.name+" Not Logged In Successfully";
		}
		
		String htmlResponse = "<html><body><center><br/><br/><h3> Resposne Message: "+message+"</h3></center></body></html>";
		
		//out.print(message);
		out.print(htmlResponse); // print function on PrintWriter Object will send back HTML response for us to client
	}

}
