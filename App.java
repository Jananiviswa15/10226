package com.example.hibernate.programs.hibernate_programs;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Session session = createConnection();
    	Employee catchEmpObj = createEmployeeObjects();
    	saveEmployeeDetails(session, catchEmpObj);
    	
    }
    private static void saveEmployeeDetails(Session session, Employee catchEmpObj) {
		session.beginTransaction();
		//Integer insertedKey = (Integer) session.save(catchEmpObj);
	/*	session.save(catchEmpObj);  //saving emp
		session.save(catchEmpObj.getPermantAdrs()); //save adrs*/
		
		//cascade type 
		session.persist(catchEmpObj);
		session.getTransaction().commit();
		
	}
	private static Employee createEmployeeObjects() {
		
		//scanner class
    	Employee empObj = new Employee();
    	empObj.setEmail("janani@gmail.com");
    	empObj.setName("janani");
    	
    	Address adrs = new Address();
    	adrs.setCity("blre");
    	adrs.setStreetname("dkljfkdf");
    	empObj.setPermantAdrs(adrs);  //employee + adrs details
    	return empObj;
	}
	private static Session createConnection() {
		Configuration config = new Configuration().configure().addAnnotatedClass(Employee.class).addAnnotatedClass(Address.class);;
		SessionFactory sessionFact =  config.buildSessionFactory();
		Session session =  sessionFact.openSession();
		return session;
	}
}

