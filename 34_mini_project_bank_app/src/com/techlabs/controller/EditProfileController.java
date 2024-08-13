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


@WebServlet("/EditProfileController")
public class EditProfileController extends HttpServlet {

    public EditProfileController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher requestDispatcher = null;	
		
	    HttpSession session = request.getSession(false);
	    
	    try {
	    	
	    String currentUsername = request.getParameter("currentusername");
	   
	    String username = request.getParameter("username");
	    String password = request.getParameter("password");
	    
	    
	    UsersDB dbUsers = UsersDB.getdbUsers();
	    dbUsers.connectToDb();
	    
	    dbUsers.changeDetails(currentUsername,username,password);
	    requestDispatcher = request.getRequestDispatcher("/Login.jsp");
	    
	    String operationDone = "Successfully changed username and password!! Login again";
	    session.setAttribute("operationDone", operationDone);
	    }catch(Exception e) {
			String exception = e.getMessage();
			request.setAttribute("exception", exception);
			System.out.println(e.getMessage());
			requestDispatcher = request.getRequestDispatcher("/Exceptions.jsp");
		}
	    requestDispatcher.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
