package org.aspect.spring;

import org.aopalliance.aop.Advice;
import org.springframework.aop.AfterAdvice;
import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.cglib.proxy.MethodInterceptor;
 
public class MainTest {
    public static void main(String[] args) {
        UserLogin target = new UserLoginImpl(); // 目标对象
        BeforeAdvice advice = new BeforeUserLogin(); // 前置通知
        AfterAdvice advice2 = new AfterUserLogin();//后置通知
        MethodInterceptor advice3 =(MethodInterceptor) new AroundUserLogin();//后置通知
        
        ProxyFactory proxyFactory = new ProxyFactory(); // Spring代理工厂
        proxyFactory.setTarget(target); // 设置代理目标
        proxyFactory.addAdvice(advice); // 为代理目标添加前置通知
        proxyFactory.addAdvice(advice2);//为代理目标添加后置通知
        proxyFactory.
        
        UserLogin proxy = (UserLogin) proxyFactory.getProxy(); // 生成代理实例
        proxy.login("张三"); // 调用登录方法
    }
}