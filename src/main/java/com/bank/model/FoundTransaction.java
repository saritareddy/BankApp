package com.bank.model;

import java.sql.Date;
import javax.persistence.Column;

public class FoundTransaction {

@Column(name="deb_acct_no")
private String debitAccNo;

@Column(name="cre_acct_no")
private int creditAccNo;

@Column(name="date")
private Date date;

@Column(name="balance")
private int balance;

@Column(name="deb_amount")
private int debitAmount;
	
}
