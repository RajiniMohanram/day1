package com.proj.empmng;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		BankBO service = new BankBO();
		do {
			System.out.println("1. Add Account");
			System.out.println("2. List All Accounts");
			System.out.println("3. Exit");
			int opt = Integer.parseInt(sc.nextLine());
			
			if(opt==1) {
				//Prompt user to enter account details, and create account obj
				// call addAccount method of service class
			}else if(opt==2) {
				//call getAllAccounts method and display
			}else {
				System.out.println("Exiting app....");
				break;
			}
		} while (true);
	}
}
