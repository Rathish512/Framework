package jenkinsWithMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyTitle {

	@Test
	public void verifyvalidlogin()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\Selenium\\Selenium Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		System.out.println("Facebook launched successfully");
		System.out.println("Title is:"+driver.getTitle());
		driver.close();
	}
}
