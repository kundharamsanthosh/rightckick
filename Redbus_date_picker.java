package orange_h_r_m;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus_date_picker {
	public static void main(String[] args) {
		WebDriver driver;
		String Application_Url_Address="https://www.redbus.in/bus-tickets/?gclid=EAIaIQobChMIhenG57WU_AIVN5hmAh0S7wVjEAAYASAAEgJYfvD_BwE";
		
		System.setProperty("webdriver.chrome.driver","./driverfile108/chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get(Application_Url_Address);
		driver.manage().window().maximize();
		driver.get(Application_Url_Address);
		
		String year="2023";
		String month="May";
		String date="5";
		
		
		
		//<input type="text" id="txtOnwardCalendar" autocomplete="off" style="position:absolute;height:98%;padding-left:35px;border:none;outline:none" placeholder="ONWARD DATE" value="">
		
		WebElement onwardcalander=driver.findElement(By.id("txtOnwardCalendar"));
		onwardcalander.click();
		
		while(true)
		{
			//<li class="rb-calendar-header">      <div class="rb-inline" id="rb-month-action"><span id="rb-month">Oct</span><img class="hide" src="https://s1.rdbuz.com/build/seo/images/left-arrow.svg"></div>      <div class="rb-inline" id="rb-year-action"><span id="rb-year">2023</span><img class="hide" src="https://s1.rdbuz.com/build/seo/images/left-arrow.svg"></div>      <div class="selectionContainer"></div>    </li>
		String	month_year_header=driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[3]/div[3]/div/div/div[1]/div[2]/div[2]/div/ul/li[3]/div[1]/span")).getText();
		
		String arr[]=month_year_header.split(" ");
		
		String mon=arr[0];
		String yr=arr[1];
		if(mon.equalsIgnoreCase(month)&&yr.equals(year))
		
		
			break;
		else
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[3]/div[3]/div/div/div[1]/div[2]/div[2]/div/ul/li[1]/img"));
		
		
			
			
		}	
		
		}	
	}


