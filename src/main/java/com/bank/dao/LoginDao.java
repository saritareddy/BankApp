package com.bank.dao;

import com.bank.model.Customer;

public interface LoginDao {

public Customer findCustomer(int accNum);

public int loginCustomer(String userName, String pwd);

public void saveCustomer(Customer cust);

public void updateCustomer(Customer cust);

public void deleteCustomer(String email);

}
