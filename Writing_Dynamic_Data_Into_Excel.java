package UTILS;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Writing_Dynamic_Data_Into_Excel {
	
	@Test
	public static void Write_Data_Into_Excel() throws IOException {
		
		FileOutputStream fo = new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\writing_data_dynamically.xlsx");

		XSSFWorkbook wb = new XSSFWorkbook();
		
		 XSSFSheet sheet =  wb.createSheet("Dynamic_Data");
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter number of rows");
		 
		 int No_Of_Rows= sc.nextInt();
		 
		 System.out.println("Enter number of cells");
		 
		 int No_Of_columns = sc.nextInt();
		 
		 for(int r=0; r<No_Of_Rows; r++) {
			 
			 XSSFRow  current_row= sheet.createRow(r);
			 
			 for(int c=0; c<No_Of_columns; c++) {
				 
				 XSSFCell current_cell= current_row.createCell(c);
				 current_cell.setCellValue(sc.next());
			 }
		 }
		
		

		wb.write(fo);  //attach workbook to the file
		
		wb.close();
		fo.close();
		
		System.out.println("file is created ");
	
	}

}
