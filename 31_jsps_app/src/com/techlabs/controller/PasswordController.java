package com.techlabs.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/PasswordController")
public class PasswordController extends HttpServlet {
	
    public PasswordController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		String password= request.getParameter("password");
		
//		session using http session
		HttpSession session=request.getSession(false);  
		String username =(String)session.getAttribute("username");  
		
		response.getWriter().print("Welcome: "+username);
		response.getWriter().print("<br>password: "+password);
			
		
		
//		session Using cookies
//	     String username = null;
//		Cookie cookies[] = request.getCookies();
//		for (Cookie cookie : cookies) {
//			   if (cookie.getName().equals("username")) {
//				   username = cookie.getValue();
//			    }
//			  }
//		response.getWriter().print("Welcome: "+username);
//		response.getWriter().print("<br>password: "+password);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
