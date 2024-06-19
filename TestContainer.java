package com.studentXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestContainer {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
		Student student = (Student)context.getBean("employee");
		//Employee employee = new Employee();
		
		System.out.println(student.toString());
		
	}

}
