package OrmProjects.FirstProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
	{
		System.out.println( "Hello World!" );
		Employee emp1 = new Employee(121,"hello", 23,"f");  //object
		Employee emp2 = new Employee(1,"hello", 23,"f"); 
		Employee emp3 = new Employee(47,"hello344", 3,"m");
		Employee emp4 = new Employee(46,"hello344", 21,"m");

		//Configuration config = new Configuration().configure("filename.xml");
		Configuration config = new Configuration().configure().addAnnotatedClass(Employee.class);
		//config --> 
		SessionFactory sessionFact =  config.buildSessionFactory();
		Session session =  sessionFact.openSession();
		session.beginTransaction(); //i am gng to commun with db
		session.persist(emp1);
		//session.persist(emp2);
		//session.persist(emp3);
		//session.persist(emp4);
		session.getTransaction().commit();
		
	}
}
