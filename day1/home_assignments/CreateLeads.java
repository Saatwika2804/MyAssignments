package week2.home_assignments;

import org.apache.xmlbeans.impl.xpath.XPath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CreateLeads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver");
				WebDriver driver = new FirefoxDriver();
				driver.get("http://leaftaps.com/opentaps/");
				// maximize the window
				driver.manage().window().maximize();
				driver.findElement(By.id("username")).sendKeys("demosalesmanager");
				//enter the password
				driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
				//click login
				driver.findElement(By.className("decorativeSubmit")).click();
				driver.findElement(By.partialLinkText("CRM")).click();
				driver.findElement(By.linkText("Create Lead")).click();
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Saatwika");
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Selvakumar");
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Amazon");
				driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("QAE");
				driver.findElement(By.xpath("//input[contains(@class,'smallSubmit')]")).click();
				String titleofthepage = driver.getTitle();
				System.out.println(titleofthepage);
				driver.quit();

	}

}
