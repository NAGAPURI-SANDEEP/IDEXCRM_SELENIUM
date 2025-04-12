package Grouping_Demo;

import org.testng.annotations.Test;

public class Add_ticket {
	
	@Test(priority = 1, groups = {"ticket"})
	public static void AddServiceTicket() {
		
		System.out.println("User should be able to add the ticket ");
		
	
		
	}
	
	@Test(priority = 2,groups = {"ticket"})
	public static void deleteServiceTicket() {
		
		System.out.println("User should be able to delete the service ticket ");
		
	
		
	}
	
	
	
	@Test(priority = 3,groups = {"ticket"})
	public static void editserviceticket() {
		
		System.out.println("User should be able to edit the service Ticket ");
		
	
		
	}

}
