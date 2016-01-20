package org.aspect.common3;

import org.aspect.common3.Aspect;


public class StudentAspectTwo implements Aspect{  
    @Override  
    public void doAfter() {  
        System.out.println("do After Two");  
          
    }  
  
    @Override  
    public void doBefore() {  
        System.out.println("do Before Two");  
          
    }  
}