package com.tableViewer;

public class TableData {
	private String status;
	public String getStatus() {
		return status;
	}

	private String Monitorname;
	private String Desc;
	private String LastupdateDate;

	public TableData(String status, String monitorname, String desc,
			String lastupdateDate) {
		super();
		this.status = status;
		Monitorname = monitorname;
		Desc = desc;
		LastupdateDate = lastupdateDate;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMonitorname() {
		return Monitorname;
	}

	public void setMonitorname(String monitorname) {
		Monitorname = monitorname;
	}

	public String getDesc() {
		return Desc;
	}

	public void setDesc(String desc) {
		Desc = desc;
	}

	public String getLastupdateDate() {
		return LastupdateDate;
	}

	public void setLastupdateDate(String lastupdateDate) {
		LastupdateDate = lastupdateDate;
	}

}
