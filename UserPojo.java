package com.bank.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserPojo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	Long userId;
	String name;
	String phno;
	String email;
	double balance;
	
	
	
	
	public UserPojo() {
		
		
	}
	
	public UserPojo(String name, String phno, String email, double balance) {
		super();
		this.name = name;
		this.phno = phno;
		this.email = email;
		this.balance = balance;
	}
	
	public long getId() {
		return userId;
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	

}
