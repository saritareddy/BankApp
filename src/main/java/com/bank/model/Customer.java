package com.bank.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CUSTOMER")
public class Customer {

	@Id
	@Column(name="CUSTID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int custId;
	
	@Column(name="FIRSTNAME")
	public String firstname;
	
	@Column(name="LASTNAME")
	public String lastname;
	
	@Column(name="AGE")
	public int custAge;
	
	@Column(name="DOB")
	public Date dob;
	
	@Column(name="ADDRESS")
	public String custAddr;
	
	@Column(name="CITY")
	public String city;
	
	@Column(name="STATE")
	public String state;
	
	@Column(name="COUNTRY")
	public String country;
	
	@Column(name="SEX")
	public String sex;
	
	@Column(name="PHONE")
	public String phone;
	
	@Column(name="EMAILID")
	public String email;
	
	@Column(name="CREATEDBY")
	public int empId;

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getCustAge() {
		return custAge;
	}

	public void setCustAge(int custAge) {
		this.custAge = custAge;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getCustAddr() {
		return custAddr;
	}

	public void setCustAddr(String custAddr) {
		this.custAddr = custAddr;
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}	
}