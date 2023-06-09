package com;

public class User {
	
      private String firstName;
      
      private String lastName;
      
      private int mobileNumber;
      
      private String gender;
      
      private String email;
      
      private String password;
      
  

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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

	public User(String firstName, String lastName, int mobileNumber, String gender, String email, String password) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
		this.gender = gender;
		this.email = email;
		this.password = password;
		
	}

	 public User() {}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", mobileNumber=" + mobileNumber
				+ ", gender=" + gender + ", email=" + email + ", password=" + password + "]";
	}
	      
      
}
