package UTILS;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Base_Class {
	
	public static WebDriver driver;

	public static void UserLogin() throws IOException, InterruptedException {
		
		//location of the properties file
		FileInputStream filepath = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\configure.properties");
		
		
		//loading properties file
		Properties pfile = new Properties();
		pfile.load(filepath);
		
		//Reading data from the properties file
		String APP_URL = pfile.getProperty("appurl");
		String USER_EMAIL=pfile.getProperty("email");
		String USER_PASSWORD=pfile.getProperty("password");
		
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.get(APP_URL); //Opening application with the url 
		driver.findElement(By.id("login_emailId")).sendKeys(USER_EMAIL); //User email id 
		driver.findElement(By.id("login_password")).sendKeys(USER_PASSWORD);  //User Password 
		driver.findElement(By.xpath("//button[@type='submit']")).click();   //click on sign in
		
	
				
				
				
				
				
				
				
				
				
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
