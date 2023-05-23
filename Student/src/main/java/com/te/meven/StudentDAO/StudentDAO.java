package com.te.meven.StudentDAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.maven.studentDTO.Student;

/**
 * Hello world!
 *
 */
public class StudentDAO {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Ajay1");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		//Inserting into DataBase
//		et.begin();
//		Student student=new Student();
//		student.setStudentMarks(100);
//		student.setStudentName("Ajay");
//		student.setStudentRollNo(10);
//		em.persist(student);
//		et.commit();
//		em.close();
//		emf.close();
		
		//Fetching the data
		//et.begin();
//		Student student=em.getReference(Student.class, 10);
//		System.out.println(student.getStudentMarks());
//		System.out.println(student.getStudentName());
//		System.out.println(student.getStudentRollNo());
		//et.commit();
//		em.close();
//		emf.close();
		
		// Update the Data
//		et.begin();
//		Student student=em.getReference(Student.class, 10);
//		student.setStudentMarks(200);
//		et.commit();
//		em.close();
//		emf.close();
		
		//Remove the Record
//		et.begin();
//		Student student=em.getReference(Student.class, 10);
//		em.remove(student);
//		et.commit();
//		em.close();
//		emf.close();
		
		
		
		
	}
}
