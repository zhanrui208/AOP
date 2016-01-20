package org.aspect.spring;

import java.lang.reflect.Method;

import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

import org.springframework.aop.MethodBeforeAdvice;
public class BeforeUserLogin implements MethodBeforeAdvice {

//	@Override
//	public void before(Method arg0, Object[] arg1, Object arg2)
//			throws Throwable {
//		// TODO Auto-generated method stub
//		
//	}
	//前置处理
	public void before(Method method, Object[] objs, Object obj) throws Throwable {
        String userName = (String) objs[0]; // 获取登录名
        System.out.println("用户 " + userName + " 登录前处理");
    }
}
