package org.aspect.spring.Annotation;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

/**
 * 
 * @author zxf
 * 演示aop测试类
 */
@Controller
public class UserAction {
	 public void queryUsers(){
	        System.out.println("查询所有用户【all users list】");
	    }
}
