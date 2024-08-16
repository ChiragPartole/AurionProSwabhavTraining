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

import com.techlabs.model.CustomersDB;



@WebServlet("/AdminController")
public class AdminController extends HttpServlet {
	
    public AdminController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher requestDispatcher = null;
		String action = request.getParameter("action");
		
		
	    HttpSession session = request.getSession(false);

		request.setAttribute("action", action);

		if("addCustomer".equals(action)) {
			requestDispatcher = request.getRequestDispatcher("/AddNewCustomers.jsp");
		}else if("addAccount".equals(action)) {
			
			CustomersDB customersDb = CustomersDB.getDbCustomers();
			List<Integer> customerIdList = customersDb.getAllCustomerIds();
			
			session.setAttribute("customerIDList", customerIdList);
			
			requestDispatcher = request.getRequestDispatcher("/AddBankAccount.jsp");
		}else if("viewCustomer".equals(action)) {
			
			requestDispatcher = request.getRequestDispatcher("/ViewCustomersHome.jsp");
		}else if("viewTransactions".equals(action)) {
			
			requestDispatcher = request.getRequestDispatcher("ViewTransactionsHome.jsp");
		}
		
		else {
			
				String exception = "Tried to go to another page with url without logging in.";
				request.setAttribute("exception", exception);
				
				requestDispatcher = request.getRequestDispatcher("/Exceptions.jsp");
			
			
		}
		
		
		requestDispatcher.forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
