package launching;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingUpDown {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://s1.demo.opensourcecms.com/wordpress/wp-admin/install.php");
		 driver.manage().window().maximize();
		 
		 WebElement expectedElm = driver.findElement(By.id("pass1"));
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].scrollIntoView()", expectedElm);
		 Thread.sleep(2000); 
		 js.executeScript("arguments[0].click()", expectedElm);	
		 Thread.sleep(2000);
		 driver.quit();
	}

}
