package Executables;

import org.testng.annotations.Test;

import PAGES.Delete_User_Pg;

public class Delete_Users extends Delete_User_Pg {

	@Test(priority = 3)

	public static void delete_IdexUser() throws InterruptedException {

		Delete_User_Pg.deleteIdexUser();
	}

	@Test(priority = 2)
	public static void deleteCustomer() throws InterruptedException {

		Delete_User_Pg.deletecustomerUser();

	}

	@Test(priority = 1)

	public static void deleteservicePartner() throws InterruptedException {

		Delete_User_Pg.deleteServicePartnerUser();

	}

}