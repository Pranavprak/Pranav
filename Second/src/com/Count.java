package com;
import java.util.*;

public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int count=0;
		char c=sc.next().charAt(0);
		char arr[]=str.toCharArray();
		for(int i=0;i<=arr.length-1;i++)
		{
			if(c==arr[i])
				count++;
		}
System.out.println(count);
		
	}

}
