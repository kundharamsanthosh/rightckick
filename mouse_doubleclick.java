package orange_h_r_m;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse_doubleclick {
	public static void main(String[] args) {
		
		WebDriver driver;
		String Application_Url_Address="https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3";
		
		System.setProperty("webdriver.chrome.driver","./driverfile108/chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get(Application_Url_Address);
		driver.manage().window().maximize();
		driver.get(Application_Url_Address);
		
		//<iframe frameborder="0" id="iframeResult" name="iframeResult" allowfullscreen="true"></iframe>
		
		WebElement webpageframe=driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(webpageframe);
		System.out.println("Identified the elements in the frame of webpage");
		
		//<input type="text" id="field1" value="Hello World!">
		
		WebElement field1=driver.findElement(By.id("field1"));
		field1.clear();
		field1.sendKeys("welcome");
		
        //<input type="text" id="field2">
		WebElement field2=driver.findElement(By.id("field2"));
		field2.clear();
		field2.sendKeys("welcome");
		
		WebElement button=driver.findElement(By.xpath("/html/body/button"));
		Actions act=new Actions(driver);
		act.doubleClick(button).build().perform();//this method perform double click
		System.out.println("success");
		
		driver.close();
		
		
		
		
		
 	}

}
