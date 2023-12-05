package CoreAnnotations;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		/*Hp hpObj = new Hp();  //devel
		hpObj.work();
		hpObj.useInternet();
		
		Dell dellObj = new Dell();
		dellObj.work();
		dellObj.useInternet();*/
		
		/*SystemDetails laptop = new Hp();
		laptop.work();
		laptop.useInternet();*/
		
	 ApplicationContext ioc = new ClassPathXmlApplicationContext("Configuration.xml");
		Dell dellFromIOC = (Dell) ioc.getBean("dellObj");  //ct
		Dell dellFromIOC1 = ioc.getBean("dellObj", Dell.class);
		
		SystemDetails refObj =  (SystemDetails) ioc.getBean("hpObj"); //rt --> SystemDetails refObj  = new Dell()/ new hp()
		Hp hpObjFromIOC = (Hp) ioc.getBean("hpObj");
		
		dellFromIOC.work();
		dellFromIOC.useInternet();
		
		hpObjFromIOC.work();
		hpObjFromIOC.useInternet();
	 
	 
		
		
	}
}
