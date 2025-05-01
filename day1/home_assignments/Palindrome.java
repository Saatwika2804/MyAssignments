package week1.home_assignments;

import java.util.Iterator;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 1221;
		int output = 0;
		for (int i=input; i > 0; i = i/10 ) {
			int digit = i % 10 ;
			output = output * 10 + digit;
		}
			System.out.println("Reversed number: " + output);
			if(input==output)
			{
				System.out.println("The given number: "  + input + ": is palindrom");
				
			}
			else {
				System.out.println("The given number: " + input + ": is not palindrom");
			}	
		}
	}