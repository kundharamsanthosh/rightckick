package orange_h_r_m;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class orangehrm_screenshot {
	
	public static void main(String[] args) throws IOException {
		
		WebDriver driver;
		String orangehrmapplicationurladdress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		System.setProperty("webdriver.chrome.driver","C:\\Santhosh\\orange_h_r_m\\driverfiles\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(orangehrmapplicationurladdress);
		
		//<input name="txtUsername" id="txtUsername" type="text">
		
		WebElement UserName=driver.findElement(By.id("txtUsername"));
		UserName.sendKeys("kundharamsanthosh");
		
		//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
		
		WebElement Password=driver.findElement(By.id("txtPassword"));
		Password.sendKeys("703601345@One");
		
		//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">

		WebElement Login=driver.findElement(By.id("btnLogin"));
		Login.click();
		
		File OHRMScreenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyfile(OHRMScreenshot,new File("C:/Santhosh\\orange_h_r_m/screenshot/ohrmHomepage.png"));
		FileHandler.copy(OHRMScreenshot,new File("C:/Santhosh\\\\orange_h_r_m/screenshot/ohrmHomepage.png"));
		System.out.println("screenshot");
		
		
		
		
	}
}
