package srinisir;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_write_operations {
	public static void main(String[] args) throws Exception {


File src=new File("C:/Users/Dharmaraju/eclipse-workspace/srinivas_toutrial/library/ExcelData.xlsx");
FileInputStream fis=new FileInputStream(src);

XSSFWorkbook wb=new XSSFWorkbook(fis);
XSSFSheet sheet1=wb.getSheetAt(0);

String data0=sheet1.getRow(0).getCell(0).getStringCellValue();
System.out.println("Data from Excel is "+data0);

String data1=sheet1.getRow(0).getCell(01).getStringCellValue();
System.out.println("Data from Excel is "+data1);
wb.close();



}
}