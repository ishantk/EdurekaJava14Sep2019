package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.edureka.model.User;


@WebServlet({ "/Welcome", "/Home" })
public class WelcomeServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//User user = new User();
		
		// Read All Cookies together !!
		/*Cookie[] ckArr = request.getCookies();
		
		for(Cookie ck : ckArr) {
			if(ck.getName().equals("keyName")) {
				user.name = ck.getValue();
			}
			
			if(ck.getName().equals("keyEmail")) {
				user.email = ck.getValue();
			}
		}*/
		
		//user.name = request.getParameter("name");
		//user.email = request.getParameter("email");
		
		//user.name = request.getParameter("txtName");
		//user.email = request.getParameter("txtEmail");
		
		HttpSession session = request.getSession();
		User user = (User)session.getAttribute("keyUser");
		
		Date date = new Date();
		
		//Acknowledge back User with response
		response.setContentType("text/html"); // Type of Response (MIME)
		// To write response to the client we use PrintWriter Object
		PrintWriter out = response.getWriter();
		
		String htmlResponse = "<html><body><center><br/><br/><h3>Welcome Home,"+user.name+"<br/>"+user.email+" <br/>Its: "+date.toString()+"</h3></center></body></html>";
		
		out.print(htmlResponse);
	
	}

}
