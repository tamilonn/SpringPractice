package com.practice.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorld {
	
	private String name = "";
	

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}



	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	public void print(){
		System.out.println("Hello "+ name);
	}



	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
		
		HelloWorld helloWorld = (HelloWorld) context.getBean(HelloWorld.class);
		helloWorld.print();
		

	}

}
