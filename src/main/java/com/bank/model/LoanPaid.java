package com.bank.model;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="loan_paid")
public class LoanPaid {

@Column(name="cust_id")
private int cust_id;

@Column(name="loan_id")
private int load_int;

@Column(name="insta_date")
private Date insta_date;

@Column(name="pay_date")
private Date pay_date;

@Column(name="due_amount")
private int dueAmt;

@Column(name="inst_amount")
private int instAmt;

@Column(name="balance")
private int balanace;

@Column(name="status")
private int status;


}
