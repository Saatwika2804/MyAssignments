package week2.home_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountsContainsDropdownElements {

	public static void main(String[] args) {
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
		driver.findElement(By.linkText("Create Account")).click();
		
		//Account fields inputs
		driver.findElement(By.id("accountName")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");
		// Computer industry
		WebElement ind = driver.findElement(By.xpath("//select[contains(@name, 'industryEnumId')]"));
		Select option_ind = new Select(ind);
		option_ind.selectByIndex(3);
		//S corporation in ownership 
		WebElement own = driver.findElement(By.xpath("//select[contains(@name, 'ownershipEnumId')]"));
		Select option_own = new Select(own);
		option_own.selectByVisibleText("S-Corporation");
		// source as employee
		WebElement source = driver.findElement(By.id("dataSourceId"));
		Select option_source = new Select(source);
		option_source.selectByValue("LEAD_EMPLOYEE");
		//"eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex
		WebElement market = driver.findElement(By.id("marketingCampaignId"));
		Select option_market = new Select(market);
		option_market.selectByIndex(6);
		//Select "Texas" as the state/province using SelectByValue
		WebElement city = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select option_city = new Select(city);
		option_city.selectByValue("TX");
		driver.findElement(By.className("smallSubmit")).click();
		String page_title = driver.getTitle();
		System.out.println(page_title);
		driver.quit();
	}

}
