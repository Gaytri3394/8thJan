package launching;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWinID {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		 driver.manage().window().maximize();
		 String WinId1 = driver.getWindowHandle();
		 System.out.println(WinId1);
		 WebElement AnathorWin = driver.findElement(By.xpath("//*[contains(text(),'OrangeHRM, Inc')]"));
		 AnathorWin.click();
		 Set<String> AllWinId = driver.getWindowHandles();
		 System.out.println(AllWinId);
		 driver.quit();
		 
	}

}
