package week3.class_assignment;

public class Edge extends Browser {
	
	public void takeSnap()
	{
	System.out.println("Open incongnito:---->Edge bSub class ");
	}
	
	public void clearCookies()
	{
		System.out.println("Clear cacheo:------->Edge Sub class ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Edge c =  new Edge();
		c.openURL();
		c.navigateback();
		c.browserName(45, "Edge");
	}

}
