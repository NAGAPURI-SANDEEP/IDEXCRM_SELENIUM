package PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import UTILS.Base_Class;

public class Delete_User_Pg extends Base_Class {
	
	public static void deleteIdexUser() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div[2]/div[1]")).click();                    //Click on idex module
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/div[2]/div[7]/span/div")).click();             //click on user management module
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div[3]/div/div/div/div/div/div[2]/table/tbody/tr[2]/td[7]/div/span")).click();   //click on three dots
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div[3]/div[2]")).click();                      // click on delete button 
		WebElement delete=driver.findElement(By.className("ant-modal-content"));                                             // switch to modal form 
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div[1]/div/div[2]/div/span[1]")).click();               //click on yes button
		
		Thread.sleep(10000);
		
		
	
	}
	
	
	
	
public static void deletecustomerUser() throws InterruptedException {
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/div[2]/div[7]/span/div")).click();   //click on user management module
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div[2]/div[2]")).click();  // Click on customer module 
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div[3]/div/div/div/div/div/div[2]/table/tbody/tr[2]/td[8]")).click();// click on three dots under action 
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div[3]/div[2]/span")).click();// click on delete
		
		WebElement delete=driver.findElement(By.className("ant-modal-content"));  // switch to modal form 
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div[1]/div/div[2]/div/span[1]")).click();  //click on yes button


		Thread.sleep(10000);
		
	
	}

public static void deleteServicePartnerUser() throws InterruptedException {
	
	driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/div[2]/div[7]/span/div")).click();   //click on user management module
	driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div[2]/div[3]")).click();         // Click on service partner module 
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div[3]/div/div/div/div/div/div[2]/table/tbody/tr[2]/td[9]/div/span")).click();// click on three dots under action 
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div[3]/div[2]/span")).click();       // click on delete
	
	WebElement delete=driver.findElement(By.className("ant-modal-content"));                                  // switch to modal form 
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div[1]/div/div[2]/div/span[1]")).click();     //click on yes button

	Thread.sleep(5000);
	



	
}



}
