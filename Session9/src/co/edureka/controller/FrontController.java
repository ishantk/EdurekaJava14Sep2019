package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({ "/FrontController", "/Front", "/Shop" })
public class FrontController extends HttpServlet {

	// Can Handle any type of HTTP Request
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Acknowledge back User with response
		response.setContentType("text/html"); // Type of Response (MIME)
		// To write response to the client we use PrintWriter Object
		PrintWriter out = response.getWriter();
		String htmlResponse = "<html><body><center><br/><br/><h3>Welcome to Shop</h3></center></body></html>";

		// This response is not shared back to the client
		out.print(htmlResponse); // Lets Print HTML Response Here
		
		String type = request.getParameter("txtType");
		
		if(type.equals("Register")) {
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("Register");
			dispatcher.forward(request, response);
			
		}else if(type.equals("Login")) {
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("Awesome");
			dispatcher.forward(request, response); 
			//dispatcher.include(request, response);
			
		}else {
			out.print(htmlResponse);
		}
		
	}

}
