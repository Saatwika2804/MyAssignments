package week3.home_assignments;

import java.util.Arrays;

public class FindMissingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = {1, 4,3,2,8, 6, 7};
		int ln = num.length;
		Arrays.sort(num);
		System.out.print(Arrays.toString(num));
		for(int i=0;i<ln;i++)
		{
			if(i + 1 != num[i])
			{
				System.out.println("The Missing number is: " + (i + 1)  + "");
				break;
			}
			
		}
		
		}		

	}


