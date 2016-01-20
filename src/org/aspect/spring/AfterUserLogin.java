package org.aspect.spring;

import java.lang.reflect.Method;


import org.springframework.aop.AfterReturningAdvice;


public class AfterUserLogin implements AfterReturningAdvice {
	@Override 
	public void afterReturning(Object arg0, Method arg1, Object[] arg2,
			Object arg3) throws Throwable {
		// TODO Auto-generated method stub
        String userName = (String) arg2[0]; // 获取登录名
        System.out.println("用户 " + userName + " 登录后处理");
		
	}
}
