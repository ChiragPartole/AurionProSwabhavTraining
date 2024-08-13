package com.techlabs.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.entity.Account;
import com.techlabs.entity.Customer;
import com.techlabs.model.AccountsDB;
import com.techlabs.model.CustomersDB;

@WebServlet("/ViewAccountsController")
public class ViewAccountsController extends HttpServlet {
	
    public ViewAccountsController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher requestDispatcher = null;
		AccountsDB accountsDb = AccountsDB.getAccountDb();
	    accountsDb.connectToDb();
		
		List<Account> accounts = accountsDb.getAllAccounts();
		request.setAttribute("accounts", accounts);
		
		requestDispatcher = request.getRequestDispatcher("/ViewAccounts.jsp");
		requestDispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
