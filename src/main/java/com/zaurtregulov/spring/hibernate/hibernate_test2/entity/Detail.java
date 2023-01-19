package com.zaurtregulov.spring.hibernate.hibernate_test2.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="details")
public class Detail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="city")
	private String city;
	@Column(name="phone_number")
	private int phoneNumber;
	@Column(name="email")
	private String email;

	public Detail() {
		
	}
	
	public Detail(String city, int phoneNumber, String email) {
		this.city = city;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getphoneNumber() {
		return phoneNumber;
	}

	public void setphoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Detail [id=" + id + ", city=" + city + ", phoneNumber=" + phoneNumber + ", email=" + email
				+ ", empDetail=" + empDetail + "]";
	}
}
