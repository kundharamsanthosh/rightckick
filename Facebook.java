package orange_h_r_m;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) {
	

		WebDriver driver;
		String Facebook_login_ApplicationUrlAddress="https://www.facebook.com/login/";
		System.setProperty("webdriver.chrome.driver","C:\\Santhosh\\orange_h_r_m\\driverfiles\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Facebook_login_ApplicationUrlAddress);
		//<input type="text" class="inputtext _55r1 inputtext _1kbt inputtext _1kbt" name="email" id="email" tabindex="0" placeholder="Email address or phone number" value="" autofocus="1" autocomplete="username" aria-label="Email address or phone number">
		
		 WebElement UserName=driver.findElement(By.id("email"));
		 UserName.sendKeys("9948608525");
		 
		 //<input type="password" class="inputtext _55r1 inputtext _9npi inputtext _9npi" name="pass" id="pass" tabindex="0" placeholder="Password" value="" autocomplete="current-password" aria-label="Password">

		WebElement PassWord=driver.findElement(By.id("pass"));
		PassWord.sendKeys("santhoshsunny");
		
		//<button value="1" class="_42ft _4jy0 _52e0 _4jy6 _4jy1 selected _51sy" id="loginbutton" name="login" tabindex="0" type="submit">Log in</button>
		
		WebElement LogInButton=driver.findElement(By.id("loginbutton"));
		LogInButton.click();
		}
		
		
		
		
		
		
	}


