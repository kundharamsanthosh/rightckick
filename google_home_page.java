package orange_h_r_m;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class google_home_page {
	public static void main(String[] args) {
		
		WebDriver driver;
		String Google_application_Url_Address="https://www.google.com/";
		
		System.setProperty("webdriver.chrome.driver","./driverfiles/chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get(Google_application_Url_Address);
		 //<a aria-label="Sign in" class="M6CB1c yZqNl" href="https://www.google.com/url?q=https://accounts.google.com/signin/v2/identifier%3Fec%3Dhpp_signin_001&amp;source=hpp&amp;id=19028915&amp;ct=7&amp;usg=AOvVaw0vzncMxTXoSw2mJNT4ZyvY" jsname="tf37qf" jslog="71122; track:click;" target="_blank" data-dismiss="a">Sign in</a>
	
           //  WebElement Sign=driver.findElement(By.linkText("Sign in"));
		 WebElement Sign=driver.findElement(By.partialLinkText("Sign"));
             Sign.click();
	}

}
