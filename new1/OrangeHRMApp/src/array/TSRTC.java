package array;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSRTC {
	

	public static void main(String[] args) throws IOException, Exception {
	String	tsrtcurladdress="https://www.tsrtconline.in";
	WebDriver driver;
	
	System.setProperty("webdriver.chrome.driver","./driverfiles/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.tsrtconline.in");
	WebElement headerblock=driver.findElement(By.className("menu-wrap"));
	List<WebElement>headerblocklinks=headerblock.findElements(By.tagName("a"));
	int headerblock_linkscount=headerblocklinks.size();
	System.out.println("the number of links in header file of TSRTC is "+headerblock_linkscount);
	for(int i=0;i<8;i++) {
		
	
		String headerblockLinkname=headerblocklinks.get(i).getText();
	System.out.println(i+"  "+headerblockLinkname);
	String webpageTitle=driver.getTitle();
	System.out.println(webpageTitle);
	String webpageUrlAddress=driver.getCurrentUrl();
	System.out.println(webpageUrlAddress);
	File driverscreenshot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(driverscreenshot,new File("./TSRTC_HeaderBlock_Screenshot/"+headerblockLinkname+".png"));
	
	driver.navigate().back();
	
	
	
	
	
	}
	
	
	
	
   	
   	
	

}
}