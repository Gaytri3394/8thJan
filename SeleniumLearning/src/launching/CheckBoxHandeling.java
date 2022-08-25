package launching;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxHandeling {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdribver.chrome.driver", "C:\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		 driver.manage().window().maximize();;
		 Thread.sleep(1000);
		 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		 driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		 driver.findElement(By.id("btnLogin")).click();
		 driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		 driver.findElement(By.id("menu_admin_UserManagement")).click();
		 List<WebElement> checkBoxes = driver.findElements(By.xpath("//table//tr//td//input[@type='checkbox']"));
		 for(WebElement checkBox:checkBoxes) {
			 checkBox.click();
 
			 
		 }
				 
				 
	}

}
