package srinisir;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class web_table {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dharmaraju\\eclipse-workspace\\srinivas_toutrial\\new_chrome_driverfile\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.timeanddate.com/worldclock/");

	driver.manage().window().maximize();
	FileInputStream file=new FileInputStream("C:\\Users\\Dharmaraju\\eclipse-workspace\\srinivas_toutrial\\library\\ExcelData.xlsx");
	

XSSFWorkbook workbook=new XSSFWorkbook(file);
XSSFSheet sheet=workbook.getSheet("sheet1");

///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]/a
///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[2]/td[1]/a
///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[1] 
int Row=driver.findElements(By.xpath("html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr")).size();
System.out.println(Row);

///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[7]
int Column=driver.findElements(By.xpath("html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td")).size();
System.out.println(Column);
Thread.sleep(10000);

for(int i=0;i<Row;i++) 
{
	for(int j=0;j<Column;j++) {
	
		System.out.println(driver.findElement(By.xpath("html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+i+"]/td["+j+"]")).getText());
	
	
}
	
	}
	}
}

