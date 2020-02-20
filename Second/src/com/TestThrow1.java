package com;
import java.io.*;
public class TestThrow1{  
	   static void validate(int age)  {  
	     if(age<18)
	     {
	     	 //try
	    	 //{
	      //throw new IOException("not valid");
	    	 //}
	    	 int a=1/0;
	     }
	     
	     else  
	      System.out.println("welcome to vote");  
	   }  
	   public static void main(String args[]){  
		   try {
	      validate(17);
		   }
	      catch(Exception e)
	    	 {
	    		 System.out.println(e.getMessage());
	    	 }
	      System.out.println("rest of the code...");  
	  }  
	}  