package com.profile.userProfile;

public class user {


	private String user;
	private String gender;
	private int mobileNo;
	private int age;
	private String email;
	private String password;


public user() {
	this.user = "user";
	this.gender = "none";
	this.mobileNo = 0000000000;
	this.age = 18;
	this.email = "example@gmail.com";
	this.password = "Abcd@123";
}

public user(String user, int mobileNo, int age, String email, String password, String gender) {
	this();
	this.user = user;
	this.gender = gender;
	this.mobileNo = mobileNo;
	this.age = age;
	this.email = email;
	this.password = password;
}

public String getUser() {
	return user;
}

public void setUser(String user) {
	this.user = user;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public int getMobileNo() {
	return mobileNo;
}

public void setMobileNo(int mobileNo) {
	this.mobileNo = mobileNo;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

@Override
public String toString() {
	return "user [user=" + user + ", gender=" + gender + ", mobileNo=" + mobileNo + ", age=" + age + ", email=" + email
			+ ", password=" + password + "]";
}
}
