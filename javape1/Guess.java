package com.stackroute.pe1;
import java.util.Scanner;

public class Guess {
	public static void main(String args[])
	{
		Scanner se=new Scanner(System.in);
		System.out.println("Enter the numbers from 1 to 100..");
		int n=se.nextInt();
		se.close();
		if(n>=1&&n<=100)
		{
			int a=78;
			if(a<n)
			{
				System.out.println("Number  is greater than the original number" );
			}
			if(a>n) {
				System.out.println("number is less than the original number");
				
			}
			if(a==n)
			{
				System.out.println("Number is same as original number");
				
			}}
		
			else
			{
				System.out.println("no number");
			}
		}
		
	}
	
	


