package com.bikkadit;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class App {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Question q=new Question();
		q.setQid(1);
		q.setQuestion("what is java?");
		
		Answer a=new Answer();
		a.setAid(10);
		a.setAnswer("java is famous programming language.");
		
		
		
		
	}

}
