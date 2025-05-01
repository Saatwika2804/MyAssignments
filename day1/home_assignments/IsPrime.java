package week1.home_assignments;

import java.util.Iterator;

public class IsPrime {
	
	public void IsPrimeNumber(int a)
	{
		if (a==2)
		{
			System.out.println("The Given number: " + a + " is a prime number");
			return;
		}
		else if (a<=0) {
			System.out.println("The Given number: " + a + " is a prime number");
			return;	
	}
		boolean isPrime = true;
		for (int i=2; i<=(int) Math.sqrt(a); i++) 
		{
			if(a%i == 0)
			{
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
            System.out.println("The Given number: " + a + " is a prime number");
        } else {
            System.out.println("The Given number: " + a + " is not a prime number");
        }
    }
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IsPrime prime = new IsPrime();
		prime.IsPrimeNumber(2);
		prime.IsPrimeNumber(45);
		prime.IsPrimeNumber(3);
		prime.IsPrimeNumber(9);
		prime.IsPrimeNumber(10);

	}

}
