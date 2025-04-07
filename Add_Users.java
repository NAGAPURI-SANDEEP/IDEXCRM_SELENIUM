package Executables;

import java.io.IOException;

import org.testng.annotations.Test;

import PAGES.Add_User_Pg;
import UTILS.Base_Class;

public class Add_Users extends Base_Class {

	@Test(priority =2 )
	public static void addCustomerUser() throws IOException, InterruptedException {
		 
		
		Add_User_Pg.addCustomerUser();
	}

	@Test(priority = 3)
	public static void addServicePartner() throws IOException, InterruptedException {
	
		
		Add_User_Pg.addServicePartnerUser();
	}

	@Test(priority = 1)
	public static void addIdexuser() throws IOException, InterruptedException {
	
		
	
		Add_User_Pg.addIdexUser();
	
	}
	
	

}
