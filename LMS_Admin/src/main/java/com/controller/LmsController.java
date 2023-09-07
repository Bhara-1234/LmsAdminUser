package com.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.LoanApplicant;
import com.services.LoanApplicantService;

@Controller
public class LmsController {

	LoanApplicantService las;

	@Autowired
	public LmsController(LoanApplicantService las) {
		this.las = las;
	}
	
	@RequestMapping(value="/admin",method=RequestMethod.GET)
	public String admin() {
		
		return "admin";
	}
	
	
	@RequestMapping(value="/customerlogin",method=RequestMethod.GET)
	public String customerlogin() {
		
		return "customerlogin";
	}
	
	
	@RequestMapping(value="/about",method=RequestMethod.GET)
	public String about() {
		
		return "about";
	}
	

	@RequestMapping(value = "/start", method = RequestMethod.GET)
	public String start() {
		return "customer";
	}
	@RequestMapping(value = "/listall")
	public String list() {
		return "applicationlist";
	}

	@RequestMapping(value = "/loanapplicant", method = RequestMethod.GET)
	public String Applicant() {
		
		return "adminoptions";
	}
	
	@RequestMapping(value = "/listApplicants", method = RequestMethod.GET)
	public String listApplicants(Model model) {
		ArrayList<LoanApplicant> llist=las.getAll();
		model.addAttribute("llist", llist);
		return "applicationlist";
	}
	@RequestMapping(value = "/view", method = RequestMethod.POST)
	public String View(@RequestParam("id") int id,Model model) {
		System.out.println(id);
		LoanApplicant l=las.getApplicant(id);
		System.out.println(l.getStatus());
		model.addAttribute("applicant",l);
		return "view";
	}

	@RequestMapping(value = "/Editapplicant", method = RequestMethod.POST)
	public String View(LoanApplicant la,Model model) {
		las.editApplicant(la);
		ArrayList<LoanApplicant> llist=las.getAll();
		model.addAttribute("llist", llist);
		return "applicationlist";
	}

}