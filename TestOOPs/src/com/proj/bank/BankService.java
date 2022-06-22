package com.proj.bank;

import java.util.ArrayList;
import java.util.List;

public class BankService {
	
	private List<Account> accounts;
	
	public BankService(int size) {
		accounts = new ArrayList<Account>();
	}
	
	public void addAccount(String line) {
		accounts.add(Account.createAccount(line));
	}
	
	public void displayAllAccounts() {
		System.out.println("=== All Account Details ===");
		for(Account acc : accounts) {
			System.out.println(acc);
		}
	}
	
	public Account findAccount(int accNo) {
		for(Account acc:accounts) {
			if(acc.getAccNo() == accNo) {
				return acc;
			}
		}
		return null;
	}
	public boolean transferFund(int fromAccNo, int toAccNo, double amount) {
		Account from = findAccount(fromAccNo);
		boolean result1 = from.withdraw(amount);
		Account to = findAccount(toAccNo);
		boolean result2 = to.deposit(amount);
		
		return result1 && result2;
	}
}
