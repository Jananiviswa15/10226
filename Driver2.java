package CoreAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver2 {
	public static void main(String[] args) {
		
	 ApplicationContext ioc = new ClassPathXmlApplicationContext("Configuration2.xml");
	 Student iocBean = ioc.getBean("stdnt", Student.class);
	 iocBean.display();
	 
	 Student iocBean1 = ioc.getBean("stdnt1", Student.class);
	 iocBean1.display();
}
}
