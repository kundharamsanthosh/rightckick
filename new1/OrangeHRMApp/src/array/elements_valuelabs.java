package array;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class elements_valuelabs {
	public static void main(String[] args) {
		String valuelabsUrlAddress="https://www.valuelabs.com/";
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(valuelabsUrlAddress);
		//id="navbarSupportedContent"
		WebElement headerblock=driver.findElement(By.id("navbarSupportedContent"));
		List<WebElement>headerblocklinks=headerblock.findElements(By.tagName("a"));
		int linkscount=headerblocklinks.size();
		System.out.println("the number of links in value labs homepage is  "+linkscount);
		for(int i = 0;i<linkscount;i++) {
			if(headerblocklinks.get(i).isDisplayed())
					{
			String	headerblocklinkName=headerblocklinks.get(i).getText();
			System.out.println(i+" "+headerblocklinkName);
			}
					
		}
		
		driver.quit();
		
	}

}
