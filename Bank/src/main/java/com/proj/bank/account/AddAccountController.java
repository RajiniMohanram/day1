package com.proj.bank.account;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddAccountController
 */
@WebServlet("/add-account.do")
public class AddAccountController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int accountNumber = Integer.parseInt(request.getParameter("accountNumber"));
		String accountName = request.getParameter("accountName");
		double balance = Double.parseDouble(request.getParameter("accountBalance"));
		String ifsc = request.getParameter("ifsc");
		BankAccount account = new BankAccount(accountNumber, accountName, balance, ifsc);
		
		AccountDAO dao = new AccountDAO();
		boolean result = dao.addAccount(account);
		
		if(result) {
			request.setAttribute("msg", "Account added successfully...");
		}else {
			request.setAttribute("err", "Account Not Addedd...");
		}
		RequestDispatcher rd = request.getRequestDispatcher("add-account.jsp");
		rd.forward(request, response);
	}

}
