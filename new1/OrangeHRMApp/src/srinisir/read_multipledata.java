package srinisir;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class read_multipledata {
	public static void main(String[] args) throws Exception {


File src=new File("C:/Users/Dharmaraju/eclipse-workspace/srinivas_toutrial/library/ExcelData.xlsx");
FileInputStream fis=new FileInputStream(src);

XSSFWorkbook wb=new XSSFWorkbook(fis);
XSSFSheet sheet=wb.getSheet("Sheet1");

int  rowcount=sheet.getLastRowNum();

for(int i=0;i<=rowcount;i++)
{
	Row row=sheet.getRow(i);
	
	int cellcount=row.getLastCellNum();
	
	for(int k=0;k<cellcount;k++)
	{
		
		Cell cell=row.getCell(k);
		String data=cell.getStringCellValue();
		System.out.print(data);
		
		
	}
	System.out.println();
}



}
}