package week3.home_assignments;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class OddIndexStringChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "changeme";
		char[] array = input.toCharArray();
		int lengh=array.length;
		for (int i=1; i < lengh; i = i+ 2 )
		
		{
			System.out.println(array[i]);
			array[i] = Character.toUpperCase(array[i]);
		}
		System.out.println(array);

	}
}
