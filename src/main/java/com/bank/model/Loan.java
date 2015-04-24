package com.bank.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="loan")
public class Loan {

@Column(name="loanId")
public int loanId;
	
@Column(name="custId")
public int custId;

@Column(name="accNum")
public int accNum;

@Column(name="loanType")
public String loanType;

@Column(name="loanDuration")
public int duration;

@Column(name="profession")
public String profession;

@Column(name="income")
public Double income;

@Column(name="reqDate")
public Date reqDate;

@Column(name="status")
public String status;

@Column(name="loanCreatedBy")
public int employeeId;





}
