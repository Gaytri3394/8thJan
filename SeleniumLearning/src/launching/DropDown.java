package launching;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		 driver.navigate().to("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.xpath("//*[contains(text(),'Create New Account')]")).click();
		 Thread.sleep(1000);
		
		 List<WebElement> days = driver.findElements(By.id("day"));
		 for(WebElement day:days) {
		 System.out.println(day.getText());
		 }
		 driver.quit();
	}

}
