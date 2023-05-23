package com.te.meven.VehicleDAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.meven.VehicleDTO.Vehicle;

public class VehicleDAO {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Ajay2");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		//Inserting into DB
//		et.begin();
//		Vehicle vehicle=new Vehicle();
//		vehicle.setVehicleCompany("Maruti");
//		vehicle.setVehicleWheel(4);
//		em.persist(vehicle);
//		et.commit();
//		em.close();
//		emf.close();
		
		//Fetching the Data
//		Vehicle vehicle=em.getReference(Vehicle.class, 1);
//		System.out.println(vehicle.getVehicleId());
//		System.out.println(vehicle.getVehicleCompany());
//		System.out.println(vehicle.getVehicleWheel());
		
		//Updating the data
//		et.begin();
//		Vehicle vehicle=em.getReference(Vehicle.class, 1);
//		vehicle.setVehicleCompany("Mahindra");
//		em.merge(vehicle);
//		et.commit();
		
		//Delete the record
		et.begin();
		Vehicle vehicle=em.getReference(Vehicle.class, 1);
		em.remove(vehicle);
		et.commit();
		em.close();
		emf.close();
		
		
	}
}
