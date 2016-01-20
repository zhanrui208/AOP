package org.aspect.spring.Annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"org/aspect/spring/Annotation/AOP.xml");

		UserAction userAction = (UserAction) ctx.getBean("userAction");
		userAction.queryUsers();

		ctx.destroy();
	}

}
