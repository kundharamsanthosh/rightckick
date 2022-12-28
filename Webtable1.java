package orange_h_r_m;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable1 {
	public static void main(String[] args) {
		WebDriver driver;
		
String Application_Url_Address="https://www.selenium.dev/downloads/";
		
		System.setProperty("webdriver.chrome.driver","./driverfile108/chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get(Application_Url_Address);
		driver.manage().window().maximize();
		driver.get(Application_Url_Address);
		
		
		
	}

}
