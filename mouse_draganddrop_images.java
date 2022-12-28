package orange_h_r_m;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse_draganddrop_images {
	public static void main(String[] args) {
		WebDriver driver;
		String Application_Url_Address="https://www.globalsqa.com/demo-site/draganddrop/";
		
		System.setProperty("webdriver.chrome.driver","./driverfile108/chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get(Application_Url_Address);
		driver.manage().window().maximize();
		driver.get(Application_Url_Address);
		
		//<iframe width="700" height="500" data-src="../../demoSite/practice/droppable/photo-manager.html" class="demo-frame lazyloaded" src="data:image/gif;base64,R0lGODlhAQABAAAAACH5BAEKAAEALAAAAAABAAEAAAICTAEAOw=="></iframe>
		
		WebElement Webpageframe=driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div/div/div[2]/div/div/div[1]/p/iframe"));
		driver.switchTo().frame(Webpageframe);
		
		//<img src="images/high_tatras_min.jpg" alt="The peaks of High Tatras" width="96" height="72">
	
WebElement image1=driver.findElement(By.xpath("/html/body/div[1]/ul/li[1]/img"));

WebElement Target=driver.findElement(By.xpath("//*[@id=\"trash\"]"));

Actions act=new Actions(driver);
act.dragAndDrop(image1, Target).build().perform();

	}

}
