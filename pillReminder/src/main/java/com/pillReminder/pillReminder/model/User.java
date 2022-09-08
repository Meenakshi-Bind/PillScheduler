package com.pillReminder.pillReminder.model;

import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "user",uniqueConstraints=@UniqueConstraint(columnNames="email"))

public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
	
	@Column(name = "first_name")
	private String firstName;
	
	
	
	@Column(name = "last_name")
	private String lastName;
   private String email;
   private String password;
   
   
   private String Confirm_Password; 
   private String contactNumber;
   private String country;
   private String date_of_birth;
   
   
   
   
   @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
   @JoinTable(
		   name = "user_roles",
		   joinColumns = @JoinColumn(
				   name = "user_id" , referencedColumnName = "id"
				   ),
		   
		   inverseJoinColumns =  @JoinColumn(
				   name = "role_id" , referencedColumnName = "id"
				   )
		   
		   )
   
   private Collection<Role> roles;  
public User(String firstName, String lastName, String email, String password,String Confirm_Password,String contactNumber,String country,String date_of_birth,Collection<Role> roles) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.email = email;
	this.password = password;
	
	this.roles = roles;
	this.Confirm_Password=Confirm_Password;
	this.contactNumber=contactNumber;
	this.country=country;
	this.date_of_birth=date_of_birth;
	
}
//public User(String firstname2, String lastName2, String email2, String confirm_Password2, String contactNumber2,
//		String date_of_birth2, UserRegistrationdto registrationDto, String password2, String country2,
//		List<Role> asList) {
//	// TODO Auto-generated constructor stub
//}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
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
public Collection<Role> getRoles() {
	return roles;
}
public void setRoles(Collection<Role> roles) {
	this.roles = roles;
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
  }
