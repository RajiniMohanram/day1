package com.proj.empmng;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BankBO {
	public boolean addAccount(Account acc) {
		//apply logic to add account in table
		String sql = "INSERT INTO bank_account VALUES(?,?,?,?)";
		boolean result = false;
		try {
			Connection con = DBUtil.getCon();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, acc.getAccNo());
			ps.setString(2, acc.getName());
			ps.setDouble(3, acc.getBalance());
			ps.setString(4, acc.getIfsc());
			
			int n = ps.executeUpdate();
			result = n>0;
			ps.clearParameters();
			
		}catch(Exception ex) {
			
		}
		return result;
	}
	
	public List<Account> getAllAccounts() {
		List<Account> accList = new ArrayList<>();
		
		//apply logic to select all accounts from database table and fill list
		try {
			Connection con = DBUtil.getCon();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM bank_account");
			while(rs.next()) {
				Account acc = new Account();
				acc.setAccNo(rs.getInt(1));
				acc.setName(rs.getString(2));
				acc.setBalance(rs.getDouble(3));
				acc.setIfsc(rs.getString(4));
				accList.add(acc);
			}
			
		}catch(Exception ex) {
			
		}
		return accList;
	}

	public Account findAccount(int accNo) {
		return null;
	}
	
	public boolean deleteAccount(int accNo) {
		return false;
	}
	
	public boolean updateAccount(Account acc) {
		return false;
	}
}
