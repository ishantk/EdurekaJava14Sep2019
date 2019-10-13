package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.edureka.model.User;


@WebServlet({ "/LoginServlet", "/Login" }) // URL Mappings
public class LoginServlet extends HttpServlet {

	// doPost will be executed only if client sends a post request to LoginServlet
	//protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
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
		String url = "<a href='Home'>Enter Home</a>"; // Home -> Welcome Servlet
		
		// 2. Session Tracking - URL-ReWriting
		//String url = "<a href='Home?name="+user.name+"&email="+user.email+"'>Enter Home</a>";
		
		// 3. Session Tracking - Hidden Form Field
		/*String url = "<form action='Home' method='post'>"
				+ "<input type='hidden' name='txtName' value='"+user.name+"'/>"
				+ "<input type='hidden' name='txtEmail' value='"+user.email+"'/>"
				+ "<input type='submit' value='Click to Enter Home'/>"
				+ "</form>";*/
		
		
		
		
		if(user.uid>0) {
			message = user.name+" Logged In Successfully";
			
			// 1. Session Tracking - Cookies
			// In Cookies, Key and Value both must be Strings
			/*Cookie ck1 = new Cookie("keyName", user.name);
			Cookie ck2 = new Cookie("keyEmail", user.email);
			
			//ck1.setMaxAge(expiry);
			
			// We are going to save these cookies in client's machine
			response.addCookie(ck1);
			response.addCookie(ck2);*/
			
			// 4. Session Tracking - HttpSession Object
			HttpSession session = request.getSession();
			session.setAttribute("keyUser", user); // Store the entire user Object directly | Key-Value Pair
			
		}else {
			//message = user.name+" Not Logged In Successfully";
			response.sendRedirect("https://google.co.in"); // we can also redirect to any local resource
		}
		
		String htmlResponse = "<html><body><center><br/><br/><h3> Resposne Message: "+message+"</h3>"+url+"</center></body></html>";
		
		//out.print(message);
		out.print(htmlResponse); // print function on PrintWriter Object will send back HTML response for us to client
	}

}
