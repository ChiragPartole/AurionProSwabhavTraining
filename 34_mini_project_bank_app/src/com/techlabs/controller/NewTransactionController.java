package com.techlabs.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlabs.model.TransactionsDB;

@WebServlet("/NewTransactionController")
public class NewTransactionController extends HttpServlet {
	
    public NewTransactionController() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher requestDispatcher = null;
		HttpSession session = request.getSession(false);
		
		try {
			
		
		TransactionsDB transactionsDb = TransactionsDB.getDbTransactions();
	    transactionsDb.connectToDb();
	    
	    String currentUser = (String) session.getAttribute("username");
	    
		int receiverAccNo =0;
		String transactionType = (String) session.getAttribute("transactionType");
		Double amount = Double.parseDouble(request.getParameter("amount"));
		
		String operationDone= null;
		
		if("transfer".equals(transactionType)) {
			receiverAccNo = Integer.parseInt(request.getParameter("receiveraccountnumber"));
			transactionsDb.newTransactionTransfer(currentUser,amount,receiverAccNo);
			
			operationDone = "transfer successfull, amount: "+amount;
			session.setAttribute("operationDone", operationDone);
			
			
		}else if("credit".equals(transactionType)) {
			transactionsDb.newTransactionCredit(currentUser,amount);
			
			operationDone = "credit successfull, amount: "+amount;
			session.setAttribute("operationDone", operationDone);
			
		}else if("debit".equals(transactionType)) {
			transactionsDb.newTransactionDebit(currentUser,amount);
			
			operationDone = "debit successfull, amount: "+amount;
			session.setAttribute("operationDone", operationDone);
		}
		requestDispatcher = request.getRequestDispatcher("/Customer.jsp");
		
//		System.out.println("user:"+currentUser);
//		System.out.println("amount:"+amount);
//		System.out.println("reaccno:"+receiverAccNo);
//		System.out.println("This is new:"+transactionType);
		
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
