package com.proj.app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class App {

	public static void main(String[] args){
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter Joining Date");
		Date joinDate = null;
		try {
			joinDate = sdf.parse(sc.nextLine());
		} catch (ParseException e) {
			System.out.println("Invalid date");
			joinDate = new Date();
		}
		
		
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(joinDate);
		
		int maxDays = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		int joinDay = cal.get(Calendar.DAY_OF_MONTH);
		int workingDays = maxDays - joinDay;
		double salary = 25000;
		double perDay = salary/maxDays;
		
		System.out.println("No. days in month: "+maxDays);
		System.out.println("No. Working Days: "+workingDays);
		System.out.println("Month Salary: "+salary);
		System.out.println("Salary per Day: "+perDay);
		System.out.println("Your Salary: "+(perDay * workingDays));
	}

}
