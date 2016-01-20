package org.aspect.common3;

import org.aspect.common3.Aspect;

public class StudentAspectOne implements Aspect {  
  
    @Override  
    public void doAfter() {  
        System.out.println("do After One");  
          
    }  
  
    @Override  
    public void doBefore() {  
        System.out.println("do Before One");  
          
    }  
  
} 