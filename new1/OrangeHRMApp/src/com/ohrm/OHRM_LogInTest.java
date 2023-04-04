package com.ohrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.seleniumhq.jetty9.util.log.Log;

public class OHRM_LogInTest {
public static void main(String[] args) {
String applicationUrlAddress=("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard");
		System.setProperty("webdriver.chrome.driver", "./driverfiles/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(applicationUrlAddress);
		
		String expected_homepage_title="orangeHRM";
		System.out.println("the expected title of orangeHRM is:"+expected_homepage_title);
				
String actual_homepage_title=driver.getTitle();
System.out.println("the actual title of orangeHRM is:"+actual_homepage_title);
driver.findElement(By.id("txtUsername")).sendKeys("Santhoshkundharam");
WebElement password=driver.findElement(By.name("txt password"));
password.sendKeys("703601345@One");
WebElement LoginButton=driver.findElement(By.className("button"));
LoginButton.click();
	}

}
