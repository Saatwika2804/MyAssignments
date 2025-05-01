package week1.day2;

public class Browser {
	
	public String launchBrowser(String browserName) {
        System.out.println("Browser launched successfully");
        return browserName;
    }
    
    public Void loadUrl() {
    	System.out.println("Application url loaded successfully");
    	return null;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
    	Browser mt = new Browser();
    	System.out.println(mt.launchBrowser("Firefox"));
    	mt.loadUrl();
    }
}