package com.proj.bank.util;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DataSourceUtil {
	public static DataSource getDataSource() {
		try {
			Context ctx = (Context) new InitialContext().lookup("java:/comp/env");
			DataSource ds = (DataSource)ctx.lookup("bankDB");
			return ds;
		}catch(Exception ex) {
			System.out.println(ex);
			return null;
		}
	}
}
