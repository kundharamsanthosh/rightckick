package com.BaseTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseTest {
	
	public WebDriver driver;
	String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "./driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		Log.info("Chrome Browser Launched Successfully");
		
		driver.get(applicationUrlAddress);
		Log.info("Navigated to OrangeHRM Application Successfully");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
		
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
		Log.info("OrangeHRM Closed Successfully");
	}

}
