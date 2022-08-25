package launching;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePicker {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://demo.automationtesting.in/Datepicker.html");
		 driver.manage().window().maximize();
		 driver.findElement(By.id("datepicker2")).click();
		 Thread.sleep(1000);
		 // forward not happening 
		 WebElement days = driver.findElement(By.id("day"));
		 WebElement months = driver.findElement(By.id("month"));
		 WebElement years  = driver.findElement(By.id("year"));
		 
		 Select selday = new Select(days);
		 selday.selectByIndex(13);
		 Select selmonth = new Select(months);
		 selmonth.selectByValue("12");
		 Select selyear = new Select(years);
		 selyear.selectByVisibleText("1996");
		 driver.quit();
	}

}
