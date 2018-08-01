package com.stackroute.pe1;
import java.util.Scanner;

public class Sort {
	public static void main(String args[])
	{
		int sum=0;
		Scanner sw=new Scanner(System.in);
		System.out.println("enter the order of numbers");
		int n=sw.nextInt();
		int rem[]=new int[10];
		sw.close();
		int i=0;
		while(n>0){
			 
			rem[i]=n%10;
			n=n/10;
			i++;
			
		}
		for(int j=0;j<i;j++)
		{
			for(int k=j+1;k<i;k++) 
			{
				
				if(rem[j]<rem[k])
				{
					int temp;
					temp=rem[j];
					rem[j]=rem[k];
					rem[k]=temp;
				}
			}
		}
		for(int j=0;j<i;j++)
			
		{
			System.out.println(rem[j]);
	
		
		if(rem[j]%2==0)
		{
			sum=sum+rem[j];

		}
		}
		if(sum>15)
		
		{
			System.out.println("True");
		}
		else {
			
		System.out.println("False");
		
		}
			
			
		}
				
					}
	

	
	

