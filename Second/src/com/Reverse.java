package com;
import java.util.*;

public class Reverse {

	public static void main(String[] args) {
	  // TODO Auto-generated method stub
		int i;
		char arr[]=new char[50];
		String rev="";
    Scanner sc=new Scanner(System.in);
    String str=sc.next();
    arr=str.toCharArray();
    for(i=str.length()-1;i>=0;i--)
    {
    	System.out.print(arr[i]);
    	rev+=arr[i];
    }
    System.out.println(rev);
	}

}
