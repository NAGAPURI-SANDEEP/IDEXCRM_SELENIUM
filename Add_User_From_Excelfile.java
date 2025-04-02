package PAGES;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import UTILS.Base_Class;
import UTILS.Excel_Utils;

public class Add_User_From_Excelfile extends Base_Class {
	
	public static void addIdexUser() throws IOException, InterruptedException  {
		
		String filepath  =System.getProperty("user.dir")+"\\testdata\\Add_Idex_User.xlsx";
		
		int rows =Excel_Utils.getRowCount(filepath, "Sheet1");
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/div[2]/div[7]/span/div")).click();   //click on user management module
		Thread.sleep(2000);
		
		for(int i=1; i<rows; i++) {
			

			//read data from the excel
			
			String Name = Excel_Utils.getCellData(filepath, "Sheet1", i, 0);
			String Email = Excel_Utils.getCellData(filepath, "Sheet1", i, 1);
			String Phone = Excel_Utils.getCellData(filepath, "Sheet1", i, 2);
			
			//Pass Above data into application
			
			
			
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/button")).click(); // Click on add button 
			
			
			driver.findElement(By.id("register_displayName")).sendKeys(Name);      //Enter User Name 
			driver.findElement(By.id("register_emailId")).sendKeys(Email);         //Enter  Email id
			driver.findElement(By.id("register_mobileNo")).sendKeys(Phone);                   //Enter  Phone Number
			
			
			driver.findElement(By.id("register_roleId")).click();                                     //Selection of role
			driver.findElement(By.id("register_roleId")).sendKeys(Keys.ARROW_DOWN);                   // first option
			driver.findElement(By.id("register_roleId")).sendKeys(Keys.ARROW_DOWN);                   // second option 
			driver.findElement(By.id("register_roleId")).sendKeys(Keys.ENTER);                        //click on enter button
			
			
			driver.findElement(By.id("register_isActive")).click();               						// select the status 
			driver.findElement(By.id("register_isActive")).sendKeys(Keys.ENTER);                        // click on enter 
			
			
			driver.findElement(By.xpath("//*[@id=\"register\"]/footer/div/button[1]")).click();         // Click on add button 
			
			Thread.sleep(10000);
		
				
			
			
			
		}
		
		
	}
	
	
	
	
	

	
public static void addCustomerUser() throws IOException, InterruptedException  {
		
		String filepath  =System.getProperty("user.dir")+"\\testdata\\Add_Customer_User.xlsx";
		
		int rows =Excel_Utils.getRowCount(filepath, "Sheet1");
		
		
		for(int i=1; i<rows; i++) {
			

			//read data from the excel
			
			String Name = Excel_Utils.getCellData(filepath, "Sheet1", i, 0);
			String Email = Excel_Utils.getCellData(filepath, "Sheet1", i, 1);
			String Phone = Excel_Utils.getCellData(filepath, "Sheet1", i, 2);
			
			//Pass Above data into application
			
			Thread.sleep(5000);
			
			
			
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/div[2]/div[7]/span/div")).click();   //click on user management module
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div[2]/div[2]")).click();         //click  customer  module
			
			
			
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/button")).click(); // Click on add button
			
			driver.findElement(By.id("register_displayName")).sendKeys("sandy_123");                 //Enter User Name 
			driver.findElement(By.id("register_emailId")).sendKeys("sandy4s5123@yopmail.com");        //Enter  Email id
			driver.findElement(By.id("register_mobileNo")).sendKeys("1234567987");                    //Enter the mobile number 
			
			
			driver.findElement(By.id("register_roleId")).click();                                     //Selection of role
			driver.findElement(By.id("register_roleId")).sendKeys(Keys.ARROW_DOWN);                   // first option
			driver.findElement(By.id("register_roleId")).sendKeys(Keys.ARROW_DOWN);                   // second option 
			driver.findElement(By.id("register_roleId")).sendKeys(Keys.ENTER);                        //click on enter button
			
			
			
			
			driver.findElement(By.id("rc_select_5")).click();                                        // select the customer from dropdown 
			driver.findElement(By.id("rc_select_5")).sendKeys("KNPL");								// enter the customer name
			Thread.sleep(5000);
			driver.findElement(By.id("rc_select_5")).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(By.id("rc_select_5")).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(By.id("rc_select_5")).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(By.id("rc_select_5")).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(By.id("rc_select_5")).sendKeys(Keys.ARROW_DOWN);
			driver.findElement(By.id("rc_select_5")).sendKeys(Keys.ENTER);                      //click on enter after send keys
			
			
			

			driver.findElement(By.id("register_isActive")).click();               						// select the status 
			driver.findElement(By.id("register_isActive")).sendKeys(Keys.ENTER);                        // click on enter 
			
			
			driver.findElement(By.xpath("//*[@id=\"register\"]/footer/div/button[1]")).click();         // Click on add button 
			
			Thread.sleep(10000);
			
				
			
			
			
			
			
			
		}
		
		
	}
	
	


}
