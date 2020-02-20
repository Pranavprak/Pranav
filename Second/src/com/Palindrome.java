package com;
import java.util.*;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int i,flag=0;
		char arr[]=str.toCharArray();
		int a=arr.length-1;
		for(i=0;i<=arr.length-1;i++)
		{
			if(arr[i]!=arr[a])
			{
				flag=1;
				break;
			}
			a--;
		}
		if(flag==0)
			System.out.println("Palindrome");
		else
			System.out.println("Nope");

	}

}
