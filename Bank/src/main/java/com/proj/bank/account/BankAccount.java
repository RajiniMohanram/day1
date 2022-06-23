package com.proj.bank.account;

public class BankAccount {
	private int accountNumber;
	private String accountName;
	private double accountBalance;
	private String ifsc;
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BankAccount(int accountNumber, String accountName, double accountBalance, String ifsc) {
		super();
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.accountBalance = accountBalance;
		this.ifsc = ifsc;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	
}
