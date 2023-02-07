package segundo_spring;

import org.sistema.spring.dependencyInjection.models.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	
	private static ApplicationContext context;
	
	
	public static void main(String[] args) {
		 context = new ClassPathXmlApplicationContext("beans.xml");
		 Person person = (Person)context.getBean("person"); 
		 System.out.println(person.getAddress().getStreet());

	}

}
