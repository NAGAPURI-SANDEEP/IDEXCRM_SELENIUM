package UTILS;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependency_methods {
	
	
	@Test(priority = 1)
	public static void openapp() {
		System.out.println("this is open app");
		
		Assert.assertEquals(123, "sdad");
		
	}
	
	
	@Test(priority = 2, dependsOnMethods = {"openapp"})
	public static void login() {
		System.out.println("this login  ");
		Assert.assertEquals(123, "sdad");

	}
	
	
	
	@Test(priority = 3,dependsOnMethods = {"login"})
	public static void search () {
		Assert.assertEquals(123, "sdad");

		System.out.println("this is to search in the application");
	}
	
	
	
	@Test(priority = 4,dependsOnMethods = {"login", "search"})
	public static void Advance_search() {
		System.out.println("this is advance search");
	}
	
	
	
	@Test(priority = 5,dependsOnMethods = {"login"})
	public static void logout() {
		System.out.println("this is logout");
	}

}
