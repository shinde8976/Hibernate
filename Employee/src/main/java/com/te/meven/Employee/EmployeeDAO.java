package com.te.meven.Employee;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.Criteria;

/**
 * Hello world!
 *
 */
public class EmployeeDAO {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Ajay");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		//For inserting the data
//		et.begin();
//		Employee employee=new Employee();
//		employee.setEmployeeID(1);
//		employee.setEmployeeName("Ajay");;
//		employee.setEmployeeSal(100000);
//		em.persist(employee);
//		et.commit();
//		em.close();
//		emf.close();
		
		//For fetch Data
//		et.begin();
//		Employee employee=em.getReference(Employee.class, 1);
//		System.out.println(employee.getEmployeeID());
//		System.out.println(employee.getEmployeeName());
//		System.out.println(employee.getEmployeeSal());
//		et.commit();
//		em.close();
//		emf.close();
		
		//Update the Data
//		et.begin();
//		Employee employee=em.getReference(Employee.class, 1);
//		employee.setEmployeeName("Rahil");
//		em.merge(employee);
//		et.commit();
//		em.close();
//		emf.close();
		
		//Delete The Data
//		et.begin();
//		Employee employee=em.getReference(Employee.class, 1);
//		em.remove(employee);
//		et.commit();
//		em.close();
//		emf.close();
		
		et.begin();
		Criteria criteria =(Criteria) em.getCriteriaBuilder();
		
	}
}
