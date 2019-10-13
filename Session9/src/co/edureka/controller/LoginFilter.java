package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;


@WebFilter("/LoginFilter")
public class LoginFilter implements Filter {

    
    public LoginFilter() {
        // TODO Auto-generated constructor stub
    }

	
	public void destroy() {
		System.out.println(">> LoginFilter destroy executed");
	}


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		//Acknowledge back User with response
		response.setContentType("text/html"); // Type of Response (MIME)
		// To write response to the client we use PrintWriter Object
		PrintWriter out = response.getWriter();

		out.print(">> PRE-PROCESSING");
		
		// Validation can be done by Filter itself
		String email = request.getParameter("txtEmail");
		String password = request.getParameter("txtPassword");
		
		
		if(email.isEmpty() || password.isEmpty()) {
			out.print("Credentails Missing !!");
		}else {
			// pass the request along the filter chain
			chain.doFilter(request, response); // Forwarding Request and Response to the Servlet
		}
		
		out.print("<< POST-PROCESSING");
	}


	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println(">> LoginFilter init executed");
	}

}
