package org.aspect.common3;

import java.util.ArrayList;
import java.util.List;

public class Maintest {
	 public static void main(String[] args) {
	        List<Aspect> aspectList = new ArrayList<Aspect>();  
	        
	        aspectList.add(new StudentAspectOne());  
	        aspectList.add(new StudentAspectTwo());  
	        Student s = (Student)DynamicProxyFactory.newInstance(new StudentImpl(), aspectList);  
	        s.sayHello();  
	    } 
}
