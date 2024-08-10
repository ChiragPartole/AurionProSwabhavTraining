package com.techlabs.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		String username= request.getParameter("username");
		
//		session using http session
		HttpSession session=request.getSession();  
        session.setAttribute("username",username);  
        
        response.getWriter().print("Welcome: "+username);
		response.getWriter().print("<form action='PasswordController' method='post'>"
				+ "password:<input type='password' name='password'></input>"
				+ " <input type='submit'></input></form>");
		
		
//		session using cookies
//		Cookie cookie1 = new Cookie("username", username);
//		
//		response.getWriter().print("Welcome: "+username);
//		response.getWriter().print("<form action='PasswordController' method='post'>"
//				+ "password:<input type='password' name='password'></input>"
//				+ " <input type='submit'></input></form>");
//		response.addCookie(cookie1);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
