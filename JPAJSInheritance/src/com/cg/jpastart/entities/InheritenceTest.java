package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InheritenceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		//Create ONE Employee
		Employee employee = new Employee();
		employee.setName("Gambhir");
		employee.setSalary(7000);
        em.persist(employee);
        
        Manager manager = new Manager();
        manager.setName("Hrithik Roshan");
        manager.setSalary(9000);
        manager.setDepartmentname("Sales");
        em.persist(manager);
        
        em.getTransaction().commit();
        
        em.close();
        factory.close();
        System.out.println("Added one employee and manager to database");
	}

}
