package UTILS;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Writing_Random_Data_Into_Excel2 {
	
	@Test
	public static void Write_Data_Into_Excel() throws IOException {
		
		FileOutputStream fo = new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\writing_data_randomly.xlsx");

		XSSFWorkbook wb = new XSSFWorkbook();
		
		 XSSFSheet sheet =  wb.createSheet("Random_Data");
		 
		 
			 
		  XSSFRow  row= sheet.createRow(4);
		 XSSFCell  cell= row.createCell(3);
		 cell.setCellValue("WELCOME TO INDIA");
		  
		  
		
		

		wb.write(fo);  //attach workbook to the file
		
		wb.close();
		fo.close();
		
		System.out.println("file is created ");
	
	}

}
