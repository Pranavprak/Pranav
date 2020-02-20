package com;

public class Student {
	int id;
	String name;
	String course;
	String branch;
	Address add;
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + ", branch=" + branch + ", add=" + add
				+ "]";
	}





	
	public Student(int id, String name, String course, String branch, Address add) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
		this.branch = branch;
		this.add = add;
	}


	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student(121,"Pranav","BE","ECE",new Address ("Chennai",600061,"usa",1213910));
          System.out.println(s);
	}

}
