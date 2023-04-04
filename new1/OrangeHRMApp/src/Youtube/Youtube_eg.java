package Youtube;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Youtube_eg {
	WebDriver driver;
	String ApplicationUrlAddress="https://www.youtube.com/watch?v=HtMF973tXIY";
	
	
	@BeforeTest
	public void Youtube() {
	System.setProperty("webdriver.chrome.driver","./new_chrome_driverfile/chromedriver.exe");
	driver=new ChromeDriver();
	
	driver.get(ApplicationUrlAddress);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

}
	@Test
	public void SearchTest() throws InterruptedException {
		//<input id="search" autocapitalize="none" autocomplete="off" autocorrect="off" name="search_query" tabindex="0" type="text" spellcheck="false" placeholder="Search" aria-label="Search" role="combobox" aria-haspopup="false" aria-autocomplete="list" dir="ltr" class="ytd-searchbox" style="outline: none;">
	//WebElement Search=driver.findElement(By.name("search_query"));
	Thread.sleep(10000);
	//Search.sendKeys("National Antham");
	//Actions action=new Actions(driver);
	//action.sendKeys(Keys.ENTER).build().perform();
	
	//<img id="img" draggable="false" class="style-scope yt-img-shadow" alt="" width="360" src="https://i.ytimg.com/vi/HtMF973tXIY/hq720.jpg?sqp=-oaymwEcCOgCEMoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&amp;rs=AOn4CLAHNQOp6zNbC_AORQYJnIU1hjIXRA">
	//<button class="ytp-play-button ytp-button" aria-keyshortcuts="k" data-title-no-tooltip="Play" aria-label="Play keyboard shortcut k" title="Play (k)"><svg height="100%" version="1.1" viewBox="0 0 36 36" width="100%"><use class="ytp-svg-shadow" xlink:href="#ytp-id-84"></use><path class="ytp-svg-fill" d="M 12,26 18.5,22 18.5,14 12,10 z M 18.5,22 25,18 25,18 18.5,14 z" id="ytp-id-84"></path></svg></button>
	WebElement Play=driver.findElement(By.className("ytp-play-button ytp-button"));
	Actions Playit=new Actions((WebDriver) Play);

	Playit.sendKeys(Keys.ENTER).build().perform();
	
	
	
	}
}