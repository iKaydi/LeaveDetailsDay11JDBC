package com.java.LeaveDetailsJDBC;

import java.sql.SQLException;

public class ShowAllLeaveMain {
	public static void main(String[] args) {
		LeaveHistoryDAO dao = new LeaveHistoryDAO();
		LeaveHistory[] lhList;

			try {
				lhList = dao.showLeaveHistory();
				for (LeaveHistory lh : lhList) {
					System.out.println(lh);
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	
	}
}
