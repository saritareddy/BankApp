package com.bank.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bank.model.Customer;
import com.bank.model.Login;
import com.bank.service.LoginService;




@Repository("loginDao")
@Transactional
public class LoginDaoImpl implements LoginDao{

private static final Logger logger = LoggerFactory.getLogger(LoginService.class);

private SessionFactory sessionFactory;

@Autowired
public LoginDaoImpl(SessionFactory sessionFactory) {
    this.sessionFactory = sessionFactory;
}

public Customer findCustomer(int accNum) {

	Session session = sessionFactory.getCurrentSession();
	Customer customer = (Customer)session.get(Customer.class, accNum);
    logger.info("Person loaded successfully, Person details="+customer);
	return customer;
}

public void saveCustomer(Customer cust)
{
	sessionFactory.getCurrentSession().persist(cust);
}

public void updateCustomer(Customer cust)
{
	Session session = sessionFactory.getCurrentSession();
	session.update(cust);
    logger.info("Person updated successfully, Person Details="+cust);
}

public void deleteCustomer(String email)
{
	Session session = sessionFactory.getCurrentSession();
	Customer customer = (Customer)session.load(Customer.class, new String(email));
			 if(null != customer){
		            session.delete(customer);
		        }
		        logger.info("Person deleted successfully, person details="+customer);
		    }
	

public int loginCustomer(String userName, String pwd)
{
	System.out.println("session ="+sessionFactory.getCurrentSession());
	Session session = sessionFactory.getCurrentSession();
	
	String hql = "FROM Login WHERE userName= :user";
	Query query = session.createQuery(hql);
	Login login =null;
	query.setParameter("user",userName);
	 login = (Login) query.uniqueResult();
	System.out.println("username"+login.getUserName() +" password "+ login.getPwd());
	try{
	if(login.getUserName().equals(userName) && login.getPwd().equals(pwd))
	{
		return login.getLoginId();
	}
	return 0;
	}
	catch(Exception ex)
	{
		System.out.println(ex);
		return 0;
	}
}


	
}

