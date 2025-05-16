package week3.class_assignment;

public class Chrome extends Browser {
	
	public void openIncognito()
	{
	System.out.println("Open incongnito:---->Sub class ");
	}
	
	public void clearCache()
	{
		System.out.println("Clear cacheo:------->Sub class ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chrome b = new Chrome();
		b.clearCache();
		b.browserName(34, "Chrome");
		

	}

}
