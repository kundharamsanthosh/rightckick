package OrangeHrm;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Add_Employee_Test {
	WebDriver driver;
	String ApplicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";

	@BeforeTest
	public void setup() {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dharmaraju\\eclipse-workspace\\srinivas_toutrial\\new_chrome_driverfile\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get(ApplicationUrlAddress);
	driver.manage().window().maximize();
	
	}
	
	@Test (priority=1)
	public void LoginTest() {
		//<input name="txtUsername" id="txtUsername" type="text">
		WebElement UserName=driver.findElement(By.name("txtUsername"));
		UserName.clear();
		UserName.sendKeys("Madan");
		
		//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
		
		WebElement Password=driver.findElement(By.name("txtPassword"));
		Password.clear();
		Password.sendKeys("Livetech11@");
		
		//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
		
		WebElement LoginButton=driver.findElement(By.className("button                                                                                                                                                                                                                                                                                                                                     "));
		LoginButton.click();	

	}
	
    @Test (priority=2)
    public void PimTest() {
    	//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/viewPimModule"
    	//id="menu_pim_viewPimModule" class="firstLevelMenu"><b>PIM</b></a>
    	
    	WebElement Pim=driver.findElement(By.id("menu_pim_viewPimModule"));
    	Actions action=new Actions (driver);
    	action.moveToElement(Pim).build().perform();
    	
    	//Actions action = new Actions(driver);
    	//action.moveToElement(Pim).build().perform()
    	
    }
    
    @Test (priority=3)
    public void AddEmployeeTest() {
    	//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/addEmployee" id="menu_pim_addEmployee">Add Employee</a>
    	WebElement AddEmployee=driver.findElement(By.id("menu_pim_addEmployee"));
    	AddEmployee.click();
    }
    
    @Test (priority=4)
    public void AddNewEmployeeName() {
    	
    	//<input class="formInputText" maxlength="30" type="text" name="firstName" id="firstName">	
    	WebElement FirstName=driver.findElement(By.id("firstName"));
    	
    	FirstName.sendKeys("santhosh");
    	////*[@id="lastName"]
WebElement LastName=driver.findElement(By.xpath("//*[@id=\"lastName\"]"));
    	
    	LastName.sendKeys("kundharam");
    	
    	WebElement EmployeeId=driver.findElement(By.xpath("//*[@id=\"employeeId\"]"));
    	EmployeeId.sendKeys("4242");
    	
    	//java.lang.Runtime.getRuntime().exec(ApplicationUrlAddress)
    	
    	
    }
    
	}
	
	
	
	

