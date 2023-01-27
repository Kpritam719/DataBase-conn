package service;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entity.Teacher;

public class Test {
	
	

	public static void main(String[] args) {
		System.out.println("Connecting to database");
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Teacher.class)
				.buildSessionFactory();
		System.out.println("created");
		
	}


}
