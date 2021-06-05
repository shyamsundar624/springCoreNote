package Constructor.Injection.Dependent.Object;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	
		ApplicationContext context=new ClassPathXmlApplicationContext("Constructor/Injection/Dependent/Object/ApplicationContext.xml");
		
		Employee emp=(Employee) context.getBean("emp");
		emp.show();
		
	}
}
