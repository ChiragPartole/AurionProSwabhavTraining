package com.techlabs.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlabs.entity.Account;
import com.techlabs.entity.Customer;
import com.techlabs.model.AccountsDB;

/**
 * Servlet implementation class AccountGenerationController
 */
@WebServlet("/AccountGenerationController")
public class AccountGenerationController extends HttpServlet {
	
    public AccountGenerationController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher requestDispatcher = null;
		HttpSession session = request.getSession(false);
		try {
		
		int accountID = Integer.parseInt(request.getParameter("accountID"));
		int customerID = 0;
			customerID = (int) session.getAttribute("idSelected");
			
		
		double balance = Double.parseDouble(request.getParameter("balance"));

		int accountNumber = (int) Math.floor(100000000 + Math.random() * 900000000);
		AccountsDB accountsDB = AccountsDB.getAccountDb();
		accountsDB.connectToDb();

		if(balance >= 0) {
			
			
			accountsDB.addAccount(accountID,accountNumber,balance,customerID);
			
		
//			System.out.println(selectedCustomer.get(4));
//			accountsDB.addUser();
			String operationDone = "Added new account";
			session.setAttribute("operationDone", operationDone);
			requestDispatcher = request.getRequestDispatcher("/Admin.jsp");
		}else {
			String exception = "negative balance entered";
			request.setAttribute("exception", exception);
			
			requestDispatcher = request.getRequestDispatcher("/Exceptions.jsp");
			
		}
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
