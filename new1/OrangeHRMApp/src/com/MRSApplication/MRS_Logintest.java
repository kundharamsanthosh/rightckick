package com.MRSApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MRS_Logintest {

	public static void main(String[] args) {
	String applicationUrlAddress="https://demo.openmrs.org/openmrs/login.htm";
	System.setProperty("Webdriver.chrome.driver", "./driverfiles/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get(applicationUrlAddress);
	driver.findElement(By.id("Username")).sendKeys("Admin");
	driver.findElement(By.id("password")).sendKeys("Admin123");
	driver.findElement(By.id("inpatient ward")).click();
	driver.findElement(By.id("LoginButton")).clear();
	

	}

}
