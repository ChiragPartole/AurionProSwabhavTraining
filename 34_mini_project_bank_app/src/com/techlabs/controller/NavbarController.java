package com.techlabs.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlabs.model.UsersDB;


@WebServlet("/NavbarController")
public class NavbarController extends HttpServlet {
	

    public NavbarController() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher requestDispatcher = null;
		String action = request.getParameter("action");
		

	
		
		HttpSession session = request.getSession(); 
		
		if("home".equals(action)) {	
			requestDispatcher = request.getRequestDispatcher("/Admin.jsp");
		}
		else if("homeUser".equals(action)) {	
			requestDispatcher = request.getRequestDispatcher("/Customer.jsp");
		}else if("admin".equals(action)) {
			requestDispatcher = request.getRequestDispatcher("/Admin.jsp");
		}else if("user".equals(action)) {
			requestDispatcher = request.getRequestDispatcher("/Admin.jsp");
		}
		requestDispatcher.forward(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
