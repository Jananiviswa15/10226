package Day2;

import javax.net.ssl.HostnameVerifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
	/*	HouseAddress houseAdrs = new HouseAddress();
		houseAdrs.setDoorNum(13);
		houseAdrs.setStreet("jdfjd");

		Person person = new Person();
		person.setName("name");
		person.setAdrs(houseAdrs);

		person.display();*/
		
		ApplicationContext ioc = new ClassPathXmlApplicationContext("Runtime.xml");
		PersonRunTime personObj = ioc.getBean("personObj", PersonRunTime.class);
		personObj.display();

	}

}
