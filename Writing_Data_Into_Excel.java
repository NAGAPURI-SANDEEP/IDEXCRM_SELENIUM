package UTILS;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Writing_Data_Into_Excel {
	
	@Test
	public static void Write_Data_Into_Excel() throws IOException {
		
		FileOutputStream fo = new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\writingdata.xlsx");

		XSSFWorkbook wb = new XSSFWorkbook();
		
		 XSSFSheet sheet =  wb.createSheet("Data_1");
		 
		 XSSFRow  row1=  sheet.createRow(1);
		 
		 row1.createCell(0).setCellValue("sandeep");
		 row1.createCell(1).setCellValue("JAVA");
		 row1.createCell(2).setCellValue("1234567890");
		 
		 XSSFRow  row2=  sheet.createRow(2);

		 row2.createCell(0).setCellValue("sidhu");
		 row2.createCell(1).setCellValue("Python");
		 row2.createCell(2).setCellValue("54354367897");
		 
		 
		 XSSFRow  row3=  sheet.createRow(3);

		 row3.createCell(0).setCellValue("sidhu");
		 row3.createCell(1).setCellValue("Python");
		 row3.createCell(2).setCellValue("54354367897");
		

		wb.write(fo);
		
		wb.close();
		fo.close();
		
		System.out.println("file is created ");
	
	}

}
