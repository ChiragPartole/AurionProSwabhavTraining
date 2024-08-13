package com.techlabs.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/TransactionTypeController")
public class TransactionTypeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public TransactionTypeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher requestDispatcher = null;
		HttpSession session = request.getSession(false);
		
		String transactionType = request.getParameter("transactiontype");
		System.out.println(transactionType);
		
		request.setAttribute("transactionType", transactionType);
		session.setAttribute("transactionType", transactionType);
		requestDispatcher = request.getRequestDispatcher("/NewTransaction.jsp");
		
		requestDispatcher.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}