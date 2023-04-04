package OrangeHRM_project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;



public class OHRM_read_write_operations extends OrangeHRMproject_BaseTest {

	@Test(priority=1)
	public void OHRM_read_data() throws IOException {
	FileInputStream	File=new FileInputStream("./library/ExcelData.xlsx");	
	
	XSSFWorkbook workbook= new XSSFWorkbook(File);
	XSSFSheet sheet=workbook.getSheet("sheet1");
	 Row row=sheet.getRow(0);
	 Cell cell=row.getCell(0);
	 
	int rowcount=sheet.getLastRowNum();
	
	for (int i=0;i<= rowcount;i++) 
	{
		Row r=sheet.getRow(i);	
		int cellcount=r.getLastCellNum();
		for(int k=0;k<cellcount;k++)
			
		{
			Cell c=row.getCell(k);
			String data=c.getStringCellValue();
			System.out.print(data);
			
			
	}
		System.out.println();
	}
	
	}
	}

 