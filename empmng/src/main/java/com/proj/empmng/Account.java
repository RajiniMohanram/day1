package com.proj.empmng;

public class Account {
	private int accNo;
	private String name;
	private double balance;
	private String ifsc;
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(int accNo, String name, double balance, String ifsc) {
		super();
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
		this.ifsc = ifsc;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	
	public String toString() {
		return String.format("%-5d %-10s %10.2f %s", accNo, name, balance, ifsc);
	}
}
