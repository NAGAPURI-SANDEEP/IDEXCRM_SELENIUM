package parallel_Testing_with_XMl;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parallel_Testing {
	
	WebDriver driver; 
	
	
	
	@BeforeClass
	@Parameters({"browser","url"})
	
	void setup(String browser, String url) {
		
		switch (browser.toLowerCase()) {
		case "chrome":driver =  new ChromeDriver();break;
		case "edge":driver =  new EdgeDriver();break;
		case "firefox":driver =  new FirefoxDriver();break;

		default:System.out.println("Invalid Browser");return;
			
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get(url);
		
	}
	
	
	@Test(priority = 1)
	void testlogo() {
		
		boolean status = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[1]/img")).isDisplayed();
		Assert.assertTrue(true);
		
		
		
	}
	
	@Test(priority = 2)

	void testTitle() {
		Assert.assertEquals(driver.getTitle(),"OrangeHRM");
	}
	
	
	
	@Test(priority = 3)

	void testurl() {
		Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	
	void teardown() {
		driver.close();
	}
}
