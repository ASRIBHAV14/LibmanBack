package com.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;





@Entity
@Table(name = "publishers")
public class Publishers {
	@Id
	@GeneratedValue
	@Column(name = "publisherid")
	private int publisherId;
	@Column(name = "publishername", nullable = false)
	@NotNull(message = "Name must contain alphabets and  may contain (./-/_)  and length from 1 to 20 characters")
	private String publisherName;
	@Column(name = "contactno", unique = true, nullable = false, length = 10)
	@Pattern(regexp = "^[6|7|8|9]{1}[0-9]{9}$")
	@Size(max = 10, message = "Contact number must be 10 numbers")
	private String contactno;
	@Column(name = "email", unique = true, nullable = false, length = 25)
	@Pattern(regexp = "^[a-z0-9+_.-]+@[a-z0-9.-]+$")
	@Size(max = 25, message = "Email should have be valid")
	private String email;
	@Column(name = "address", length = 20, nullable = false)
	@Size(max = 20, message = "address name should be less than 20 characters")
	private String address;
	@Column(name = "city", length = 20, nullable = false)
	@Pattern(regexp = "^[A-Za-z ]{1,20}$")
	@Size(max = 20, message = "City name should be less than 20 characters")
	private String city;
	@Column(name = "state", length = 20, nullable = false)
	@Pattern(regexp = "^[A-Za-z ]{1,20}$")
	@Size(max = 20, message = "State name should be less than 20 characters")
	private String state;
	@Column(name = "pincode", length = 6, nullable = false)
	private int pincode;
	/*
	 * @Pattern(regexp = "^[0-9]{1,6}$")
	 * 
	 * @Size(max = 6, message = "Pincode should be less than 6 characters")
	 * 
	 * @NotNull
	 */

	@OneToMany(cascade = CascadeType.ALL)
	private List<Books> books;

	public int getPublisherId() {
		return publisherId;
	}

	public void setPublisherId(int publisherId) {
		this.publisherId = publisherId;
	}

	public String getPublisherName() {
		return publisherName;
	}

	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}

	public String getContactno() {
		return contactno;
	}

	public void setContactno(String contactno) {
		this.contactno = contactno;
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

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Publishers [publisherId=" + publisherId + ", publisherName=" + publisherName + ", contactno="
				+ contactno + ", email=" + email + ", address=" + address + ", city=" + city + ", state=" + state + "]";
	}

}