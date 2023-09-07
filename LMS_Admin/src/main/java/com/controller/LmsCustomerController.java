package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.Customer;
import com.model.LoanDetails;
import com.model.Nominee;
import com.service.CustomerService;
@Controller
public class LmsCustomerController {
	
	CustomerService customerservice;
	@Autowired
	public LmsCustomerController(CustomerService customerservice) {
		this.customerservice=customerservice;
	}
	
	@RequestMapping(value="/start",method=RequestMethod.GET)
	public String customer() {
		System.out.println("hello");
		return "customer";
	}
	
	
	@RequestMapping(value="/details",method=RequestMethod.GET)
	public String loanApplicant(Model model,Customer customer,Nominee nominee,LoanDetails loandetails)
	{
		customerservice.addCustomer(customer);

		customerservice.addNominee(nominee);
		loandetails.setLnap_cust_id(customer.getCust_id());
		loandetails.setLnap_nom_requested(nominee.getNom_id());
		customerservice.addLoan(loandetails,customer);
		System.out.println(loandetails.toString());
		model.addAttribute("customer",customer);
		model.addAttribute("nominee",nominee);
		model.addAttribute("loandetails",loandetails);
		return "preview";
		
	}
	
	@RequestMapping(value="/preview",method=RequestMethod.GET)
	public String preview() {
		
		return "customer";
	}

}
