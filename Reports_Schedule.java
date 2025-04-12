package PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import UTILS.Base_Class;

public class Reports_Schedule extends Base_Class{
	
	
	@Test
	public static void scheduleReports() throws InterruptedException {
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/div[2]/div[5]/span/div")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div[1]/div[2]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div/div[1]/button")).click();

		
		
	}

}
