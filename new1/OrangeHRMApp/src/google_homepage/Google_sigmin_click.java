package google_homepage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_sigmin_click {
	public static void main(String[] args) {
		String applicationurlAddress="http://google.com";
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",".\\driverfiles\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(applicationurlAddress);
		WebElement signIn=driver.findElement(By.linkText("sign in"));
		signIn.click();
		
		
	}

}
