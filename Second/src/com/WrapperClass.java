package com;

public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=15;    //primitivr-type
		
		
		Integer i=new Integer(3);
		
		i=a;      //autoboxing
		
		System.out.println(i.byteValue());
         int b;
         b=i;      //unboxing
         System.out.println(b);
         
	}

}
