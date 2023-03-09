//driver class
//program to demonstrate one to one unidirectional association
package org.tnsif.unidirectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToOneUnidirectionalDemo {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		
		em.getTransaction().begin();
		
		//one employee
		Employee emp1=new Employee();
		emp1.setEmpname("Rutuja Gite");
		
		//two employee
		Employee emp2=new Employee();
		emp2.setEmpname("Purva Patil");
		
		//first address
		Address a1=new Address();
		a1.setPincode(422605);
		a1.setArea("Golden City");
		a1.setCity("Sangamner");
		a1.setState("Maharashtra");
		
		//Second address
		Address a2=new Address();
		a2.setPincode(422003);
		a2.setArea("Amrutdham");
		a2.setCity("Nashik");
		a2.setState("Maharashtra");
		
		emp2.setAddress(a1);
		emp1.setAddress(a2);
		
		em.persist(emp1);
		em.persist(emp2);
		
		em.getTransaction().commit();

		System.out.println("Data added successfully");
		em.close();

		factory.close();

	}

}
