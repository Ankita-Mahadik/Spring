package com.customerJavaBased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestConfig {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(CustomerConfig.class);
		
		Customer customer =(Customer)context.getBean("customer1");
		customer.setCustomerId(101);
		customer.setCustomerName("Sakshi");
		customer.setCustomerAddress("Mumbai");
		
		System.out.println(customer.toString());
		
		
	}

}
