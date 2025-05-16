package week3.class_assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Browser {
	
	public void browserName(int version, String name){
		System.out.println("This is from super class");
		System.out.println("Browser version: " + version + "");
		System.out.println("Browser name is : " + name + "");
		
	}
	
		public void openURL() {
			System.out.println("This is from super class");
			
		
	}
		public void closebrowser()
		{
			System.out.println("This is from super class");
			
		}
		
		public void navigateback()
		{
			System.out.println("This is from super class");

		}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser a = new Browser();
		a.browserName(12, "google");
		a.openURL();
		a.navigateback();

	}

}
