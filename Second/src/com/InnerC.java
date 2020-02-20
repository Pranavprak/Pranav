package com;

class InnerC{  
	 private int data=30;  
	 class Inner{  
	  void msg(){System.out.println("data is "+data);}  
	 }  
	 public static void main(String args[]){  
	  InnerC obj=new InnerC();  
	   InnerC.Inner in=obj.new Inner();  
	  in.msg();  
	 }  
	}  