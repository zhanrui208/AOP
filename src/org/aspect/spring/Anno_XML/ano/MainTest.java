package org.aspect.spring.Anno_XML.ano;

import org.aspect.spring.Anno_XML.AService;
import org.aspect.spring.Anno_XML.AServiceImpl;
import org.aspect.spring.Anno_XML.BServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"org/aspect/spring/Anno_XML/ano/aopANNO.xml");

		BServiceImpl bServiceImpl = (BServiceImpl) ctx.getBean("bService");
		bServiceImpl.fooB();
		
		AService aService = (AServiceImpl) ctx.getBean("aService");
		aService.barA();
		aService.fooA("1111");
		
		
		

		ctx.destroy();
	}

}
