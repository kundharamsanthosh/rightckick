package orange_h_r_m;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook_link {
	public static void main(String[] args) {
		
		WebDriver driver;
		String FaceBook_Login="https://www.facebook.com/";
		System.setProperty("webdriver.chrome.driver","C:\\Santhosh\\orange\\driverfile 108\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(FaceBook_Login);
 List<WebElement>links=driver.findElements(By.tagName("li"));
	 int links_Length=links.size();
	 
	 System.out.println("The number of links in facebook_login is  "+links_Length);
	 
	 for(int i=0;i<=links_Length;i++) {
		 System.out.println(i+" "+links.get(i).getText());
	 }
	
	}

}
