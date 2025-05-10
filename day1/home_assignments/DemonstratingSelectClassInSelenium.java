package week2.home_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DemonstratingSelectClassInSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				System.setProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver");
				WebDriver driver = new FirefoxDriver();
				driver.get("https://en-gb.facebook.com/");
				// maximize the window
				driver.manage().window().maximize();
				driver.findElement(By.linkText("Create new account")).click();
				driver.findElement(By.xpath("//input[contains(@name,'firstname')]")).sendKeys("Test");
				driver.findElement(By.xpath("//input[contains(@name,'lastname')]")).sendKeys("123");
				// day drop down
				WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
				Select option_day = new Select(day);
				option_day.selectByIndex(5);
				//month drop down
				WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
				Select option_month = new Select(month);
				option_month.selectByIndex(5);
				//year drop down
				WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
				Select option_year = new Select(year);
				option_year.selectByIndex(12);
				String name = driver.getTitle();
				System.out.println("Facebook create page name: "+ name + "");
				driver.quit();
				

	}

}
