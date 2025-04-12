package PAGES;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import UTILS.Base_Class;

public class Add_User_Pg extends Base_Class  {
	
	public static void addIdexUser() throws InterruptedException {
		
	driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/div[2]/div[7]/span/div")).click();   //click on user management module
	driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/button")).click(); // Click on add button 
		
	
	driver.findElement(By.id("register_displayName")).sendKeys("Sidhu sidarthar Roy");      //Enter User Name 
	driver.findElement(By.id("register_emailId")).sendKeys("sidhu321@yopmail.com");         //Enter  Email id
	driver.findElement(By.id("register_mobileNo")).sendKeys("1234567898");                   //Enter  Phone Number
	
	
	driver.findElement(By.id("register_roleId")).click();                                     //Selection of role
	driver.findElement(By.id("register_roleId")).sendKeys(Keys.ARROW_DOWN);                   // first option
	driver.findElement(By.id("register_roleId")).sendKeys(Keys.ARROW_DOWN);                   // second option 
	driver.findElement(By.id("register_roleId")).sendKeys(Keys.ENTER);                        //click on enter button
	
	
	driver.findElement(By.id("register_isActive")).click();               						// select the status 
	driver.findElement(By.id("register_isActive")).sendKeys(Keys.ENTER);                        // click on enter 
	
	
	driver.findElement(By.xpath("//*[@id=\"register\"]/footer/div/button[1]")).click();         // Click on add button 
	
	Thread.sleep(3000);
	//driver.close();
		
		
	}
	
	
	
	
	
	public static void addCustomerUser() throws InterruptedException {
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/div[2]/div[7]/span/div")).click();   //click on user management module
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div[2]/div[2]")).click();         //click  customer  module
		
		
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/button")).click(); // Click on add button
		
		driver.findElement(By.id("register_displayName")).sendKeys("sandy_123");                 //Enter User Name 
		driver.findElement(By.id("register_emailId")).sendKeys("sandy4252123@yopmail.com");        //Enter  Email id
		driver.findElement(By.id("register_mobileNo")).sendKeys("1234567987");                    //Enter the mobile number 
		
		
		driver.findElement(By.id("register_roleId")).click();                                     //Selection of role
		driver.findElement(By.id("register_roleId")).sendKeys(Keys.ARROW_DOWN);                   // first option
		driver.findElement(By.id("register_roleId")).sendKeys(Keys.ARROW_DOWN);                   // second option 
		driver.findElement(By.id("register_roleId")).sendKeys(Keys.ENTER);                        //click on enter button
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement searchInput = wait.until(ExpectedConditions.visibilityOfElementLocated(
//		    By.xpath("//div[contains(@class,'ant-select-selector')]//input[@type='search']")
//		));
//		searchInput.sendKeys("");

		
		

		driver.findElement(By.id("rc_select_5")).click();                                        // select the customer from dropdown 
		driver.findElement(By.id("rc_select_5")).sendKeys("KNPL");								// enter the customer name
		Thread.sleep(5000);
		driver.findElement(By.id("rc_select_5")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("rc_select_5")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("rc_select_5")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("rc_select_5")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("rc_select_5")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("rc_select_5")).sendKeys(Keys.ENTER);                           //click on enter after send keys
		
		

		driver.findElement(By.id("register_isActive")).click();               						// select the status 
		driver.findElement(By.id("register_isActive")).sendKeys(Keys.ENTER);                        // click on enter 
		
		
		driver.findElement(By.xpath("//*[@id=\"register\"]/footer/div/button[1]")).click();         // Click on add button 
		
		Thread.sleep(3000);
		//driver.close();
	}
	
	
	public static void addServicePartnerUser() throws InterruptedException {
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/div[2]/div[7]/span/div")).click();   //click on user management module
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div[2]/div[3]")).click();         //click  service partner  module
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/button")).click(); // Click on add button

		driver.findElement(By.id("register_displayName")).sendKeys("sandeep_123");                 //Enter User Name 
		driver.findElement(By.id("register_emailId")).sendKeys("sandeeps278@yopmail.com");        //Enter  Email id
		driver.findElement(By.id("register_mobileNo")).sendKeys("1234567987");                    //Enter the mobile number 
		
		
		driver.findElement(By.id("register_roleId")).click();                                     //Selection of role
		driver.findElement(By.id("register_roleId")).sendKeys(Keys.ARROW_DOWN);                   // first option
		driver.findElement(By.id("register_roleId")).sendKeys(Keys.ARROW_DOWN);                   // second option 
		driver.findElement(By.id("register_roleId")).sendKeys(Keys.ENTER);                        //click on enter button
		
		
		driver.findElement(By.id("rc_select_5")).click();                                        // select the customer from dropdown 
		driver.findElement(By.id("rc_select_5")).sendKeys("SKAAP");								// enter the service partner name
		Thread.sleep(3000);
//		driver.findElement(By.id("rc_select_5")).sendKeys(Keys.ARROW_DOWN);
//		driver.findElement(By.id("rc_select_5")).sendKeys(Keys.ARROW_DOWN);
//		driver.findElement(By.id("rc_select_5")).sendKeys(Keys.ARROW_DOWN);
//		driver.findElement(By.id("rc_select_5")).sendKeys(Keys.ARROW_DOWN);
//		driver.findElement(By.id("rc_select_5")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("rc_select_5")).sendKeys(Keys.ENTER);                           //click on enter after send keys
		
		
		driver.findElement(By.id("register_isActive")).click();               						// select the status 
		driver.findElement(By.id("register_isActive")).sendKeys(Keys.ENTER);                        // click on enter 
		
		
		driver.findElement(By.xpath("//*[@id=\"register\"]/footer/div/button[1]")).click();         // Click on add button 
		
		Thread.sleep(3000);
		//driver.close();
		
	

	}

}
