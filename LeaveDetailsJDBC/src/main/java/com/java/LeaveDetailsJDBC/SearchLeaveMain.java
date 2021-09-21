package com.java.LeaveDetailsJDBC;

import java.sql.SQLException;
import java.util.Scanner;

public class SearchLeaveMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int leave_id;
		System.out.println("Enter Leave ID   ");
		leave_id = sc.nextInt();
		LeaveHistoryDAO dao = new LeaveHistoryDAO();
		try {
			LeaveHistory lh = dao.searchLeaveHistory(leave_id);
			if (lh!=null) {
				System.out.println(lh);
			} else {
				System.out.println("Leave Record not found");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}