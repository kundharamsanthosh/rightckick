package orange_h_r_m;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable_world_clock {
	public static void main(String[] args) {
		
		WebDriver driver;
		String Application_url_address="https://www.timeanddate.com/worldclock/";
      System.setProperty("webdriver.chrome.driver","./driverfile108/chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get(Application_url_address);
		driver.manage().window().maximize();
		
		//<td><a href="/worldclock/ghana/accra">Accra</a><span id="p0s" class="wds"></span></td>
		
		
	}

}
