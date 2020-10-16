package com.Register;

public class Member {
	private int id;
	private String uname, password, email,address,phone;
	
	public Member() {
		super();
	}

	public Member(String uname, String password, String email, String address, String phone) {
		super();
		this.uname = uname;
		this.password = password;
		this.email = email;
		this.address = address;
		this.phone = phone;
	}
	
	public Member(int id, String uname, String password, String email, String address, String phone) {
		super();
		this.id = id;
		this.uname = uname;
		this.password = password;
		this.email = email;
		this.address = address;
		this.phone = phone;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	

}
