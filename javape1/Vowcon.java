package com.stackroute.pe1;
import java.util.Scanner;

public class Vowcon {
	void meth() {
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter the word");
		String s=sn.next();
		sn.close();
		for(int a=0;a<s.length();a++) {
			char d=s.charAt(a);
			
		
		if(d>='a' && d<='z' || d>='A'&& d<='Z')
		{
			if( d=='a' ||d=='e'|| d=='i' ||  d=='o' || d=='u' || d=='A' ||d=='E'|| d=='I' ||  d=='O' || d=='U') 
			{
				System.out.println("IT IS A VOWEL");
			}
			else
			{
				System.out.println("IT IS A CONSONANT");
						
						
			}
		}
		else
		{
			System.out.println("ERROR : IT IS NOT A LETTER");
			
		}
	}
	}
public static void main(String args[])  
{
	Vowcon m=new Vowcon();
	m.meth();
}
	
}
	

	

		
		
	
