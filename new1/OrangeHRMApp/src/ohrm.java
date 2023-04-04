import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ohrm {
public static void main(String[] args) throws Exception {
System.setProperty("webdriver.chrome.driver","./driverfiles/chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
String expected_orangeHRM_Homepage_Title="Orange HRM";
System.out.println("the expected title of orangeHRM "
		+ "application"+"Homepage Title"+expected_orangeHRM_Homepage_Title);
String actual_orangeHRM_Homepage_Title=driver.getTitle();
System.out.println("the actual title of orangeHRM"+"Homepage Title"+actual_orangeHRM_Homepage_Title);
String orangeHRM_URLaddress=driver.getCurrentUrl();
System.out.println("orangeHRM url address is"+orangeHRM_URLaddress);
//<div id="divUsername" class="textInputContainer"
//><input name="txtUsername" id="txtUsername" type="text"> 
//<span class="form-hint" style="display: none;">Username</span> </div>
driver.findElement(By.id("txtUsername")).sendKeys("Santhoshkundharam");
//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
WebElement password=driver.findElement(By.name("txtPassword" ));
password.sendKeys("703601345@One");
//<div id="divLoginButton">
//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
//</div>
WebElement loginButton=driver.findElement(By.name("Submit"));
loginButton.click();

driver.findElement(By.id("welcome")).click();
//<link rel="stylesheet" type="text/css" media="screen" href="/orangehrm-4.2.0.1/symfony/
//web/webres_5bdfdad33dec87.24121780/orangehrmDashboardPlugin/css/orangehrmDashboardPlugin.ch
Thread.sleep(10000);
WebElement logout=driver.findElement(By.linkText("Logout"));
logout.click();






}
}
