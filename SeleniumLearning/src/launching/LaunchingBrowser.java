package launching;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchingBrowser {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.crome.driver", "C:\\chromedriver.exe");
		
		System.setProperty("webdriver.edge.driver","C:\\msedgedriver.exe");
		
		String browserName = "edge";
		if(browserName.equalsIgnoreCase("edge"))
		driver = new ChromeDriver();
		if(browserName.equalsIgnoreCase("Crome"))
		driver = new EdgeDriver();
		
		driver.get("https://www.naukri.com/mnjuser/profile?id=&altresid");
		driver.manage().window().maximize();
		driver.navigate().to("https://www.youtube.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.manage().window().minimize();
		driver.quit();
	}

}
