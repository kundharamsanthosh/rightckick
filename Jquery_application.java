package orange_h_r_m;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Jquery_application {
	public static void main(String[] args) {
		WebDriver driver;
		
String Application_Url_Address="https://jqueryui.com/droppable/";
		
		System.setProperty("webdriver.chrome.driver","./driverfile108/chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get(Application_Url_Address);
		driver.manage().window().maximize();
		driver.get(Application_Url_Address);
		
		//<iframe src="/resources/demos/droppable/default.html" class="demo-frame"></iframe>
		
		 WebElement Webpageframe=driver.findElement(By.className("demo-frame"));
		  
		 driver.switchTo().frame(Webpageframe);
		  
		 //<div id="draggable" class="ui-widget-content ui-draggable ui-draggable-handle" style="position: relative;">
			//<p>Drag me to my target</p>
			//</div>
		 
		 WebElement dragmeElement=driver.findElement(By.id("draggable"));
		 
		 //<div id="droppable" class="ui-widget-header ui-droppable">
			//<p>Drop here</p>
			//</div>
		 
		 
		WebElement drophere=driver.findElement(By.id("droppable"));
		
		Actions act=new Actions(driver);
		
		act.dragAndDrop(dragmeElement, drophere).build().perform();
		
		
	}

}
