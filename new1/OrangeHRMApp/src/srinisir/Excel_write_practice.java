package srinisir;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileOutputStream;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_write_practice {
	public static void main(String[] args) throws IOException {
		FileInputStream File=new FileInputStream ("C:\\Users\\Dharmaraju\\eclipse-workspace\\srinivas_toutrial\\library\\ExcelData.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(File);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
				Row row=sheet.getRow(1);
				Cell cell=row.createCell(1);
				cell.setCellValue("selenium");
				FileOutputStream file1=new FileOutputStream("C:\\Users\\Dharmaraju\\eclipse-workspace\\srinivas_toutrial\\library\\ExcelData.xlsx");
				workbook.write(file1);
				
				
				
	}

}
