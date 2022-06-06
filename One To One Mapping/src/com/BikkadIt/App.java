package com.BikkadIt;
//one to one mapping and cascading example
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class App {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Question q = new Question();
		q.setQid(10);
		q.setQuestion("where are you from?");
		Answer a = new Answer();
		a.setAid(100);
		a.setAnswer("i am from vaijapur");
		q.setAnswer(a);

		Question q1 = new Question();
		q1.setQid(20);
		q1.setQuestion("how are you?");
		Answer a1 = new Answer();
		a1.setAid(200);
		a1.setAnswer("i am fine");
		q1.setAnswer(a1);

		session.beginTransaction();
		session.save(q);
		session.save(q1);
		// here we are saving values in answer column by using save method it is not
		// recommonded way
		// if i want answer entry should save after saving of question entry only then i
		// want to go for
		// one to one mapping

		// session.save(a);
		// session.save(a1);
		session.getTransaction().commit();

	}

}
