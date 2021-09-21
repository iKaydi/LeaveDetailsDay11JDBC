package com.java.LeaveDetailsJDBC;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
		
		
		System.out.println("Enter Leave Start date (dd/MM/yyyy)");
		String lsd = sc.next();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date d1;
		try {
			d1 = sdf.parse(lsd);
			lh.setLeave_start_date(d1);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("Enter Leave End date (dd/MM/yyyy)");
		String led = sc.next();
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
		Date d2;
		try {
			d2 = sdf2.parse(led);
			lh.setLeave_start_date(d2);
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
