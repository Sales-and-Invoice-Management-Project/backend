package com.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class UserEntity extends BaseEntity {
	
	@Column(name = "first_name",nullable = false,length = 50)
	private String firstName;
	@Column(name = "last_name",nullable = false,length = 50)
	private String lastName;
	@Column(name = "email",nullable = false,length = 30,unique = true)
	private String emailId;
	@Column(name = "contact_no",nullable = false,unique = true)
	private Long contactNumber;
	@Column(name = "address",nullable = false,length = 255)
	private String address;
	@Column(name = "user_name",nullable = false,length = 55,unique = true)
	private String userName;
	@Column(name = "password",nullable = false,length = 12,unique = true)
	private String password;
	
	
	
	public UserEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserEntity(String firstName, String lastName, String emailId, Long contactNumber, String address,
			String userName, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.contactNumber = contactNumber;
		this.address = address;
		this.userName = userName;
		this.password = password;
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
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public Long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserEntity [firstName=" + firstName + ", lastName=" + lastName + ", emailId=" + emailId
				+ ", contactNumber=" + contactNumber + ", address=" + address + ", userName=" + userName + "]";
	}
		

	
}
