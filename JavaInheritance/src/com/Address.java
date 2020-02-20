package com;

public class Address {
	String  city;
	@Override
	public String toString() {
		return "Address [city=" + city + ", pincode=" + pincode + ", landmark=" + landmark + ", ph=" + ph + "]";
	}

	int pincode;
	String landmark;
	int ph;
     
	public Address(String city, int pincode, String landmark, int ph) {
		super();
		this.city = city;
		this.pincode = pincode;
		this.landmark = landmark;
		this.ph = ph;
	}

}
