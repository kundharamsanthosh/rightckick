package program;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class google_open_close {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dharmaraju\\eclipse-workspace\\srinivas_toutrial\\driverfiles\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.google.com");
		String u=d.getCurrentUrl();
		if(u.equals("https://www.google.com"))
		{
			System.out.println("Test case is passed");
		}
		else {
			System.out.println("Test case is Failed");
		}
		d.close();
		
		
		
		
		
		
		
		
		
		
	}

}
