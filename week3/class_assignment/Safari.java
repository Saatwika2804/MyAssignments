package week3.class_assignment;

public class Safari extends Browser {
	
	public void readerMode()
	{
	System.out.println("Open incongnito:---->Safari Sub class ");
	}
	
	public void fullScreenMode()
	{
		System.out.println("Clear cacheo:------->Safari Sub class ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Safari d = new Safari();
		d.navigateback();
		d.closebrowser();
		d.browserName(4, "Safari");

	}

}
