package com;

public class Box {
    int l,w,h;
    static int noofobjects=0;
    {                                 //instance block
    	noofobjects+=1;
    }
    
	public int getL() {
		return l;
	}

	public void setL(int l) {
		this.l = l;
	}

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}
	Box()
	{
		l=1;
		w=2;
		h=3;
	}
	Box(int l,int w,int h)
	{
		this.l=l;
		this.w=w;
		this.h=h;
	}
	void volume()
	{
		System.out.println(l*w*h);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b=new Box();
		Box b1=new Box(30,3,4);
		b.volume();
		b1.volume();
		System.out.println(noofobjects);
		noofobjects=3;
		System.out.println(noofobjects);

	}

}
