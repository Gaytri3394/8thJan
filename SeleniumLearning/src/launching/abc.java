package launching;

import org.openqa.selenium.chrome.ChromeDriver;

public class abc {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		Thread.sleep(1000);
		driver.close();
		
	}

}
