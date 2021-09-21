package com.java.LeaveDetailsJDBC;

import java.util.Date;

public class LeaveHistory {

	private int leave_id;
	private int leave_no_of_days;
	private String leave_mngr_comments;
	private int emp_id;
	private Date leave_start_date;
	private Date leave_end_date;
	private LeaveStatus leave_status;
	private LeaveType leave_type;
	private String leave_reason;
	
	public LeaveHistory() {
		
	}

	public LeaveHistory(int leave_id, int leave_no_of_days, String leave_mngr_comments, int emp_id,
			Date leave_start_date, Date leave_end_date, LeaveStatus leave_status, LeaveType leave_type,
			String leave_reason) {

		this.leave_id = leave_id;
		this.leave_no_of_days = leave_no_of_days;
		this.leave_mngr_comments = leave_mngr_comments;
		this.emp_id = emp_id;
		this.leave_start_date = leave_start_date;
		this.leave_end_date = leave_end_date;
		this.leave_status = leave_status;
		this.leave_type = leave_type;
		this.leave_reason = leave_reason;
	}

	@Override
	public String toString() {
		return "LeaveHistory [leave_id=" + leave_id + ", leave_no_of_days=" + leave_no_of_days
				+ ", leave_mngr_comments=" + leave_mngr_comments + ", emp_id=" + emp_id + ", leave_start_date="
				+ leave_start_date + ", leave_end_date=" + leave_end_date + ", leave_status=" + leave_status
				+ ", leave_type=" + leave_type + ", leave_reason=" + leave_reason + "]";
	}

	public int getLeave_id() {
		return leave_id;
	}

	public void setLeave_id(int leave_id) {
		this.leave_id = leave_id;
	}

	public int getLeave_no_of_days() {
		return leave_no_of_days;
	}

	public void setLeave_no_of_days(int leave_no_of_days) {
		this.leave_no_of_days = leave_no_of_days;
	}

	public String getLeave_mngr_comments() {
		return leave_mngr_comments;
	}

	public void setLeave_mngr_comments(String leave_mngr_comments) {
		this.leave_mngr_comments = leave_mngr_comments;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public Date getLeave_start_date() {
		return leave_start_date;
	}

	public void setLeave_start_date(Date leave_start_date) {
		this.leave_start_date = leave_start_date;
	}

	public Date getLeave_end_date() {
		return leave_end_date;
	}

	public void setLeave_end_date(Date leave_end_date) {
		this.leave_end_date = leave_end_date;
	}

	public LeaveStatus getLeave_status() {
		return leave_status;
	}

	public void setLeave_status(LeaveStatus leave_status) {
		this.leave_status = leave_status;
	}

	public LeaveType getLeave_type() {
		return leave_type;
	}

	public void setLeave_type(LeaveType leave_type) {
		this.leave_type = leave_type;
	}

	public String getLeave_reason() {
		return leave_reason;
	}

	public void setLeave_reason(String leave_reason) {
		this.leave_reason = leave_reason;
	}
	
	
	
	
}
