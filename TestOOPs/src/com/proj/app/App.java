package com.proj.app;

import java.util.Scanner;

import com.proj.bank.Account;
import com.proj.bank.BankService;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of accounts");
		int n = Integer.parseInt(sc.nextLine());
		BankService service = new BankService(n);
		
		do {
			System.out.println("1. Add Account");
			System.out.println("2. Fund Transfer");
			System.out.println("3. View All Accounts");
			System.out.println("4. Exit");
			System.out.println("Enter your option");
			int opt = Integer.parseInt(sc.nextLine());
			if(opt==1) {
				//logic to read account details from user
				// call service addaccount method
			}else if(opt==2) {
				// logic to accept from account number, and to account number
				// call service fund transfer
			}else if(opt==3) {
				// call service displayAllAccount method
			}else {
				break;
			}
		}while(true);
	}

}
