package launching;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Admin
 *
 */
public class TitekAndURL {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.crome.driver","C:\\chromedriver.exe");
		
	    driver = new ChromeDriver();
		driver.get("https://www.facebook.com/?stype=lo&jlou=AfdsfxTlIGo0WmjH9ZaUdoy-kmYOYKxZ8W1WQvFwvedTy-kgz995coGd7EAFfWiWPWoc8OKCrrL6xjfxh6k3mQbDup8hwD0QBEPjsvD_cZYoEw&smuh=28565&lh=Ac_y9BQuoQDYqrcCuvE");
		Thread.sleep(2000);
		  
		String url = driver.getCurrentUrl();
		if(url.equalsIgnoreCase("https://www.facebook.com/?stype=lo&jlou=AfdsfxTlIGo0WmjH9ZaUdoy-kmYOYKxZ8W1WQvFwvedTy-kgz995coGd7EAFfWiWPWoc8OKCrrL6xjfxh6k3mQbDup8hwD0QBEPjsvD_cZYoEw&smuh=28565&lh=Ac_y9BQuoQDYqrcCuvE"));
		System.out.println("Test Case Pass");
		System.out.println(url);
		
		String titel = driver.getTitle();
		if(titel.equalsIgnoreCase("Facebook – log in or sign up"));
		System.out.println("Test Case Pass");
		System.out.println(titel);
		driver.quit();
	}

}
