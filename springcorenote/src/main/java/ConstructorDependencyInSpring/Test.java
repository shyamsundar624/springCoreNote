package ConstructorDependencyInSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		System.out.println("Welcome to programming World!");
		
		ApplicationContext context=new ClassPathXmlApplicationContext("ConstructorDependencyInSpring/ApplicationContext.xml");
		
		Employee emp=(Employee) context.getBean("emp");
		emp.show();
	}

}
