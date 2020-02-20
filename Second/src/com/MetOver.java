package com;

public class MetOver {
     //we are achieving compile time polymor
	
	int add(int a,int b)
	{
	return a+b;
	}
	double add(int a,double b)
	{
	return a+b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MetOver m=new MetOver();
        int a=m.add(10, 20);
        double b=m.add(10, 20.0);
        System.out.println(a+" "+b+" ");
        System.out.println(m.add(10, 50.0));        
        
	}

}
