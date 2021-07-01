package com.cg.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Gaurav
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Start");

		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");

		Employee emp = context.getBean("employee", Employee.class);
		emp.work();
		System.out.println(emp.getEname());

		Employee emp2 = context.getBean("employee2", Employee.class);
		System.out.println(emp2.getEname());

		Employee emp3 = context.getBean("employee3", Employee.class);
		System.out.println(emp3.toString());

		Employee emp4 = context.getBean("employee4", Employee.class);
		System.out.println(emp4.toString());

		Department dept = context.getBean("department1", Department.class);
		System.out.println(dept.toString());

		Employee emp5 = context.getBean("employee5", Employee.class);
		System.out.println(emp5.toString());

		Employee emp6 = context.getBean("employee6", Employee.class);
		System.out.println(emp6.toString());

		
		System.out.println("Autowiring using constructor injection");

		Employee emp9 = context.getBean("employee9", Employee.class);
		System.out.println(emp9.toString());
		
		System.out.println("End");
		((AbstractApplicationContext) context).close();
	}
}