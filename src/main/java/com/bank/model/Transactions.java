package com.bank.model;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="transactions")
public class Transactions {

@Column(name="tranid")
private String tranid;

@Column(name="trantype")
private String trantype;

@Column(name="tranmethod")
private String tranmethod;

@Column(name="date")
private Date date;

@Column(name="cheque_num")
private String chequeNo;

@Column(name="acc_num")
private String AccNo;

@Column(name="amount")
private String amount;

@Column(name="current_balance")
private float currentBal;

@Column(name="remarks")
private String remarks;

@Column(name="custid")
private String custid;

}
