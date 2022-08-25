package launching;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogingUsingName {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
		 driver.manage().window().maximize();
		 
		WebElement txtName = driver.findElement(By.name("txtUsername"));
		txtName.sendKeys("Admin");
		
		WebElement textPassWord = driver.findElement(By.name("txtPassword"));
		textPassWord.sendKeys("admin123");
		
		WebElement txtLogin= driver.findElement(By.name("Submit"));
		txtLogin.click();
		
		driver.quit();
		
		
		
	}

}
