package com.bank.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="LOGIN")
public class Login {
/*
public Login(){
	
}

public  Login(String username, String password)
{
	this.userName = username;
	this.pwd = password;
}

public  Login(String username, String pwd, String que,String ans,String user)
{
	this.userName = username;
	this.pwd = pwd;
	this.question = que;
	this.answer = ans;
	this.userType = user;
}
*/
@Id
@Column(name="LOGINID")
@GeneratedValue(strategy=GenerationType.IDENTITY)
public int loginId;

@Column(name="USERNAME")
public String userName;

@Column(name="PASSWORD")
public String pwd;

@Column(name="QUESTION")
public String question;

@Column(name="ANSWER")
public String answer;


@Column(name="USERTYPE")
public String userType;

public int getLoginId() {
	return loginId;
}

public void setLoginId(int loginId) {
	this.loginId = loginId;
}

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public String getPwd() {
	return pwd;
}

public void setPwd(String pwd) {
	this.pwd = pwd;
}

public String getQuestion() {
	return question;
}

public void setQuestion(String question) {
	this.question = question;
}

public String getUserType() {
	return userType;
}

public void setUserType(String userType) {
	this.userType = userType;
}


}
