package week2.home_assignments;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver");
		WebDriver driver = new FirefoxDriver();
		//EdgeDriver driver = new EdgeDriver();
		//SafariDriver driver = new SafariDriver();
		// load url
		//Use it for supressing any notifacations (Yet to explore)
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--disable notifications");
		//ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		// maximize the window
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		//enter the password
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		//click login
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Create Account")).click();
		
		//Account fields inputs
		driver.findElement(By.id("accountName")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.xpath("//input[@id='numberEmployees']")).sendKeys("50");
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("LeafTaps");
		
		// Creating account
		driver.findElement(By.className("smallSubmit")).click();
		String leadtaptitle = driver.getTitle();
		System.out.println("The title of the current page is: " + leadtaptitle + "");
		driver.quit();
			
	}

}
