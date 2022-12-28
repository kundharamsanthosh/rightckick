package orange_h_r_m;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class valuelap_application {
	public static void main(String[] args) {
		
		WebDriver driver;
		String valuelabApplication_UrlAddress="https://www.valuelabs.com/application-form/";
		System.setProperty("webdriver.chrome.driver","./driverfile108/chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get(valuelabApplication_UrlAddress);
		//<ol class="breadcrumb"><li class="breadcrumb-item"><a href="#">Home</a></li><li class="breadcrumb-item"><a href="#">Careers</a></li><li class="breadcrumb-item active" aria-current="page">Online Application</li></ol>
		
		WebElement HeaderBlock=driver.findElement(By.xpath("/html/body/nav/div"));
		 List<WebElement>HeaderBlockLinks=driver.findElements(By.tagName("a"));
		 
		 int HeaderBlockLinks_Count=HeaderBlockLinks.size();
		 for(int i=0;i<=HeaderBlockLinks_Count;i++) {
			
			String HeaderBlockLinks_Name=HeaderBlockLinks.get(i).getText();
			System.out.println(i+" "+HeaderBlockLinks_Name);
		 }
	}

}
