package PAGES;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;


import UTILS.Base_Class;
import UTILS.Excel_Utils;

public class Add_Service_ticket_Pg extends Base_Class{
	
	public static void Addticket() throws IOException, InterruptedException {
		
		
String filepath  =System.getProperty("user.dir")+"\\testdata\\Add_Service_ticket.xlsx";
		
		int rows =Excel_Utils.getRowCount(filepath, "Sheet1");
		
		
		for(int i=1; i<rows; i++) {
			

			//read data from the excel
			
			String Depot_Code = Excel_Utils.getCellData(filepath, "Sheet1", i, 0);
			String Dealer_Code = Excel_Utils.getCellData(filepath, "Sheet1", i, 1);
			String Dealer_Name= Excel_Utils.getCellData(filepath, "Sheet1", i, 2);
			String Address = Excel_Utils.getCellData(filepath, "Sheet1", i, 3);
			String City = Excel_Utils.getCellData(filepath, "Sheet1", i, 4);
			String Pin_Code = Excel_Utils.getCellData(filepath, "Sheet1", i, 5);
			String State = Excel_Utils.getCellData(filepath, "Sheet1", i, 6);
			String Div_Region = Excel_Utils.getCellData(filepath, "Sheet1", i, 7);
			String Dealer_Contact_Number = Excel_Utils.getCellData(filepath, "Sheet1", i, 8);
			String Machine_Serial_Number = Excel_Utils.getCellData(filepath, "Sheet1", i, 9);
			String Gyro_Type = Excel_Utils.getCellData(filepath, "Sheet1", i, 10);
			String Gyro_SNO = Excel_Utils.getCellData(filepath, "Sheet1", i, 11);
			
			//Pass Above data into application
			
			
			
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/div[4]/span/div")).click(); // Click on add button 
			Thread.sleep(5000);

			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div[2]/div[1]/div[2]/button[2]")).click(); // Click on create  button
			
			driver.findElement(By.xpath("//section/div/div[1]/div/div/div[2]/div/div/div/div/div/span[1]")).click();
			
			Thread.sleep(3000);
			
			driver.findElement(By.id("rc_select_3")).sendKeys("KNPL");
			Thread.sleep(3000);

			driver.findElement(By.id("rc_select_3")).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(By.id("rc_select_3")).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(By.id("rc_select_3")).sendKeys(Keys.ENTER);
			
			
			driver.findElement(By.id("ticketForm_ticketType")).click();
			Thread.sleep(3000);
			//driver.findElement(By.id("ticketForm_ticketType")).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(By.id("ticketForm_ticketType")).sendKeys(Keys.ENTER);
			
			driver.findElement(By.className("ticket_addNewSpan__1D3nL")).click();
			
			driver.findElement(By.xpath("//*[@id=\"registerDealer\"]/section/div[2]/div[1]/button")).click();
			
			driver.findElement(By.id("rc_select_6")).click();
			driver.findElement(By.id("rc_select_6")).sendKeys(Keys.ENTER);
			
			driver.findElement(By.id("registerDealer_depotCode")).sendKeys(Depot_Code);
			driver.findElement(By.id("registerDealer_dealerCode")).sendKeys(Dealer_Code);
			driver.findElement(By.id("registerDealer_dealerName")).sendKeys(Dealer_Name);
			driver.findElement(By.id("registerDealer_address")).sendKeys(Address);
			driver.findElement(By.id("registerDealer_districtName")).sendKeys(City);
			driver.findElement(By.id("registerDealer_zipcode")).sendKeys(Pin_Code);
			driver.findElement(By.id("registerDealer_stateId")).sendKeys(State);
			driver.findElement(By.id("registerDealer_stateId")).sendKeys(Keys.ENTER);
			
			driver.findElement(By.id("registerDealer_regionName")).sendKeys(Div_Region);
			driver.findElement(By.id("registerDealer_contactNo")).sendKeys(Dealer_Contact_Number);
			
			driver.findElement(By.id("registerDealer_machineTypeName")).click();
			driver.findElement(By.id("registerDealer_machineTypeName")).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(By.id("registerDealer_machineTypeName")).sendKeys(Keys.ENTER);
			
			driver.findElement(By.id("rc_select_10")).click();
			driver.findElement(By.id("rc_select_10")).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(By.id("rc_select_10")).sendKeys(Keys.ENTER);
			
			
			driver.findElement(By.id("registerDealer_machineSerialNo")).sendKeys(Machine_Serial_Number);
			
			driver.findElement(By.id("registerDealer_gyro")).click();
			driver.findElement(By.id("registerDealer_gyro")).sendKeys(Keys.ENTER);
			
			
			driver.findElement(By.id("registerDealer_gyroType")).sendKeys(Gyro_Type);
			
			driver.findElement(By.id("registerDealer_ups")).click();
			driver.findElement(By.id("registerDealer_ups")).sendKeys(Keys.ENTER);
			
			
			driver.findElement(By.id("registerDealer_galileo")).click();
			driver.findElement(By.id("registerDealer_galileo")).sendKeys(Keys.ENTER);
			
			
			
			driver.findElement(By.id("registerDealer_gyroSerialNo")).sendKeys(Gyro_SNO);
			
			driver.findElement(By.id("registerDealer_locationTypeId")).click();
			driver.findElement(By.id("registerDealer_locationTypeId")).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(By.id("registerDealer_locationTypeId")).sendKeys(Keys.ENTER);
			
			
			driver.findElement(By.xpath("//*[@id=\"registerDealer\"]/section/div[2]/div[1]/button")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//*[@id=\"ticketForm\"]/footer/div/button[1]/span")).click();
			
			
			driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div[1]/div/div[2]/div[2]/span[2]")).click();
					
					
					
					
					
					
					
					
					
			;
			
			
		
			
			
			
		}
		
		
	}
	
		
	
	
	
	

}
