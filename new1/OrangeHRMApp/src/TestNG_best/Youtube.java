package TestNG_best;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Youtube {
	WebDriver driver;
	String ApplicationUrlAddress="https://www.youtube.com/";
	
	
	@BeforeTest
	public void Youtube() {
	System.setProperty("webdriver.chrome.driver", "./new_chrome_driverfile/chromedriver.exe");
	driver=new ChromeDriver();
	
	driver.get(ApplicationUrlAddress);
	driver.manage().window().maximize();
			
	}

	@Test
	public void searchTest() {
		
		driver.get(ApplicationUrlAddress);
		
		
	}
}
