package com.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class MapDemo {
	public static void main(String[] args) {
		SessionFactory sessionFactory = hibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Question q = new Question();
		q.setQid(10);
		q.setQuestion("How are you ? ");

		Answer a = new Answer();
		a.setAid(20);
		a.setAnswer("i am fine");
		a.setQuestion(q);

		q.setAnswer(a);
		session.beginTransaction();
		session.save(q);
		session.save(a);

		session.getTransaction().commit();
		session.close();
	}

}
