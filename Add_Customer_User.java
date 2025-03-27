package Executables;

import java.io.IOException;

import org.testng.annotations.Test;

import PAGES.User_Management_Pg;
import UTILS.Base_Class;

public class Add_Customer_User {
	
	
@Test
public static void addCustomerUser() throws IOException, InterruptedException {
	 
	Base_Class.UserLogin();
	User_Management_Pg.addCustomerUser();
}

}
