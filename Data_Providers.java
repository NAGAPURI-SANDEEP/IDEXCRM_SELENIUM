package UTILS;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Providers {

	static WebDriver driver;

	@BeforeClass
	public static void openapp() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		//driver.get("https://idexcrmdev.azureedge.net/login");

	}

	@Test(dataProvider="data_provider")
	public static void login(String email, String password) throws IOException, InterruptedException {
		// Opening application with the url
		driver.get("https://idexcrmdev.azureedge.net/login");

		driver.findElement(By.id("login_emailId")).sendKeys(email); // User email id
		driver.findElement(By.id("login_password")).sendKeys(password); // User Password
		driver.findElement(By.xpath("//button[@type='submit']")).click(); // click on sign in
		

		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/*[name()='svg'][1]")).click();

		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[2]/div[1]")).click();
		
		Thread.sleep(2000);
		


	}


	
	@DataProvider(name="data_provider", indices= {0,1,4})
	public static String[][] Multiple_Login()
	{
		String data[][]= {
				{"mayank.mod@webanix.in","123456789"},
				{"nagapurisandeep1996@gmail.com","Admin@123"},
				{"mayank.mod@.in","1234567"},
				{"mayank.mod@webani.in","123456789"},
				{"knpl@yopmail.com","Admin@123"}
				
				};
		
		return data;
		
	}
	

}
