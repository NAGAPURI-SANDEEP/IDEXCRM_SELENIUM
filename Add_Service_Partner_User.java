package Executables;

import java.io.IOException;

import org.testng.annotations.Test;

import PAGES.User_Management_Pg;
import UTILS.Base_Class;


public class Add_Service_Partner_User extends User_Management_Pg
{
	
	@Test
	public static void addServicePartner() throws IOException, InterruptedException {
		Base_Class.UserLogin();
		User_Management_Pg.addServicePartnerUser();
	}
	
	

}
