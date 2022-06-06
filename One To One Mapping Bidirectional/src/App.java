import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class App {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Question q1=new Question();
		q1.setQid(10);
		q1.setQuestion("how are you?");
		Answer a1=new Answer();
		a1.setAid(100);
		a1.setAnswer("I am Fine");
		a1.setQuestion(q1);
		q1.setAnswer(a1);
		
		Question q2=new Question();
		q2.setQid(20);
		q2.setQuestion("What si your Name ?");
		Answer a2=new Answer();
		a2.setAid(200);
		a2.setAnswer("My Name is Jagdish");
		a2.setQuestion(q2);
		q2.setAnswer(a2);
		
		session.beginTransaction();
		session.save(q1);
		session.save(q2);
		session.getTransaction().commit();
	}

}
