package com.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Transactional;
import com.model.LoanApplicant;

public class LoanApplicantDao {
	@PersistenceContext
	private EntityManager em;

	public void persistApplicant(LoanApplicant cus) {
		System.out.println(3);
		em.persist(cus);

	}

	public ArrayList<LoanApplicant> findAll() {
		// TODO Auto-generated method stub
		return (ArrayList<LoanApplicant>) em.createQuery("select l from LoanApplicant l").getResultList();
	}

	public LoanApplicant getApplicant(int id) {
		String jpql = "SELECT e FROM LoanApplicant e WHERE e.id = :paramValue";
		Query query = em.createQuery(jpql);
		query.setParameter("paramValue", id);
		return (LoanApplicant) query.getSingleResult();
	}
	@Transactional
	public void editApplicant(LoanApplicant updatedApplicant) {
	    // Step 1: Load the Entity by ID
	    LoanApplicant existingApplicant = em.find(LoanApplicant.class, updatedApplicant.getId());

	    if (existingApplicant != null) {
	        // Step 2: Modify the Entity
	        existingApplicant.setNoy(updatedApplicant.getNoy());
	        existingApplicant.setStatus(updatedApplicant.getStatus());

	        // The changes will be automatically flushed and updated in the database upon transaction completion.
	    } 
	}

}