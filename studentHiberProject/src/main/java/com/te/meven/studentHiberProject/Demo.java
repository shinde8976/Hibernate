package com.te.meven.studentHiberProject;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Demo {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ajay2");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		
		//Inserting the data
//		et.begin();
//		System.out.println("hi");
//		Student student=new Student();
//		student.setId(1);
//		student.setName("Ajay");
//		student.setMarks(100);
//		
//		Address address=new Address();
//		address.setPincode(421635);
//		address.setState("maharashtra");
//		address.setStreet("Ambernath");
//		address.setStudent(student);
//		
//		Address address1=new Address();
//		address1.setPincode(400000);
//		address1.setState("Karnataka");
//		address1.setStreet("Kattrigupe");
//		address1.setStudent(student);
//		
//		List<Address> list =new ArrayList<>();
//		list.add(address1);
//		list.add(address);
//		
//		student.setAddresses(list);
//		em.persist(address1);
//		em.persist(address);
//		em.persist(student);
//		et.commit();
//		System.out.println("bye");
//		em.close();
//		emf.close();
		
		//Delete the record
//		et.begin();
//		Student student=em.find(Student.class,10);
//		em.remove(student);
//		et.commit();
//		emf.close();
//		em.close();
		
//		et.begin();
//		Student student=em.getReference(Student.class, 10);
//		student.setId(1);
//		student.setName("Ajay");
//		student.setMarks(100);
//		em.merge(student);
//		et.commit();
//		em.close();
//		emf.close();
		
		//Fetching the data
//		Student student=em.find(Student.class, 1);
//		System.out.println(student.getId());
//		System.out.println(student.getMarks());
//		System.out.println(student.getName());
//		for (Address a : student.getAddresses()) {
//			System.out.println(a.getPincode());
//			System.out.println(a.getState());
//			System.out.println(a.getStreet());
//			System.out.println();
		
		
		//Deleting the data
//		et.begin();
//		Student student=em.find(Student.class, 1);
//		em.remove(student);
//		et.commit();
//		em.close();
//		emf.close();
		
		//get All data from table
		
		
		
		
	}
}
