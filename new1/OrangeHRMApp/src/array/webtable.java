package array;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable {


public static void main(String[] args) throws Exception   {
	String applicationUrlAddress="https://www.timeanddate.com/worldclock/";
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "new_chrome_driverfile/chromedriver.exe");
	driver=new ChromeDriver();
driver.get(applicationUrlAddress);
System.out.println(" naviagted to applicationUrlAddress");

FileInputStream file=new FileInputStream("./library/webtable.xlsx");
XSSFWorkbook workbook=new XSSFWorkbook(file);
XSSFSheet sheet=workbook.getSheet("sheet1");


///html/body/div[5]/section[1]/div/section/div[1]

	WebElement	frameElement=driver.findElement(By.xpath("/html/body/div[5]/section[1]/div/section/div[1]"));
	
	///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]/a
	
	///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[2]/td[1]/a
	
	// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[1]/a
	
	//frameElement.findElements(By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]"));

	String s1="/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[";
	
	String s2="]/td[1]/a";
	
	
	for(int i=1;i<=36;i++)
	{
		List<WebElement>data=driver.findElements(By.xpath(s1+i+s2));
//		for(int j=0;j<=35;j++)
//		{
	String	tabledata=data.get(i-1).getText();
	System.out.println(tabledata);
		//}
	}

}
}