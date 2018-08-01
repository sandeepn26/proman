package com.proman.server.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user_details")
public class UserDetails implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name = "user_id", nullable = false)
	private User user;
	
	@Column(name = "first_name", unique = true, nullable = false, length = 10)
    private String firstName;
	
	@Column(name = "last_name", unique = true, nullable = false, length = 10)
    private String lastName;
	
	@Column(name = "address", unique = true, nullable = false, length = 10)
    private String address;
	
	@Column(name = "city", unique = true, nullable = false, length = 10)
    private String city;
	
	@Column(name = "state", unique = true, nullable = false, length = 10)
    private String state;
	
	@Column(name = "post_code", unique = true, nullable = false, length = 10)
    private String postCode;
	
	@Column(name = "date_of_birth", unique = true, nullable = false, length = 10)
    private Date dob;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

}
