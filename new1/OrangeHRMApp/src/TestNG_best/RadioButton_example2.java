package TestNG_best;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
package TestNG_best;
public class RadioButton_example2 extends best
{
	
	
	@Test
	public void RadioButton_example2 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dharmaraju\\eclipse-workspace\\srinivas_toutrial\\new_chrome_driverfile\\chromedriver.exe");
		driver=new ChromeDriver();
		WebElement RadioButtonsBlock=driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));

		
		//<input type="radio" name="group2" value="Water">
		//<input type="radio" name="group2" value="Beer">
		//<input type="radio" name="group2" value="Wine" checked="">

		List<WebElement> RadioButtons=RadioButtonsBlock.findElements(By.name("group2"));

		System.out.println(RadioButtons.size());

		Thread.sleep(5000);
		
		for(int i=0;i<RadioButtons.size();i++)
		{
			RadioButtons.get(i).click();
		

		for(int j= 0;j<RadioButtons.size();j++)
		{
			System.out.println(RadioButtons.size().get(j).getAttributr("checked");
			
			
			
		}
		System.out.println();

	}
	
	
}
