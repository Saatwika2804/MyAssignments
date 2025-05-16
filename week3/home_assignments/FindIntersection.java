package week3.home_assignments;

import java.util.Iterator;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mark[] = {3,2,11,4,6,7};
		int ln = mark.length;
		int mark1[] = {1,2,8,4,9,7};
		int ln1 = mark1.length;
		for(int i=0; i<ln; i ++)
		{
			for(int j=0; j<ln1;j++)
				if(mark[i]==mark1[j])
				{
					System.out.println("The commen number present: " + mark[i] + "");
				}
		}
			
		}
		}




