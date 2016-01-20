package org.aspect.spring.Anno_XML;
//3. BServiceImpl：目标对象
//使用cglib  
public class BServiceImpl {  

 public void barB(String _msg, int _type) {  
     System.out.println("BServiceImpl.barB(msg:" + _msg + " type:" + _type + ")");  
     if (_type == 1)  
         throw new IllegalArgumentException("测试异常");  
 }  

 public void fooB() {  
     System.out.println("BServiceImpl.fooB()");  
 }  

}  
