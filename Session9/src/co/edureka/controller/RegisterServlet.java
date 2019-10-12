package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.edureka.model.User;

/*
	
	interface Servlet{
		void init(ServletConfig config);
		void destroy();
		void service(HttpServletRequest request, HttpServletResponse response);
	}
	
	class GenericServlet implements Servlet{
		void init(ServletConfig config){}
		void destroy(){}
		void service(HttpServletRequest request, HttpServletResponse response){}
	}
	
	class HttpServlet extends GenericServlet{
		void doGet(){}
		void doPost(){}
		void doPut(){}
		void doTrace(){}
		void doDelete(){}
	}
	
	class RegisterServlet extends HttpServlet{
		// Whatever kind of method you wish to use, simply override it
	}
	
 */
@WebServlet({ "/RegisterServlet", "/Register" })
public class RegisterServlet extends HttpServlet {

	// Typically, we override the methods we need !!
	
	// executed when object of RegisterServlet will be created. Acts as Constructor
	public void init(ServletConfig config) throws ServletException {
		System.out.println(">> RegisterServlet init executed");
	}

	// executed when object of RegisterServlet will be removed from Server. Acts as Destructor	
	public void destroy() {
		System.out.println(">> RegisterServlet destroy executed");
	}

	// executed whenever client sends a request to RegisterServlet for both get and post and others as well
	// Request data from client will be available HttpServletRequest
	// Response can be sent back by HttpServletResponse
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(">> RegisterServlet service executed");
		
		// 1. Create User Object
		User user = new User();
		
		// 2. Read the Request Data and put it in User Object
		user.name = request.getParameter("txtName");
		user.email = request.getParameter("txtEmail");
		user.password = request.getParameter("txtPassword");
		
		System.out.println(">> User Details: "+user);
		
		// 3. Saved the data of User Object permanently in DataBase
		JDBCHelper db = new JDBCHelper();
		db.createConnection();
		int i = db.registerUser(user);
		db.closeConnection();
		
		// 4. Acknowledge back User with response
		response.setContentType("text/html"); // Type of Response (MIME)
		// To write response to the client we use PrintWriter Object
		PrintWriter out = response.getWriter();
		
		//out.print("test	1");
		
		String message = "";
				
		if(i>0) {
			message = user.name+" Registered Successfully";
		}else {
			message = user.name+" Not Registered Successfully";
		}
		
		String htmlResponse = "<html><body><center><br/><br/><h3> Resposne Message: "+message+"</h3></center></body></html>";
		
		//out.print(message);
		out.print(htmlResponse); // print function on PrintWriter Object will send back HTML response for us to client
	}

}
