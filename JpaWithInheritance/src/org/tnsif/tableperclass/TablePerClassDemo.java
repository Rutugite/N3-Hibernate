package org.tnsif.tableperclass;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TablePerClassDemo{

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		
		em.getTransaction().begin();
		
		//first emp
		Employee e4=new Employee();
		e4.setId(401);
		e4.setName("Rutuja Gite");
		e4.setSalary(25000.50f);
		em.persist(e4);
		
		//second emp
		Employee e5=new Employee();
		e5.setId(402);
		e5.setName("Shreya Thorat");
		e5.setSalary(52000.50f);
		em.persist(e5);
		
		//first Manager
		Manager m1=new Manager();
		m1.setId(602);
		m1.setName("Kiran Kadam");
		m1.setSalary(52000.45f);
		m1.setDepid(45);
		m1.setDeptname("Finance");
		em.persist(m1);
		em.getTransaction().commit();

		System.out.println("Data added successfully");
		em.close();

		factory.close();

		
	}

}