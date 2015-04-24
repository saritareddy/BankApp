package com.bank.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="interest")
public class Interest {

@Column(name="acc_num")
private int accountNum;

@Column(name="dat")
private Date date;

@Column(name="old_bal")
private float oldBal;

@Column(name="interest")
private float interest;

@Column(name="tot_bal")
private float totalBal;

}
