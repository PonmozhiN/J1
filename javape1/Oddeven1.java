package com.stackroute.pe1;
import java.util.Scanner;

public class Oddeven1 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		sc.close();
		

	if(n>20&&n<30) {
		
		if(n%2==0) {
			System.out.println("Jerry");
		}
		else
		{
			System.out.println("Tom");
		}
				
	}
		
	}
	
	
	

}
