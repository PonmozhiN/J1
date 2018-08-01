package com.stackroute.pe1;
import java.util.Scanner;

public class Capital {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the letter");
		String st=sc.next();
		sc.close();
		char c=st.charAt(0);
if(c>='A'&&c<='Z')
{
	System.out.println("It is a Capital letter");
		}
else if(c>='a'&&c<='z')
{
	System.out.println("It is a small letter");
	
}
else if(c>='0'&&c<='9')
{
	System.out.println("It is a number");
			
}
else
{
	System.out.println("IT is A SPECIAL CHARACTER");
}

		
	}
	

}
