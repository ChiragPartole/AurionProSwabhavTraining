package com.techlabs.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.entity.Customer;
import com.techlabs.model.CustomersDB;

@WebServlet("/ViewCustomerController")
public class ViewCustomerController extends HttpServlet {
	
   
    public ViewCustomerController() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher requestDispatcher = null;
		CustomersDB customersDb = CustomersDB.getDbCustomers();
		customersDb.connectToDb();
		
		List<Customer> customers = customersDb.getAllCustomers();
		request.setAttribute("customers", customers);
		
		requestDispatcher = request.getRequestDispatcher("/ViewCustomers.jsp");
		requestDispatcher.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
