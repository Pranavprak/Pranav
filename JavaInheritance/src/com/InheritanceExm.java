package com;
class A{
	int a=2;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	void showClass()
	{
		System.out.println("Class A");
	}
}
class B extends A
{
	int b;
	void showClass()
	{
		super.showClass();
		System.out.println("Class B");
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
}

public class InheritanceExm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        B b=new B();
        System.out.println(b.a);
        b.showClass();
	}

}
