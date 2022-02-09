package com.vikash.Customer.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="customer")
public class Customer {
	
	@Column(nullable=false,length=50)
	String name;
	
	@Column(nullable=false,length=50)
	String address;
	
	@Column(nullable=false)
	int age;
	
	@Column(nullable=false,length=50)
	String password;
	
	@Column(nullable=false,length=1)
	char gender;
	
	@Id
	@Column(name = "phone_no",nullable=false)
	Long phoneNo;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public Long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(Long phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	
}
