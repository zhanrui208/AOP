package org.aspect.spring.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
	public static void main(String[] args) {

		beforeTest();
		afterTest();
		 throwTest();
		 aroundTest();
	}

	private static void beforeTest() {
		ApplicationContext context = new ClassPathXmlApplicationContext("org/aspect/spring/xml/before.xml");

		Book book = (Book) context.getBean("book");

		System.out.println("---------------------");

		book.printName();

		System.out.println("---------------------");

		book.printUrl();

		System.out.println("----------------------");

		try {

			book.printThrowException();

		} catch (Exception e) {
			// e.printStackTrace();
		}
	}
	private static void afterTest() {
		ApplicationContext context = new ClassPathXmlApplicationContext("org/aspect/spring/xml/after.xml");

		Book book = (Book) context.getBean("book");

		System.out.println("---------------------");

		book.printName();

		System.out.println("---------------------");

		book.printUrl();

		System.out.println("----------------------");

		try {

			book.printThrowException();

		} catch (Exception e) {
			// e.printStackTrace();
		}
	}
	private static void throwTest() {
		ApplicationContext context = new ClassPathXmlApplicationContext("org/aspect/spring/xml/throws.xml");

		Book book = (Book) context.getBean("book");

		System.out.println("---------------------");

		book.printName();

		System.out.println("---------------------");

		book.printUrl();

		System.out.println("----------------------");

		try {

			book.printThrowException();

		} catch (Exception e) {
			// e.printStackTrace();
		}
	}
	
	private static void aroundTest() {
		ApplicationContext context = new ClassPathXmlApplicationContext("org/aspect/spring/xml/around.xml");

		Book book = (Book) context.getBean("book");

		System.out.println("---------------------");

		book.printName();

		System.out.println("---------------------");

		book.printUrl();

		System.out.println("----------------------");

		try {

			book.printThrowException();

		} catch (Exception e) {
			// e.printStackTrace();
		}
	}
}
