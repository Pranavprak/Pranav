package com;

public class Employee extends Employer {
    String ename;
    int eid;
    int esal;
    String location;
    public Employee(String ename, int eid, int esal, String location) {
		super();
		this.ename = ename;
		this.eid = eid;
		this.esal = esal;
		this.location = location;
	}
    int calsal()
    {
    	return esal;
    }
    @Override
	public String toString() {
		return "Employee [ename=" + ename + ", eid=" + eid + ", esal=" + esal + ", location=" + location + "]";
	}

}
