package com;

public class Second {
	String name;
	int id;
	String course;
	
	Second() {          //default
		this.name="Pranav";
		this.id=132;
		this.course="BE";
	}
	
	Second(String name,int id,String course) {    //paramatrised
		this.name=name;
		this.id=id;
		this.course=course;
	}   
	
	void set(String name,int id,String course) {    //method
		this.name=name;
		this.id=id;
		this.course=course;
	}
	void display()
	{
		System.out.println(name+id+course);
	}
	
	
    public static void main(String[] args) {
    	Second s1=new Second("p",1,"w");
    	Second s2=new Second();
    	s2.display();
    	s2.set("me", 132, "BE");
    	s1.display();
    	s2.display();
    }
}
