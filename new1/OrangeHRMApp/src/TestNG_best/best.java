package TestNG_best;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class best {
	WebDriver driver;
	String applicationUrlAddress="https://echoecho.com/htmlforms10.htm";
	
	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dharmaraju\\eclipse-workspace\\srinivas_toutrial\\new_chrome_driverfile\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		
		
		driver.get(applicationUrlAddress);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}

	
	
}

