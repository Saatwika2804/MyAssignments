package week1.home_assignments;

public class Fibonacci {
	
	public int fibonocci (int count) {
		int a = 0;
		int b = 1;
		for (int i = 0; i <= count; i++) {
			System.out.println(a);
			int next = a + b;
			a = b;
			b = next;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci fib = new Fibonacci();
		System.out.println("The Above is the result of first series" + fib.fibonocci(7));
		System.out.println("The Above is the result of second series" + fib.fibonocci(10));
	}

}
