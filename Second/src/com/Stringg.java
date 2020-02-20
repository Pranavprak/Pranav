package com;

public class Stringg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hiiii";
		String s="HiiiiPranav";
		System.out.println(str.concat("Heellllo"));
		System.out.println(str.compareTo(str));
		str=str.concat("Pranav");
		System.out.println(str);
		System.out.println(str.substring(5));
		System.out.println(str.substring(5, 11));
		System.out.println(str.equals(s));
		System.out.println(str==s);   //compares the references

	}

}
