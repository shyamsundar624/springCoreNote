package com.spring.note;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello Programmmer!" );
ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/note/config.xml");
Student s= context.getBean("stud",Student.class);
System.out.println(s);
    }
}
