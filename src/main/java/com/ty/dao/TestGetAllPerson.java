package com.ty.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.dto.Pan;
import com.ty.dto.Person;

public class TestGetAllPerson {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();

		Person person = entityManager.find(Person.class, 1);
		System.out.println("Person id : " + person.getId());
		System.out.println("Person name: " + person.getName());
		System.out.println("Person Age: " + person.getAge());

		Pan pan = person.getPan();

		if (pan != null) {
			System.out.println("-------------------------");
			System.out.println("Pan id: " + pan.getId());
			System.out.println("FatherName :" + pan.getFatherName());
			System.out.println("Pan number:" + pan.getPanNumber());
			System.out.println("--------------------------");

		}
	}

}
