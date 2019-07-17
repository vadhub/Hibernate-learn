package com.vg.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.vg.hibernate.entity.Instructor;
import com.vg.hibernate.entity.InstructorDetail;

public class OneToOneDelete {

	public static void main(String[] args) {
	SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class).buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		session.beginTransaction();		
		
		//get instructor by primary key
		Instructor tempInstructor = session.get(Instructor.class, 2);
		
		//delete instructor
		if(tempInstructor != null) {
			session.delete(tempInstructor);
			System.out.println("Delete! WoooHooo!");
		}
		
		session.getTransaction().commit();
		
		factory.close();
		
		System.out.println("Woohoo");
	}

}
