package com.tts.personalizedSite.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class Site {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private Long id;
	private String name;
	private String email;
	private String message;
	
	@CreationTimestamp
	@Column
	private Date signupDate;

	public Site() {
	}

	public Site(String name, String email, String message, Date signupDate) {
		this.name = name;
		this.email = email;
		this.message = message;
		this.signupDate = signupDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getSignupDate() {
		return signupDate;
	}

	public void setSignupDate(Date signupDate) {
		this.signupDate = signupDate;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Site [id=" + id + ", name=" + name + ", email=" + email + ", message=" + message + "]";
	}
	
	
	
	
	

}
