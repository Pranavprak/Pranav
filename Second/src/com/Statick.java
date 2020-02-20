package com;

public class Statick {
	int rollno;
	String name;
	static String college="III";
	Statick(int r,String n) {    //method
		rollno=r;
	    name=n;
	}
	void display()
	{
		System.out.println(rollno+" "+name+" "+college);
	}
	public static void main(String[] args) {
		Statick s=new Statick(132,"d");
		s.display();
		Statick.college="adf";
		s.display();
	}

}
