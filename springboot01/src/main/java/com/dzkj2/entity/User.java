package com.dzkj2.entity;

public class User {
	
	private String uname;
	private String upwd;
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	public User(String uname, String upwd) {
		super();
		this.uname = uname;
		this.upwd = upwd;
	}
	public User() {
		super();
	}
	

}
