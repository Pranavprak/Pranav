package com;

abstract class Person{          //can use interface also
	  abstract void eat();  
	}  
	class AnonymousC{  
	 public static void main(String args[]){  
	  Person p=new Person(){  
	  void eat(){System.out.println("nice fruits");}  
	  };  
	  p.eat();  
	 }  
	}