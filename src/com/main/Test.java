package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.standAlone.collections.example.Employee;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext cont = new ClassPathXmlApplicationContext("spring.xml");
		
		Employee emp = (Employee) cont.getBean("empObj");
		
		System.out.println(emp);

	}

}
