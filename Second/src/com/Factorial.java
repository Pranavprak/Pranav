package com;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int a=1;
		for(int i=1;i<=num;i++)
		{
			a=a*i;
		}
			System.out.println(a);
		
		

	}

}
