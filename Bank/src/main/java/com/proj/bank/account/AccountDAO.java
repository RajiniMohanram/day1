package com.proj.bank.account;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.proj.bank.util.DataSourceUtil;

public class AccountDAO {
	
	public boolean addAccount(BankAccount account) {
		boolean result = false;
		DataSource ds = DataSourceUtil.getDataSource();
		try {
			Connection con = ds.getConnection();
			String sql = "INSERT INTO bank_account VALUES(?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, account.getAccountNumber());
			ps.setString(2, account.getAccountName());
			ps.setDouble(3, account.getAccountBalance());
			ps.setString(4, account.getIfsc());
			
			result = ps.executeUpdate()>0;
			ps.clearParameters();
			
		}catch(Exception ex) {
			System.out.println(ex);
		}
		return result;
	}
	
	public BankAccount findAccount(int accountNumber) {
		BankAccount account = null;
		
		return account;
	}
	
	public boolean deleteAccount(int accountNumber) {
		boolean result = false;
		//logic to delete account
		return result;
	}
	
	public boolean updateAccount(BankAccount account) {
		boolean result = false;
		//logic to update account
		return result;
	}
	
	public List<BankAccount> getAllAccounts(){
		List<BankAccount> accounts = new ArrayList<>();
		//logic to get all accounts
		return accounts;
	}
}
