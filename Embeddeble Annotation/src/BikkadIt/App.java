package BikkadIt;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
public class App {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Student s=new Student();
		s.setName("Jagdish");
		s.setEmail("bornarejagdish8@gmail.com");
		Address a=new Address();
		a.setArea("ramnagar");
		a.setCity("pune");
		a.setState("Maharashtra");
		a.setCountry("India");
		s.setAddress(a);
		session.beginTransaction();
		session.save(s);
		session.getTransaction().commit();

	}

}