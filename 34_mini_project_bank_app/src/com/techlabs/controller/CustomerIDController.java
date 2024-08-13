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

import com.techlabs.entity.Customer;
import com.techlabs.model.CustomersDB;


@WebServlet("/CustomerIDController")
public class CustomerIDController extends HttpServlet {
	
    public CustomerIDController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher requestDispatcher = null;
		try {
			
		int idSelected = Integer.parseInt(request.getParameter("idSelected"));
		System.out.println(idSelected);
		CustomersDB customersDb = CustomersDB.getDbCustomers();
		customersDb.connectToDb();
		
		System.out.println(customersDb.customerIDExists(idSelected));
		Customer selectedCustomer = customersDb.displayCustomer(idSelected);
		HttpSession session = request.getSession(false);
		
		session.setAttribute("idSelected", idSelected);
		session.setAttribute("selectedCustomer", selectedCustomer);
		
		requestDispatcher = request.getRequestDispatcher("/AddBankAccount.jsp");
		request.setAttribute("action", "addAccount");
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
