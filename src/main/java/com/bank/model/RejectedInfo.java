package com.bank.model;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="rejected_information")
public class RejectedInfo {
	
@Column(name="custid")
public int custid;

@Column(name="loan_type")
public String loanType;

@Column(name="loan_amount")
public int loanAmt;

@Column(name="duration")
public int duration;

@Column(name="name")
public String name;

@Column(name="address")
public String address;

@Column(name="profession")
public String profession;

@Column(name="income")
public int income;

@Column(name="tele")
public int phone;

@Column(name="email")
public String email;

@Column(name="requestdate")
public Date requestDate;

@Column(name="status")
public String status;



}
