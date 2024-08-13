package com.techlabs.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlabs.entity.Customer;
import com.techlabs.model.CustomersDB;

@WebServlet("/CustomerController")
public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public CustomerController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher requestDispatcher = null;
		try {
			
		
		int customerID = Integer.parseInt(request.getParameter("customerID"));
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		HttpSession session = request.getSession(false);
		
		CustomersDB customersDb = CustomersDB.getDbCustomers();
		customersDb.connectToDb();
		
		if(!customersDb.customerIDExists(customerID)) {
			System.out.println("going to add new user");
			customersDb.addUser(email, password);
			
			
			System.out.println("going to addnewcustomer");
			customersDb.addNewCustomer(customerID,firstname,lastname,email,password);
			
			String operationDone = "Added new customer";
			session.setAttribute("operationDone", operationDone);
			
			String username= (String) session.getAttribute("username");
			String userpassword = (String) session.getAttribute("password");
		
			
			requestDispatcher = request.getRequestDispatcher("/Admin.jsp");
		}
		else {
			String operationDone = "Unable to add new customer(Customer id already exists)";
			session.setAttribute("operationDone", operationDone);
			requestDispatcher = request.getRequestDispatcher("/Admin.jsp");
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
