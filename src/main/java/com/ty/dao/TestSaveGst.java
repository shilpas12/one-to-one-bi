package com.ty.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Company;
import com.ty.dto.Gst;

public class TestSaveGst {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Company company = new Company();
		company.setName("TEST YANTRA");
		company.setPhone(970790l);

		Gst gst = new Gst();
		gst.setGstNumber("KJK9987");
		gst.setStatus("active");
		gst.setCompany(company);

		entityTransaction.begin();
		entityManager.persist(company);
		entityManager.persist(gst);
		entityManager.persist(gst);
		entityTransaction.commit();
		
		System.out.println("---------DATA SAVED-------");
	}

}
