package week3.home_assignments;

public class Login extends TestData{
	public void enterUsername()
	{
		System.out.println("Enter the username");
	}
	public void enterPassword()
	{
		System.out.println("Enter the password");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Login exe = new Login();
		exe.enterCredentials();
		exe.enterUsername();
		exe.enterPassword();
		exe.navigateToHomePage();	

	}

}
