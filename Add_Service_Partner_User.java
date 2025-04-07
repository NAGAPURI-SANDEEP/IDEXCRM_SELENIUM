package Executables;

import java.io.IOException;

import org.testng.annotations.Test;

import PAGES.Add_User_Pg;
import UTILS.Base_Class;


public class Add_Service_Partner_User extends Add_User_Pg
{
	
	@Test
	public static void addServicePartner() throws IOException, InterruptedException {
		
		Add_User_Pg.addServicePartnerUser();
	}
	
	

}
