package com.test;

import java.util.Date;

//pojo class User -->canoot be changed and inherited 
//same name as table in DB
//same number of variables as many No of Columns in the DB

public class User {

	private int userId;
	private String userName;
	private String createBy;
	private Date createByDate;
	
	public User() {
		
	}

	public User(int userId, String userName, String createBy, Date createByDate) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.createBy = createBy;
		this.createByDate = createByDate;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Date getCreateByDate() {
		return createByDate;
	}

	public void setCreateByDate(Date createByDate) {
		this.createByDate = createByDate;
	}
	
	
}
