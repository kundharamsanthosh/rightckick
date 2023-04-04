package srinisir;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Excel_read1 {

	public static void main(String[] args) throws Exception {


File src=new File("C:/Users/Dharmaraju/eclipse-workspace/srinivas_toutrial/library/ExcelData.xlsx");
FileInputStream fis=new FileInputStream(src);

XSSFWorkbook wb=new XSSFWorkbook(fis);
XSSFSheet sheet1=wb.getSheetAt(0);

int rowcount =sheet1.getLastRowNum();
System.out.println("total rows is"+rowcount);

for(int i = 0;i<rowcount;i++)
{
	String data0=sheet1.getRow(i).getCell(0).getStringCellValue();
	System.out.println("Test data from Excel is  "+data0);
	
	
	
	
}
}
}
