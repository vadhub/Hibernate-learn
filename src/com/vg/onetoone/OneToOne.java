package com.vg.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.vg.hibernate.entity.Instructor;
import com.vg.hibernate.entity.InstructorDetail;

public class OneToOne {

	public static void main(String[] args) {
	SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class).buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		//create objects
		
		Instructor instructor = new Instructor("Nill", "Ams");
		InstructorDetail inDetail1 = new InstructorDetail("VG", "disignerr");
		
		instructor.setInstructorDetail(inDetail1);
		
		session.beginTransaction();		
		
		System.out.println("Save!");
		session.save(instructor);
		
		System.out.println("Save! WoooHooo!");
		
		session.getTransaction().commit();
		
		factory.close();
		
		System.out.println("Woohoo");
	}

}
