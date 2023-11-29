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
		Employee emp1 = new Employee(121,"hello", 23,"f","duplicate");  //object , Transient object
		Employee emp2 = new Employee(1,"hello", 23,"f", "dup licate"); 
		//Employee emp3 = new Employee(47,"hello344", 3,"m",4545);
		//Employee emp4 = new Employee(46,"hello344", 21,"m",34545);

		//Configuration config = new Configuration().configure("filename.xml");
		Configuration config = new Configuration().configure().addAnnotatedClass(Employee.class);
		//config --> 
		SessionFactory sessionFact =  config.buildSessionFactory();
		Session session =  sessionFact.openSession();
		session.beginTransaction(); //i am gng to commun with db
		session.persist(emp1);  //persistent stae
		session.persist(emp2);
	int empid = 	(int) session.save(emp1); //return inserted primary key of the record
	System.out.println(empid);
		//session.persist(emp2);
		//session.persist(emp3);
		//session.persist(emp4);
		session.getTransaction().commit();
		session.close();
		
	}
}
