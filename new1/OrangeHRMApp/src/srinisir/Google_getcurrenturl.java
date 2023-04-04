package srinisir;

import org.openqa.selenium.chrome.ChromeDriver;

public class Google_getcurrenturl {
	public static void main(String[] args) {
	String applicationUrlAddress=("http://google.com");
    System.setProperty("webdriver.chrome.driver",".\\driverfiles\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get(applicationUrlAddress);
	String expected_GoogleHomepageurladdress="google.com";
	System.out.println("the expected google homepage url address is:-"+expected_GoogleHomepageurladdress);
	String actual_GoogleHomepageurladdress=driver.getCurrentUrl();
	System.out.println("the actual google homepage url address is:-"+actual_GoogleHomepageurladdress);
	if(actual_GoogleHomepageurladdress.contains(expected_GoogleHomepageurladdress))
	{
	System.out.println("google homepage url address matched:-"+"pass");
	}
	else
	{
		System.out.println("google homepage url address notmatched -FAIL");
	}	
		
	driver.quit();
	
	}
}
