package Executables;

import org.testng.annotations.Test;

import PAGES.Delete_User_Pg;

public class Delete_customer_User extends Delete_User_Pg
{
	@Test
	public static void deleteCustomer() throws InterruptedException {
		
		Delete_User_Pg.deletecustomerUser();
	}

}
