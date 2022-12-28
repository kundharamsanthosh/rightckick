package orange_h_r_m;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick_operations {
	public static void main(String[] args) {
		
		WebDriver driver;
		String Application_Url_Address="https://swisnl.github.io/jQuery-contextMenu/demo.html";
		
		System.setProperty("webdriver.chrome.driver","./driverfile108/chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get(Application_Url_Address);
		driver.manage().window().maximize();
		
		//<span class="context-menu-one btn btn-neutral">right click me</span>
		///html/body/div/section/div/div/div/p
		WebElement option=driver.findElement(By.xpath("/html/body/div/section/div/div/div/p"));
		
		
		Actions action=new Actions(driver);
		action.contextClick().build().perform();
		System.out.println("yes");
		
		driver.close();
	}

}
