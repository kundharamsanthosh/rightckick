package orange_h_r_m;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_webtable {
	public static void main(String[] args) {
		
		String applicationUrlAddress="https://www.timeanddate.com/worldclock/";
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./driverfile108/chromedriver.exe");
		driver=new ChromeDriver();
	driver.get(applicationUrlAddress);
	System.out.println(" naviagted to applicationUrlAddress");

	//<td><a href="/worldclock/ghana/accra">Accra</a><span id="p0s" class="wds"></span></td>
	///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
	///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[1]/a
	
	WebElement WebTable=driver.findElement(By.xpath("/html/body/div[5]/section[1]/div"));
	List<WebElement>WebTableRow=driver.findElements(By.tagName("tr"));
	
	for (int i=0;i<=WebTableRow.size();i++) {
		
		List<WebElement>WebTableRowofCell=driver.findElements(By.tagName("td"));
		
		for(int j=0;j<=WebTableRowofCell.size();j++) {
			
			String TableData=WebTableRowofCell.get(j).getText();
			
			System.out.print(TableData+" ");
		}
	
		System.out.println();
	}
	driver.close();
	
	}

}
