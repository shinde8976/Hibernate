package com.te.meven.EmpProjManyToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ajay4");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		Employee employee=new Employee();
		employee.setEname("Ajay");
		
		Employee employee1=new Employee();
		employee1.setEname("Rahil");
		
		Employee employee2=new Employee();
		employee2.setEname("Rahul");
		
		Projects projects=new Projects();
		Projects projects1=new Projects();
		Projects projects2=new Projects();
		
		projects.setProjectName("Hibernate");
		projects1.setProjectName("SQL");
		projects2.setProjectName("MVC");
		
		List<Employee> list1=new ArrayList();
		List<Projects> list2=new ArrayList();
		
		list1.add(employee);
		list1.add(employee1);
		list1.add(employee2);
		
		list2.add(projects2);
		list2.add(projects1);
		list2.add(projects);
		
		employee.setProjects(list2);
		employee1.setProjects(list2);
		employee2.setProjects(list2);
		
		projects.setEmployees(list1);
		projects1.setEmployees(list1);
		projects2.setEmployees(list1);
		
//		em.merge(employee);
//		em.merge(employee1);
//		em.merge(employee2);
//		em.merge(projects);
//		em.merge(projects1);
//		em.merge(projects2);
		
		em.persist(employee);
		em.persist(employee1);
		em.persist(employee2);
		em.persist(projects);
		em.persist(projects1);
		em.persist(projects2);
	
		
		
		
		et.commit();
		em.close();
		emf.close();
		
		
	}
}
