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
		char st[]=s.toCharArray();
		for(int i=0;i<n;i++)
		{
			for(int j=n;j<st.length;j++)
			{
				System.out.print(st[j]);
			}
		}
		
	}

}

