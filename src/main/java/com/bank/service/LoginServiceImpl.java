package com.bank.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bank.dao.LoginDao;
import com.bank.model.Customer;

@Service("loginService")
@Transactional
public class LoginServiceImpl implements LoginService {

@Autowired
private LoginDao loginDao;
	
public Customer findCustomer(int accNum)
{
	return loginDao.findCustomer(accNum);
}

public void saveCustomer(Customer cust)
{
	loginDao.saveCustomer(cust);
}

public void updateCustomer(Customer cust)
{
	loginDao.updateCustomer(cust);
}

public void deleteCustomer(String email)
{
	loginDao.deleteCustomer(email);
}
	
public int loginCustomer(String userName, String pwd)
{
	return loginDao.loginCustomer(userName,pwd);
}


	
}
