package week3.home_assignments;

public class TestData {
	
	public void enterCredentials()
	{
		System.out.println("Super class - Testdata Enter credentials");
	}
	public void navigateToHomePage()
	{
		System.out.println("Super class - Testdata navigate to Home page");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestData td = new TestData();
		td.enterCredentials();
		td.navigateToHomePage();

	}

}
