package com;

public class StaticMethod {
    static int a=22;   //static variable
    int b=8;          //non static and instance variable
      
      
      static void seta()   //no need objects to call this function
      {
    	  int c=0;
    	  c++;
    	  System.out.println(c);
    	  System.out.println(a);
      }
      static
      {
    	  System.out.println(a);
    	  seta();
    	  //static works before main
      }
      public static void main(String[] args) {
    	  StaticMethod k=new StaticMethod();
    	  System.out.println(k.b);
    	  
      }
}
