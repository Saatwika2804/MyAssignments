package week3.home_assignments;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ReverseOddWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "I am a software tester";
		String[] text = input.split(" ");
		StringBuilder result = new StringBuilder();
		for (int i =1; i < text.length; i = i+2) {
			result.append(text[i]).append(" ");
			
		}
		System.out.println(result.toString().trim());
		
		}
		
}

