package orange_h_r_m;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse_draganddrop_action {
	public static void main(String[] args) {
		
		WebDriver driver;
		String Application_Url_Address="http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html";
		
		System.setProperty("webdriver.chrome.driver","./driverfile108/chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get(Application_Url_Address);
		driver.manage().window().maximize();
		driver.get(Application_Url_Address);
		
		//<div class="dragableBox" id="box6" dragableelement="5">Rome</div>
		
		WebElement rome=driver.findElement(By.id("box6"));
		
		//<div id="box106" class="dragableBoxRight">Italy</div>
		
		WebElement Italy=driver.findElement(By.id("box106"));
		
		Actions act= new Actions(driver);
		act.dragAndDrop(rome, Italy).build().perform();  //drag and drop
		
		
		
	}

}
