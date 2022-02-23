package E.E2E;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowsersTest {

	
	
	@Test
	public void ChromeBrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver;
		driver= new ChromeDriver();
		driver.get("http://localhost:5001/");
		Thread.sleep(2000);
		driver.quit();
	}
}
