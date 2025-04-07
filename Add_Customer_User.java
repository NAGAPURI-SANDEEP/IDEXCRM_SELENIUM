package Executables;

import java.io.IOException;

import org.testng.annotations.Test;

import PAGES.Add_User_Pg;
import UTILS.Base_Class;

public class Add_Customer_User extends Base_Class {
	
	
@Test
public static void addCustomerUser() throws IOException, InterruptedException {
	 

	Add_User_Pg.addCustomerUser();
}

}
