package org.tnsif.joinedinheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.tnsif.tableperclass.Employee;
import org.tnsif.tableperclass.Manager;

@SuppressWarnings("unused")
public class JoinedInheritanceDemo {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		
		em.getTransaction().begin();
		
		//first student
		Student s1=new Student();
		s1.setRollno(10);
		s1.setName("Rutuja Gite");
		s1.setPercentage(81);
		em.persist(s1);
		
		//second Student
		Student s2=new Student();
		s2.setRollno(8);
		s2.setName("Shreya Thorat");
		s2.setPercentage(80);
		em.persist(s2);
		
		//first Citizen
		Citizen m1=new Citizen();
		m1.setRollno(12);
		m1.setName("Kiran Kadam");
		m1.setPercentage(90);
		m1.setCitizenType("India");
		m1.setPassportNo(12345678);
		em.persist(m1);
		em.getTransaction().commit();

		System.out.println("Data added successfully");
		em.close();

		factory.close();

	}

}
