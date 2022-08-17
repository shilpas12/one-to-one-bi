package com.ty.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.dto.Pan;
import com.ty.dto.Person;

public class TestFetchPan {

	public static void main(String[] args) throws InterruptedException {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();

		Person person=entityManager.find(Person.class, 1);
		System.out.println(person.getName());
//		Pan pan = entityManager.find(Pan.class, 1);
//		System.out.println(pan.getPanNumber());

		System.out.println("--------------------------");
		Thread.sleep(1000);

		Pan pan=person.getPan();
		System.out.println(pan.getPanNumber());
				
//		Person person = pan.getPerson();
//		System.out.println(person.getName());
	}

}
