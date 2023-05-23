package com.tyss.Project1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class Demo {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ajay1");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		//Inserting the Data
//		et.begin();
//		Student student=new Student();
//		student.setId(4);
//		student.setMarks(90);
//		student.setName("Rahil");
//		em.merge(student);
//		et.commit();
		
		
		//Fetching The Data
//		Student s=em.find(Student.class,3);  
        
//        System.out.println("Student id = "+s.getId());  
//        System.out.println("Student Name = "+s.getName());  
//        System.out.println("Student Marks = "+s.getMarks());
		
		
		//Updating the Data
//		et.begin();
//		Student student=em.find(Student.class,4);
//		System.out.println(student.getId()); ;
//		System.out.println(student.getMarks());
//		System.out.println(student.getName());
//		student.setMarks(100);
//		System.out.println(student.getId()); ;
//		System.out.println(student.getMarks());
//		System.out.println(student.getName());
//		em.merge(student);
//		et.commit();
		
		//Delete the record
//		et.begin();
//		Student student=em.find(Student.class,4);
//		em.remove(student);
//		et.commit();
//		emf.close();  
//		em.close();  
		
	}
}
