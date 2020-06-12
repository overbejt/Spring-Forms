package com.josh.first;

import java.sql.Date;

public class User {
	private String name;
	private String email;
	private String password;
	private String gender;
	private String profession;
	
	private boolean married;
	
	private Date birthday;

	public String getName() {
		return name;
	}  // End of the 'getName' method

	public void setName(String name) {
		this.name = name;
	}  // End of the 'setName' method

	public String getEmail() {
		return email;
	}  // End of the 'getEmail' method

	public void setEmail(String email) {
		this.email = email;
	}  // End of the 'setEmail' method

	public String getPassword() {
		return password;
	}  // End of the 'getPassword' method

	public void setPassword(String password) {
		this.password = password;
	}  // End of the 'setPassword' method

	public String getGender() {
		return gender;
	}  // End of the 'getGender' method

	public void setGender(String gender) {
		this.gender = gender;
	}  // End of the 'setGender' method

	public String getProfession() {
		return profession;
	}  // End of the 'getProfession' method

	public void setProfession(String profession) {
		this.profession = profession;
	}  // End of the 'setProfession' method

	public boolean isMarried() {
		return married;
	}  // End of the 'isMarried' method

	public void setMarried(boolean married) {
		this.married = married;
	}  // End of the 'setMarried' method

	public Date getBirthday() {
		return birthday;
	}  // End of the 'getBirthday' method

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}  // End of the 'setBirthday' method
	
	
}  // End of the 'User' class
