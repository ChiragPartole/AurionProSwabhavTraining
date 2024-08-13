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

import com.techlabs.entity.Transaction;
import com.techlabs.model.TransactionsDB;


@WebServlet("/PassbookController")
public class PassbookController extends HttpServlet {
	 
   
    public PassbookController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher requestDispatcher = null;	
		
	    HttpSession session = request.getSession(false);
	    TransactionsDB transactionsDb = TransactionsDB.getDbTransactions();
	    transactionsDb.connectToDb();

	    String username = (String) session.getAttribute("username");
	    List<Transaction> passbookList = transactionsDb.viewPassbook(username);

	    request.setAttribute("passbookList", passbookList);
	    requestDispatcher = request.getRequestDispatcher("/Passbook.jsp");
	    requestDispatcher.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
