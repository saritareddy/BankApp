package com.bank.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="loan_type")
public class LoanType {

@Column(name="loan_type")
public String loanType;

@Column(name="duration")
public String duration;

@Column(name="loan_amount")
public String loan_amount;

}
