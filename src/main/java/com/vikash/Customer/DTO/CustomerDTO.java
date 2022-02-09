package com.vikash.Customer.DTO;

import com.vikash.Customer.Entity.Customer;

public class CustomerDTO {
	
	long phoneNo;
	String name;
	int age;
	char gender;
	String password;
	String address;
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public static CustomerDTO valueOf(Customer cust) {
		CustomerDTO custDTO = new CustomerDTO();
		custDTO.setAge(cust.getAge());
		custDTO.setGender(cust.getGender());
		custDTO.setName(cust.getName());
		custDTO.setPhoneNo(cust.getPhoneNo());
		custDTO.setAddress(cust.getAddress());
		//PlanDTO planDTO = PlanDTO.valueOf(cust.getPlan());
		//custDTO.setCurrentPlan(planDTO);
		
		//List<FriendFamily> friends = cust.getFriends();
		//List<Long> friendList = new ArrayList<Long>();
		/*
		 * for (FriendFamily friend : friends) {
		 * friendList.add(friend.getFriendAndFamily()); }
		 */
		//custDTO.setFriendAndFamily(friendList);
		
		return custDTO;
	}
	@Override
	public String toString() {
		return "CustomerDTO [phoneNo=" + phoneNo + ", name=" + name + ", age=" + age + ", gender=" + gender
				+ ", password=" + password + ", address=" + address
				+ ", ]";
	}
	public Customer createEntity() {
		Customer cust = new Customer();
		cust.setAge(this.getAge());
		cust.setGender(this.getGender());
		cust.setName(this.getName());
		cust.setPhoneNo(this.getPhoneNo());
		cust.setAddress(this.getAddress());
		cust.setPassword(this.getPassword());
		
		return cust;
	}

}
