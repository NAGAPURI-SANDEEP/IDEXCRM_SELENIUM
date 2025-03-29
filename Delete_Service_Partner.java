package Executables;

import org.testng.annotations.Test;

import PAGES.Delete_User_Pg;

public class Delete_Service_Partner extends Delete_User_Pg {
	
	@Test
	
	public static void deleteservicePartner() throws InterruptedException {
		
		Delete_User_Pg.deleteServicePartnerUser();
		
	}

}
