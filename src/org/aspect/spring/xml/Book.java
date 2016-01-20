package org.aspect.spring.xml;

public class Book {  
	   private  String  name;  
	   private  String  url;  
	   private   int    pages;  
	     
	    public String getName() {  
	        return name;  
	    }  
	    public void setName(String name) {  
	        this.name = name;  
	    }  
	    public String getUrl() {  
	        return url;  
	    }  
	    public void setUrl(String url) {  
	        this.url = url;  
	    }  
	    public int getPages() {  
	        return pages;  
	    }  
	    public void setPages(int pages) {  
	        this.pages = pages;  
	    }  
	  
	  
	    public  void  printName(){  
	        System.out.println("Book name "+ this.name);  
	    }  
	      
	    public  void  printUrl(){  
	        System.out.println("Book URL "+this.url);  
	    }  
	      
	    public  void  printThrowException(){  
	        throw  new  IllegalArgumentException();  
	    }  
	     
	}  
