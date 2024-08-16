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
import com.techlabs.model.TransactionsDB;

@WebServlet("/UserController")
public class UserController extends HttpServlet {
	
    public UserController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher requestDispatcher = null;
		String action = request.getParameter("action");
		
		
	    HttpSession session = request.getSession(false);

		request.setAttribute("action", action);
		
		if("passbook".equals(action)) {
			requestDispatcher = request.getRequestDispatcher("/PassbookHome.jsp");
		}else if("newTransaction".equals(action)) {
			requestDispatcher = request.getRequestDispatcher("/NewTransaction.jsp");
		}else if("editProfile".equals(action)) {
			requestDispatcher = request.getRequestDispatcher("/EditProfile.jsp");
		}else if("checkbalance".equals(action)) {
			TransactionsDB db = TransactionsDB.getDbTransactions();
			db.connectToDb();
			System.out.println("getDifferentAccountsForSameCustomer, "+session.getAttribute("username"));
			List<Account> accounts = db.getDifferentAccountsForSameCustomer((String)session.getAttribute("username"));
			
		
			
			request.setAttribute("accounts", accounts);
			requestDispatcher = request.getRequestDispatcher("/CheckBalance.jsp");
		}else {
			requestDispatcher = request.getRequestDispatcher("/Exceptions.jsp");

		}
		
		requestDispatcher.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
