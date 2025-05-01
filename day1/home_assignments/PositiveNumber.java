package week1.home_assignments;

public class PositiveNumber {
	
	public int Ispostive (int a)
	{
		if (a>=0) {
			System.out.println(a + " is Positive number");
		}
		else {
			System.out.println(a + " is Negative number");
		}
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PositiveNumber mt = new PositiveNumber();
		mt.Ispostive(-5);
		mt.Ispostive(5);

	}

}
