package com;
interface runable{
	 void run();                      //no implement
	 static void fly()              //implement can also use default
	 {
		 System.out.println("parai");
	 }
}
interface Swim 
{
	//by default public static final
	double speed=203.2;             
	//by default all methods abstract
	void swim();
	void pause();
}
class Auto
{
	
}
class Water extends Auto implements Swim,runable
{

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("100km/hr");
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		System.out.println("nillu");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("oduoduodu");
	}
	
}
public class Automobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Water w=new Water();         //upcasting
      w.swim();
      w.pause();
     w.run();
      runable.fly();                   //interface name dot method
      System.out.println(Swim.speed);
	}

}
