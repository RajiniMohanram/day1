package com.proj.bank;

public class Account {
	private int accNo;
	private String accName;
	private double balance;
	private static String bankName;

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(int accNo, String accName, double balance) {
		super();
		this.accNo = accNo;
		this.accName = accName;
		this.balance = balance;
	}

	public static String getBankName() {
		return bankName;
	}

	public static void setBankName(String bankName) {
		Account.bankName = bankName;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public boolean deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			return true;
		} else {
			System.err.println("Invalid Amount");
			return false;
		}
	}

	public boolean withdraw(double amount) {
		if (balance - amount > 100) {
			balance -= amount;
			return true;
		} else {
			System.err.println("Insufficient Balance");
			return false;
		}
	}

	public void printPassbook() {
		System.out.println("Account Number: " + accNo);
		System.out.println("Account Holder: " + accName);
		System.out.println("Current Balance: " + balance);
		System.out.println("Bank: " + bankName);
	}

	public static Account createAccount(String line) { // "1001,John Thomas,2300.0"
		String[] v = line.split(","); // "1001" "John Thomas" "2300.0"

		int accNo = Integer.parseInt(v[0]); // "1001"
		String accName = v[1];
		double balance = Double.parseDouble(v[2]); // "2300.0"

		Account acc = new Account(accNo, accName, balance);
		return acc;
	}

	@Override
	public String toString() {
		return String.format("%-5d %-10s %.2f", accNo, accName, balance);
	}

}
