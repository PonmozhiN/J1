package com.stackroute.pe1;
import java.util.Scanner;

public class Stringint {
	public static void main(String args[]) {
		Scanner sn=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sn.next();
		System.out.println("enter the number");
		int n=sn.nextInt();
		sn.close();
		System.out.print(s);
	
		for(int i=0;i<n;i++)
		{
			for(int j=s.length()-n;j<s.length();j++)
			{
		System.out.print(s.charAt(j));
			}
		}
		
	}

}

