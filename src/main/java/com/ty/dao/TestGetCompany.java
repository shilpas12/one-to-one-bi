package com.ty.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.dto.Company;
import com.ty.dto.Gst;

public class TestGetCompany {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();

		Company company = entityManager.find(Company.class, 1);

		System.out.println("Company id: " + company.getId());
		System.out.println("Company name: " + company.getName());
		System.out.println("Company phone: " + company.getPhone());

		Gst gst = company.getGst();

		if (company != null) {
			System.out.println("Gst id: " + gst.getId());
			System.out.println("Gst getNumber: " + gst.getGstNumber());
			System.out.println("Gst status: " + gst.getStatus());
		}
	}

}
