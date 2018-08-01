package com.stackroute.pe1;
  public class Palindrome {
	public static void main(String args[]) {
	int temp,n=121,s=0,r;

	temp=n;
	while(n>0) {
		r=n%10;
		s=(s*10)+r;
		n=n/10;
	}
		if(temp==s) {
			int sum=0;
			while(s>0) 
			{
				int x=s%10;
				if(x%2==0)
				{
					sum=sum+x;	
				}
				s=s/10;
			}
			if(sum>25)
			{
				System.out.println("no is palindrome and sum of even is greater than 25");
			
			}
			else 
			{
				System.out.println("no is palindrome and sum of even is  not greater than 25");
				
			}
			
		}
		
			else 
				System.out.println("Is not a palindrome");
	}
  }
	
			
				
				
		

	


