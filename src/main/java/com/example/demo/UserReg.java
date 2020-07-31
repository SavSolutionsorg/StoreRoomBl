package com.example.demo;


public class UserReg {
	
	private String userName;
	private String userPhone;
	private String userEmail;
	private String userPassword;
	private String pinCode;
	private String houseNo;
	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public UserReg() {
		
	}
	
	public UserReg(String name, String phone, String email, String password, String pinCode, String houseNo) {
	super();
	this.userName = name;
	this.userPhone = phone;
	this.userEmail = email;
	this.userPassword = password;
	this.pinCode = pinCode;
	this.houseNo = houseNo;
	
}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	
	public String toString() {
		return "[ " + id + userEmail + " : " + userName + " : " +userPhone + " : " +userPassword + " : " + houseNo  + " : " + houseNo + "]";
	}

	public void setId(Integer id2) {
		this.id = id2;
		
	}
}
