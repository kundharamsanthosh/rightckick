import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook_elements {
	public static void main(String[] args) {
	String	facebookurladdress="https://www.facebook.com/login";
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "./driverfiles/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get(facebookurladdress);
	List<WebElement>links=driver.findElements(By.tagName("a"));
	int link_Length=links.size();
	System.out.println("the number of links in facebook login page = "+link_Length);
	for(int i=0;i<links.size();i++)
	{
		System.out.println(i+" "+links.get(i).getText());
	}
	}

}
