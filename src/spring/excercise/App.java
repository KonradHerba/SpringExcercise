package spring.excercise;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/excercise/beans/beans.xml");
		
		Person person = (Person)context.getBean("person");
		
		System.out.println(person);
		person.speak();
		
		//Address address = (Address)context.getBean("address");
		//System.out.println(address);
		
		((ClassPathXmlApplicationContext)context).close();
		
	}

}
