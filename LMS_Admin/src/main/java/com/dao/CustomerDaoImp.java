package com.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

import com.model.Customer;
import com.model.LoanDetails;
import com.model.Nominee;

public class CustomerDaoImp {
	@PersistenceContext
	private EntityManager em;
	
	
	public void addCustomer(Customer customer) {
		em.persist(customer);
		
	}
	public void addNominee(Nominee nom) {
		// TODO Auto-generated method stub
		em.persist(nom);
	}
	
	public void addLoanDetails(LoanDetails ld, Customer cus) {
		// TODO Auto-generated method stub
		ld.setLnap_cust_id(cus.getCust_id());
		System.out.println(ld.toString());
		
		System.out.println(cus.getCust_id());
		em.persist(ld);
		
	}

	
	
}
