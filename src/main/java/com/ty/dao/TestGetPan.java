package com.ty.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.dto.Pan;
import com.ty.dto.Person;

public class TestGetPan {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();

		Pan pan = entityManager.find(Pan.class, 1);
		System.out.println(pan.getId());
		System.out.println(pan.getFatherName());
		System.out.println(pan.getPanNumber());

		Person person = pan.getPerson();
		if (person != null) {
			System.out.println("-----------------------------");
			System.out.println(person.getId());
			System.out.println(person.getName());
			System.out.println(person.getAge());
			System.out.println("------------------------------");
		}
	}

}
