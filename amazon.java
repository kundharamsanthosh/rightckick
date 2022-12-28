package orange_h_r_m;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class amazon {
	public static void main(String[] args) {
		
		WebDriver driver;
		String Amazon_ApplicationUrlAddress="https://www.amazon.in/";
		System.setProperty("webdriver.chrome.driver","./driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(Amazon_ApplicationUrlAddress);
		
		//<a href="https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&amp;openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&amp;openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&amp;openid.assoc_handle=inflex&amp;openid.mode=checkid_setup&amp;openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&amp;openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&amp;" class="nav-a nav-a-2   nav-progressive-attribute" data-nav-ref="nav_ya_signin" data-nav-role="signin" data-ux-jq-mouseenter="true" id="nav-link-accountList" tabindex="0" data-csa-c-type="link" data-csa-c-slot-id="nav-link-accountList" data-csa-c-content-id="nav_ya_signin" data-csa-c-id="o8vyi1-xp1cfh-q6pntu-aawohp">
		  //<div class="nav-line-1-container"><span id="nav-link-accountList-nav-line-1" class="nav-line-1 nav-progressive-content">Hello, sign in</span></div>
		 // <span class="nav-line-2 ">Account &amp; Lists<span class="nav-icon nav-arrow" style="visibility: visible;"></span>
		//  </span>
	//	</a>
		
	WebElement Hello_signIn=driver.findElement(By.id("nav-link-accountList-nav-line-1"));	
	//mouse over operation on Hello signin
	
	Actions action=new Actions(driver);
	action.moveToElement(Hello_signIn).build().perform();
	
	WebElement your_orders=driver.findElement(By.linkText("Your Orders"));
	your_orders.click();
	
		
		
	}

}
