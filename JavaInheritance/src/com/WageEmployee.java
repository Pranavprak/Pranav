package com;

public class WageEmployee extends Employee{
	int hours;
	int rate;

	public WageEmployee(String ename, int eid, int esal, String location,int hours,int rate) {
		super(ename, eid, esal, location);
		// TODO Auto-generated constructor stub
		this.hours=hours;
		this.rate=rate;
	}
    @Override
    int calsal() {
    	// TODO Auto-generated method stub
    	return super.calsal()+(hours*rate);
    }
	@Override
	public String toString() {
		return "WageEmployee [hours=" + hours + ", rate=" + rate + ", ename=" + ename + ", eid=" + eid + ", esal="
				+ esal + ", location=" + location + "]";
	}
}
