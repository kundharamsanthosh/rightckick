package OHRM_testcases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.OHRM.BaseTest;

public class testcases extends BaseTest{
	
	Logger logg=Logger.getLogger(testcases.class);
	@Test(priority=1)
	public void Login() {
		
		PropertyConfigurator.configure("Log4j.properties");
	WebElement	UserNameE=driver.findElement(By.id("txtUsername"));
	UserNameE.clear();
	UserNameE.sendKeys("s venu");
	logg.info("Entered usename succesfully");
	WebElement passwordE=driver.findElement(By.id("txtPassword"));
		
	passwordE.clear();
	passwordE.sendKeys("Venu@1997");
	logg.info("Entered password succesfully");
	
	WebElement logINButton=driver.findElement(By.id("btnLogin"));
	logINButton.click();
	logg.info("loginButton clicked succesfully");
	
	
	
	
	}

}
