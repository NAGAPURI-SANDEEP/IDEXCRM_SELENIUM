package UTILS;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;


public class Base_Class {
	
	public static WebDriver driver;

	@BeforeMethod
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
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.get(APP_URL);                                                                //Opening application with the url 
		driver.findElement(By.id("login_emailId")).sendKeys(USER_EMAIL);                     //User email id 
		driver.findElement(By.id("login_password")).sendKeys(USER_PASSWORD);                 //User Password 
		driver.findElement(By.xpath("//button[@type='submit']")).click();                    //click on sign in
		
	
							
				
	}
	
	@AfterMethod
	
	public static void logout() throws InterruptedException {
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/*[name()='svg'][1]")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[2]/div[1]")).click();
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
}
