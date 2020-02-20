package com;

public class ConstruOver {
	int l,w,h;
	ConstruOver()
	{
		System.out.println("ConstruOver()");
	}
	ConstruOver(int l)
	{
		this();
		System.out.println("ConstruOver(l)");
		this.l=l;
	}
	ConstruOver(int l,int w)
	{
		this(l);
		System.out.println("ConstruOver(l,w)");
		this.l=l;
		this.w=w;
		
	}
	ConstruOver(int l,int w,int h)
	{
		this(l,w);
		System.out.println("ConstruOver(l,w,h)");
		this.l=l;
		this.w=w;
		this.h=h;
	}
	void display()
	{
		System.out.println(l+" "+w+" "+h);
//		System.out.println(name+id+course);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstruOver c=new ConstruOver(2,3,4);
		c.display();
	}

}
