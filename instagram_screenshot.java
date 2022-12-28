package orange_h_r_m;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class instagram_screenshot {
public static void main(String[] args) throws IOException {
	
	WebDriver driver;
	String instagram_Application_UrlAddress="https://www.instagram.com/";
	
	System.setProperty("webdriver.chrome.driver","./driverfile108/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get(instagram_Application_UrlAddress);
	driver.manage().window().maximize();
	
	File instagram_Home_screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	FileHandler.copy(instagram_Home_screenshot,new File("C:\\Santhosh\\orange_h_r_m\\screenshot\\instagram_Home_screenshot.png"));

   driver.close();
}

}
