package week1.day2;

public class SwitchStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browser = "Firefox";
		switch (browser) {
		case "Chrome":
			System.out.println("Open Chrome");
			break;
		case "Firefox":
			System.out.println("Open Firefox");
		case "IE":
			System.out.println("Open IE");
			break;

		default:
			System.out.println("Mozilla");
		}

	}

}
