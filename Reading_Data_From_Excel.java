package UTILS;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Reading_Data_From_Excel 

{
	@Test
	public static void Read_Data_From_Excel() throws IOException {
	
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\Add_Idex_User.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(file);  //work book of the excel file
		
		XSSFSheet sheet= wb.getSheet("sheet1");    // sheet from the workbook
		
		
		int totalRows =  sheet.getLastRowNum(); 		 // fetch total rows in the sheet
		int totalcells = sheet.getRow(1).getLastCellNum();// fetch total cells in the row
		
		
		System.out.println(totalRows);
		System.out.println(totalcells);
		
		
		for(int r=0; r<=totalRows; r++) {
			
			XSSFRow currentrow=sheet.getRow(r);
			
			for(int c=0; c<totalcells; c++) {
				              
				XSSFCell currentcell= currentrow.getCell(c);
				System.out.print(currentcell.toString()+"\t");
			
		}
			
			System.out.println();
		
	
	
	
	}
		
		wb.close();
		file.close();
		
		
	
	

	}
	
}
