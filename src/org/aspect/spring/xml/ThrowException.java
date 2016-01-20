package org.aspect.spring.xml;

import org.springframework.aop.ThrowsAdvice;

public class ThrowException  implements ThrowsAdvice{  
    
    public  void  afterThrowing(IllegalArgumentException e)  throws  Throwable{  
        System.out.println("after Throwing  Exception");  
    }  
} 
