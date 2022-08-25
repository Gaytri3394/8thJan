package launching;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXPath {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
	driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
	driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("welcome")).click();
	Thread.sleep(1000);
	driver.findElement(By.linkText("Logout")).click();
	Thread.sleep(1000);
	driver.quit();
	
	
	}

}
