package com.bank.model;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="loan")
public class LoanAccept {

@Column(name="cust_id")
public int cust_id;

@Column(name="loan_id")
public int loan_id;

@Column(name="type")
public String type;

@Column(name="amount")
public int amount;

@Column(name="duration")
public int duration;

@Column(name="start_date")
public Date start_date;

@Column(name="monthly_inst")
public int monthlyInst;



	
}
