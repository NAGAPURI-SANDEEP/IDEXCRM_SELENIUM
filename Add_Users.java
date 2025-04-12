package Grouping_Demo;

import org.testng.annotations.Test;

public class Add_Users {
	
	@Test(priority = 1,groups = {"user"})

	public static void addIdex() {
		
		System.out.println("Add the Idex user ");
		
	
		
	}
	
	@Test(priority = 2,groups = {"user"})

	public static void addCustoemr() {
		
		System.out.println("User should be logged in");
		
	
		
	}
	
	@Test(priority = 3, groups = {"user"})

	public static void addServicePartner() {
		
		System.out.println("User should be logged in");
		
	
		
	}

}
