package org.aspect.spring.Anno_XML;
//2. AServiceImpl：目标对象
//使用jdk动态代理  
public class AServiceImpl implements AService {  

 public void barA() {  
     System.out.println("AServiceImpl.barA()");  
 }  

 public void fooA(String msg) {  
     System.out.println("AServiceImpl.fooA(msg:" + msg + ")");  
 }

} 