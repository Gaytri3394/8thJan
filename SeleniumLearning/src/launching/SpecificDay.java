package launching;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SpecificDay {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chroe.driver","C:\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		 driver.navigate().to("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.xpath("//*[contains(text(),'Create New Account')]")).click();
		 
		WebElement days = driver.findElement(By.id("day"));
		WebElement months = driver.findElement(By.id("month"));
		WebElement years = driver.findElement(By.id("year")); 
		
		Select selday = new Select(days);
		selday.selectByIndex(13);
		
		Select selmonth = new Select(months);
		selmonth.selectByValue("Dec");
		
		Select selyear = new Select(years);
		selyear.selectByVisibleText("1996");
		
		driver.quit();
		 
		
	}

}
