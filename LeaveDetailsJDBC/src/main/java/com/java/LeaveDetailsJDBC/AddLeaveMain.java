package com.java.LeaveDetailsJDBC;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class AddLeaveMain {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LeaveHistory lh = new LeaveHistory();
		
		System.out.println("Enter Leave ID  ");
		lh.setLeave_id(sc.nextInt());
		
		System.out.println("Enter Leave Days  ");
		lh.setLeave_no_of_days(sc.nextInt());
		
		System.out.println("Enter Leave Manager Comments");
		lh.setLeave_mngr_comments(sc.next());
		
		System.out.println("Enter Employee ID");
		lh.setEmp_id(sc.nextInt());
		
		
		System.out.println("Enter Leave Start date (yyyy-MM-dd)");
		String lsd = sc.next();
		Date utilDate;
		try {
			utilDate = new SimpleDateFormat("yyyy-MM-dd").parse(lsd);
			java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime()); 
			lh.setLeave_start_date(sqlDate);
			//System.out.println(sqlDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		
		System.out.println("Enter Leave End date (yyyy-MM-dd)");
		String led = sc.next();
		Date utilDate2;
		try {
			utilDate2 = new SimpleDateFormat("yyyy-MM-dd").parse(led);
			java.sql.Date sqlDate = new java.sql.Date(utilDate2.getTime()); 
			//System.out.println(sqlDate);
			lh.setLeave_end_date(sqlDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		lh.setLeave_type(LeaveType.EL);
		
		lh.setLeave_status(LeaveStatus.PENDING);
	
		
		System.out.println("Enter Leave Reason");
		lh.setLeave_reason(sc.next());
		
		LeaveHistoryDAO dao = new LeaveHistoryDAO();
		
			try {
				System.out.println(dao.addLeaveHistory(lh));
			} catch (ClassNotFoundException e) {
		
				e.printStackTrace();
			} catch (SQLException e) {
			
				e.printStackTrace();
			}
		
	}

}
