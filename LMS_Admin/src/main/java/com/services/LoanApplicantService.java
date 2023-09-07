package com.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.dao.LoanApplicantDao;
import com.model.LoanApplicant;



public class LoanApplicantService {
	
	private LoanApplicantDao lad;
	
	@Autowired
	LoanApplicantService(LoanApplicantDao lad){
		this.lad=lad;
	}

	@Transactional
	public void add(LoanApplicant emp) {
		System.out.println(2);
		lad.persistApplicant(emp);
	
	}

	public ArrayList<LoanApplicant> getAll() {
		// TODO Auto-generated method stub
		return lad.findAll();
		
	}
	public LoanApplicant getApplicant(int id) {
		// TODO Auto-generated method stub
		return lad.getApplicant(id);
	}

	public void editApplicant(LoanApplicant la) {
		// TODO Auto-generated method stub
		lad.editApplicant(la);
	}
}