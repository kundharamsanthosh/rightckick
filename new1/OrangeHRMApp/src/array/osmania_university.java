package array;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class osmania_university {
	public static void main(String[] args) {
		String osmaniauniversityUrladdress = "https://www.osmania.ac.in";
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","./driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.osmania.ac.in");
		WebElement dropdown=(WebElement) driver.findElement(By.id("gtranslate_selector"));
		List<WebElement>dropdownlinks=driver.findElements(By.id("gtranslate_selector"));
		int linkscount=dropdownlinks.size();
		System.out.println("the number of elements in dropdown is "+linkscount);
		for (int i=0;i<linkscount;i++) {
			if (dropdownlinks.get(i).isDisplayed()){
				String	dropdownlinkName=dropdownlinks.get(i).getText();
				System.out.println(i+" "+dropdownlinkName);
				
				
			}
		}
		driver.quit();
				
	}

}
