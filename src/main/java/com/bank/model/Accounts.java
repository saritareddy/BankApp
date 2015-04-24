package com.bank.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="accounts")
public class Accounts {

@Id
@Column(name="acc_type")
private String accountType;

@Column(name="minbalance")
private String minbalance;

public String getAccountType() {
	return accountType;
}

public void setAccountType(String accountType) {
	this.accountType = accountType;
}

public String getMinbalance() {
	return minbalance;
}

public void setMinbalance(String minbalance) {
	this.minbalance = minbalance;
}


}
