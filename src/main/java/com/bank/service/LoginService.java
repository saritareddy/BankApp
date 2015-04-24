package com.bank.service;

import com.bank.model.Customer;

public interface LoginService {

public void saveCustomer(Customer cust);

public void updateCustomer(Customer cust);

public Customer findCustomer(int accNum);

public void deleteCustomer(String email);

public int loginCustomer(String userName, String pwd);
}
