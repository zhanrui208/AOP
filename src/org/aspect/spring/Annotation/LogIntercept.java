package org.aspect.spring.Annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 当基于XML Sechma实现Advice时，如果Pointcut需要被重用，可以使用<aop:pointcut></aop:pointcut>来声明Pointcut，
 * 然后在需要使用这个Pointcut的地方，用pointcut-ref引用就行了，如：
xml 代码
<aop:config>
<aop:pointcut id="log"
expression="execution(* com.savage.simplespring.bean.MessageSender.*(..))"/>
<aop:aspect id="logging" ref="logBeforeAdvice">
<aop:before pointcut-ref="log" method="before"/>
<aop:after-returning pointcut-ref="log" method="afterReturning"/>
</aop:aspect>
</aop:config>
 */

/**
 * 通过aop拦截后执行具体操作
 */
@Aspect
@Component
public class LogIntercept {
	/**
	 * 1）execution(* *(..))表示匹配所有方法
		2）execution(public * com. savage.service.UserService.*(..))表示匹配com.savage.server.UserService中所有的公有方法
		3）execution(* com.savage.server..*.*(..))表示匹配com.savage.server包及其子包下的所有方法
	 */

  //Pointcut表示式     --切点
    @Pointcut("execution(public * org.aspect.spring..*.*(..))")  
  //Point签名
    private void pointCutMethod() {  
    }  
  
    //声明前置通知  
    @Before("pointCutMethod()")  //可以用后面替代@Before("execution(public * org.aspect.spring..*.*(..))")
    public void doBefore() {  
        System.out.println("前置通知");  
    }  
  
    //声明后置通知  
    @AfterReturning(pointcut = "pointCutMethod()", returning = "result")  
    public void doAfterReturning(String result) {  
        System.out.println("后置通知");  
        System.out.println("---" + result + "---");  
    }  
  
    //声明例外通知  
    @AfterThrowing(pointcut = "pointCutMethod()", throwing = "e")  
    public void doAfterThrowing(Exception e) {  
        System.out.println("例外通知");  
        System.out.println(e.getMessage());  
    }  
  
    //声明最终通知  
    @After("pointCutMethod()")  
    public void doAfter() {  
        System.out.println("最终通知");  
    }  
  
    //声明环绕通知  
    @Around("pointCutMethod()")  
    public Object doAround(ProceedingJoinPoint pjp) throws Throwable {  
        System.out.println("进入方法---环绕通知");  
        Object o = pjp.proceed();  
        System.out.println("退出方法---环绕通知");  
        return o;  
    }  
}
