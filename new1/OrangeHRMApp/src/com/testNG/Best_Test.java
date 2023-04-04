package com.testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Best_Test {
	WebDriver driver;
	String applicationUrlAddress="https://echoecho.com/";
	
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

