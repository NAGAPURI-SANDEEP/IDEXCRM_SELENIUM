package Grouping_Demo;

import org.testng.annotations.Test;

public class Open_and_close_App {

	
	@Test(priority = 1,groups = {"user","ticket","openapp"})

	public static void Openapp() {
		
		System.out.println("User should open the application ");
		
	
		
	}
	
	@Test(priority = 2,groups = {"user","ticket","openapp"})

	public static void login() {
		
		System.out.println("User should be logged in");
		
	
		
	}
	
	@Test(priority = 3,groups = {"user","ticket","openapp"})

	public static void search() {
		
		System.out.println("User should ablr to search for the customer");
		
	
		
	}
	
	@Test(priority = 4,groups = {"user","ticket","openapp"})

	public static void Logout() {
		
		System.out.println("User should be logged out from the application ");
		
	
		
	}
}
