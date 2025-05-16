package week3.home_assignments;

import java.util.Iterator;

public class Classpractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Name";
		String b = "Class";
		String save = a.replaceAll("am", "2");
		String join = save.concat(b);
		System.out.println(join);
		
		Boolean bool = a.equals(b);
		//System.out.println(bool);
		String name = new String("name");
		String name2 = new String("class");
		if (name.equals(name2)) {
			System.out.println("Same");
			
		} else {
			System.out.println("Different");

		}
		char charat = a.charAt(2);
		System.out.println(charat);
		
		if (a.contains("am")) {
			System.out.println("Contains am");
			
		}
		char[] arr = name.toCharArray();
		int lgth = name.length();
		System.out.println(lgth);
		for (int i = lgth-1; i>=0; i--) 
		{
			System.out.println(arr[i]);
		}
		String tointstring = "Nameeee";
		String repall = tointstring.replaceAll("e", "2");
		System.out.println(repall);
		
		//String to integer using partseint function
		String st="1234";
		 System.out.println(st+10);
		 int stringtoint = Integer.parseInt(st);
		 System.out.println(stringtoint+10);
		//Integer to String using tostring function 
		int int1 = 123;
		System.out.println(int1+2);
		String intop = Integer.toString(int1);
		System.out.println(intop+10);
		
		String split =  "Welcome to new chapter of the life";
		String[] split1 = split.split(" ");
		System.out.println(split1[2]);
		
		String s = "Aprilmonthoftheyear";
		String s1 = s.substring(2);
		System.out.println(s1);
		String substring2 = s.substring(5, 10);
		System.out.println(substring2);
		
		
		

	}

}
