package com.ohrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class India {
	public static void main(String[] args) {
		String applicationurladdress="https://www.google.com/";
		WebDriver driver;
	System.setProperty("webdriver.chrome.driver","./driverfiles/chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(applicationurladdress);
	WebElement indiaElement=driver.findElement(By.className("uU7dJb"));
	String indiaElement_text=indiaElement.getText();
	System.out.println("the text of an element India on the google"+"Homepage is"+   indiaElement_text);
	driver.close();
	
	
	}

}
