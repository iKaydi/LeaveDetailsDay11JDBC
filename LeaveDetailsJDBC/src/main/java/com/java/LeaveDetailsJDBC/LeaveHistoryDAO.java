package com.java.LeaveDetailsJDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LeaveHistoryDAO {

	Connection connection;
	PreparedStatement pst;
	
	public String addLeaveHistory(LeaveHistory lh) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "insert into Leave_History  "
				+ " values(?,?,?,?,?,?,?,?,?)";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, lh.getLeave_id());
		pst.setInt(2, lh.getLeave_no_of_days());
		pst.setString(3, lh.getLeave_mngr_comments());
		pst.setInt(4, lh.getEmp_id());
		pst.setString(5, lh.getLeave_start_date().toString());
		pst.setString(6, lh.getLeave_end_date().toString());
		pst.setString(7, lh.getLeave_type().toString());
		pst.setString(8, lh.getLeave_status().toString());
		pst.setString(9, lh.getLeave_reason());
		pst.executeUpdate();
		return "Leave Details Inserted";
	}
	
	public LeaveHistory[] showLeaveHistory() throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from leave_history";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		List<LeaveHistory> lhList = new ArrayList<LeaveHistory>();
		LeaveHistory lh = null;
		while(rs.next()) {
			//lh = new LeaveHistory();
			//lh.setLeave_id(rs.getInt("leave_id"));
			//lh.setLeave_no_of_days(rs.getInt("leave_no_of_days"));
			//lh.setLeave_mngr_comments(rs.getString("leave_mngr_comments"));
			//lh.setEmp_id(rs.getInt("emp_id"));
			//lh.setLeave_start_date(rs.getDate("leave_start_date"));
			//lh.setLeave_end_date(rs.getDate("Leave_end_date"));
			//lh.setLeave_type(LeaveType.valueOf(rs.getString("leave_type")));
			//lh.setLeave_status(LeaveStatus.valueOf(rs.getString("leave_status")));
			//lh.setLeave_reason(rs.getString("leave_reason"));
			System.out.println("Leave ID:"+rs.getInt("leave_id"));
			System.out.println("Number of days:"+rs.getInt("leave_no_of_days"));
			System.out.println("Manger comments :"+rs.getString("leave_mngr_comments"));
			System.out.println("Employee ID:"+rs.getInt("emp_id"));
			System.out.println("Leave Start Date :"+rs.getString("leave_start_date"));
			System.out.println("Leave End Date :"+rs.getString("leave_end_date"));
			System.out.println("Leave type:"+rs.getString("leave_type"));
			System.out.println("Leave Status :"+rs.getString("leave_status"));
			System.out.println("Leave Reason :"+rs.getString("leave_reason"));
			System.out.println("----------------------------------------------");
			
		}
		return lhList.toArray(new LeaveHistory[lhList.size()]);
	}
	
	
	public LeaveHistory searchLeaveHistory(int leave_id) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from leave_history where leave_id=?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, leave_id);
		ResultSet rs = pst.executeQuery();
		LeaveHistory lh = null;
		if (rs.next()) {
			System.out.println("Leave ID:"+rs.getInt("leave_id"));
			System.out.println("Number of days:"+rs.getInt("leave_no_of_days"));
			System.out.println("Manger comments :"+rs.getString("leave_mngr_comments"));
			System.out.println("Employee ID:"+rs.getInt("emp_id"));
			System.out.println("Leave Start Date :"+rs.getString("leave_start_date"));
			System.out.println("Leave End Date :"+rs.getString("leave_end_date"));
			System.out.println("Leave type:"+rs.getString("leave_type"));
			System.out.println("Leave Status :"+rs.getString("leave_status"));
			System.out.println("Leave Reason :"+rs.getString("leave_reason"));
			//lh.setLeave_id(rs.getInt("leave_id"));
			//lh.setLeave_no_of_days(rs.getInt("leave_no_of_days"));
			//lh.setLeave_mngr_comments(rs.getString("leave_mngr_comments"));
			//lh.setEmp_id(rs.getInt("emp_id"));
			//lh.setLeave_start_date(rs.getDate("leave_start_date"));
			//lh.setLeave_end_date(rs.getDate("Leave_end_date"));
			//lh.setLeave_type(LeaveType.valueOf(rs.getString("leave_type")));
			//lh.setLeave_status(LeaveStatus.valueOf(rs.getString("leave_status")));
			//lh.setLeave_reason(rs.getString("leave_reason"));
		} 
		return lh;
	}
	
	public LeaveHistory searchPendingLeaveHistory(int leave_id) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from leave_history where leave_id=? and leave_status = 'PENDING'";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, leave_id);
		ResultSet rs = pst.executeQuery();
		LeaveHistory lh = null;
		if (rs.next()) {
			System.out.println("Leave ID:"+rs.getInt("leave_id"));
			System.out.println("Number of days:"+rs.getInt("leave_no_of_days"));
			System.out.println("Manger comments :"+rs.getString("leave_mngr_comments"));
			System.out.println("Employee ID:"+rs.getInt("emp_id"));
			System.out.println("Leave Start Date :"+rs.getString("leave_start_date"));
			System.out.println("Leave End Date :"+rs.getString("leave_end_date"));
			System.out.println("Leave type:"+rs.getString("leave_type"));
			System.out.println("Leave Status :"+rs.getString("leave_status"));
			System.out.println("Leave Reason :"+rs.getString("leave_reason"));
			
			
			//lh.setLeave_id(rs.getInt("leave_id"));
			//lh.setLeave_no_of_days(rs.getInt("leave_no_of_days"));
			//lh.setLeave_mngr_comments(rs.getString("leave_mngr_comments"));
			//lh.setEmp_id(rs.getInt("emp_id"));
			//lh.setLeave_start_date(rs.getDate("leave_start_date"));
			//lh.setLeave_end_date(rs.getDate("Leave_end_date"));
			//lh.setLeave_type(LeaveType.valueOf(rs.getString("leave_type")));
			//lh.setLeave_status(LeaveStatus.valueOf(rs.getString("leave_status")));
			//lh.setLeave_reason(rs.getString("leave_reason"));
		} 
		return lh;
	}

}
