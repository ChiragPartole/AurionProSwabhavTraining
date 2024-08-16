package com.techlabs.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlabs.model.TransactionsDB;
import com.techlabs.model.UsersDB;


@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher requestDispatcher = null;
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String role = request.getParameter("role");

		UsersDB dbUsers = UsersDB.getdbUsers();
		
		dbUsers.connectToDb();
	
		
		
		HttpSession session = request.getSession(); 
		session.setAttribute("username", username);
		
		session.setAttribute("role", role);
		if(dbUsers.validateCredentials(username, password,role)) {
			
			session.setAttribute("username", username);
			session.setAttribute("password", password);
			
			request.setAttribute("username", username);
			if("admin".equals(role)) {	
				requestDispatcher = request.getRequestDispatcher("/Admin.jsp");
			}
			else {
				
				requestDispatcher = request.getRequestDispatcher("/Customer.jsp");
				
			}
		}
		else {
			request.setAttribute("role", role);
			requestDispatcher = request.getRequestDispatcher("/LoginFailed.jsp");
		}
		
		requestDispatcher.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
