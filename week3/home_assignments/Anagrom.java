package week3.home_assignments;

import java.util.Arrays;

public class Anagrom {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		String word1 = "stops";
		String word2 = "potss";
		char[] next = word1.toCharArray();
		Arrays.sort(next);
		System.out.println(next);
		char[] next1 = word2.toCharArray();
		Arrays.sort(next1);
		System.out.println(next1);
		if(Arrays.equals(next, next1))
			{
			System.out.println("The is anagrom");
		}
	
	}
	}
		
	
		