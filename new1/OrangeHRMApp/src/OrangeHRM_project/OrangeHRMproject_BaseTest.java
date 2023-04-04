package OrangeHRM_project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
public class OrangeHRMproject_BaseTest {
	
	WebDriver driver;
	String OrangeHRMApplicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	
	@BeforeTest
	public void SetUp() {
	System.setProperty("webdriver.chrome.driver",".//new_chrome_driverfile/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get(OrangeHRMApplicationUrlAddress);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	
	@AfterTest
	public void teardown() {
	driver.close();	
	}

}
