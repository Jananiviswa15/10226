package OrmProjects.FirstProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class BasicOperationInHibernate {


	public static void main(String args[]) {
		Session session = createConnection();
		//savePerson(createPerson(),session); 
		//fetchPersonById(session);
		//updatePersonById(session);
		deltePerson(session);
	}

	private static void deltePerson(Session session) {
		Person personObj = session.get(Person.class, 100);
		if(personObj != null) {
			session.beginTransaction();

			session.delete(personObj);
			session.getTransaction().commit();
		}
		else System.out.println("record with the specified key is not present");
	}

	private static void updatePersonById(Session session) {
		Person personObj = session.get(Person.class, 100);
		if(personObj != null) {
			//in session if u do any changes it ll be visible in db even if u dont tell save or persist
			session.beginTransaction();
			personObj.setName("newjjgjgjjjjhjhjhhjdslk");
			// Person person2 = createPerson();
			session.saveOrUpdate(personObj);
			// session.save(personObj);
			session.getTransaction().commit();
		}
		else System.out.println("record with the specified key is not present");
	}

	private static void fetchPersonById(Session session) {
		Person personObj = session.get(Person.class, 90);
		if(personObj != null)
			System.out.println(personObj);
		else System.out.println("record with the specified key is not present");
	}

	private static void savePerson(Person personObj, Session session) {
		session.beginTransaction();
		int insertedKey = (int) session.save(personObj);
		System.out.println("one person object is inserted with key "+ insertedKey);
		session.getTransaction().commit();

	}

	private static Person createPerson() {
		Person person = new Person();
		//read values 
		person.setLocation("chn");
		person.setName("person2");
		person.setPersonId(100);
		return person;
	}

	private static Session createConnection() {
		Configuration config = new Configuration().configure().addAnnotatedClass(Person.class);
		SessionFactory sessionFact =  config.buildSessionFactory();
		Session session =  sessionFact.openSession();
		return session;
	}
}
