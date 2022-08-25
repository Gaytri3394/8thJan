package launching;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginUsingID {
	static WebDriver driver;
 public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	driver.manage().window().maximize();
	
	 WebElement textUserName = driver.findElement(By.id("txtUsername"));
	 textUserName.sendKeys("Admin");
	 
	WebElement textPassword = driver.findElement(By.id("txtPassword"));
	textPassword.sendKeys("admin123");
	
	WebElement loginButton =driver.findElement(By.id("btnLogin"));
	loginButton.click();
	
}
} 
