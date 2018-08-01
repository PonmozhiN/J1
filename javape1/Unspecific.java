package com.stackroute.pe1;
import java.util.Scanner;

public class Unspecific {
	public static void main(String args[]) {
		int n,sum=0;
	
		Scanner s=new Scanner(System.in);
System.out.println("enter the limit");
	n=s.nextInt();
	int a[]=new int[n];
	System.out.println("enter the numbers");
	for(int i=0;i<n;i++) {
	a[i]=s.nextInt();
	}
	s.close();
	for( int i=0;i<n;i++)
	{
	sum=sum+a[i];
	}
	System.out.println(sum);

	
}
}

