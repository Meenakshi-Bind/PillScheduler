package com.pillReminder.pillReminder.web.dto;

public class UserRegistrationdto {

	private String firstname;
	private String lastName;
	private String email;
    private String password;
    
    private String Confirm_Password; 
    private String contactNumber;
    private String country;
    private String date_of_birth;
    
    public UserRegistrationdto() {
    }
    
    public UserRegistrationdto(String firstname, String lastName, String email, String password,String Confirm_Password,String contactNumber,String country,String date_of_birth) {
		super();
		this.firstname = firstname;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	    this.Confirm_Password=Confirm_Password; 
		this.contactNumber=contactNumber;
		this.country=country;
		this.date_of_birth=date_of_birth;
	}
    
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastName() {
		return lastName;
	}
	public String getConfirm_Password() {
		return Confirm_Password;
	}
	public void setConfirm_Password(String confirm_Password) {
		Confirm_Password = confirm_Password;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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
	
}
