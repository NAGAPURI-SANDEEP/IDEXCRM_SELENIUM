package Executables;

import java.io.IOException;

import org.testng.annotations.Test;

import PAGES.Add_User_From_Excelfile;
import UTILS.Base_Class;

public class Add_Customer_From_Excelfile extends Base_Class {

	
	@Test
	public static void addCustomer() throws IOException, InterruptedException {
		
		Add_User_From_Excelfile.addCustomerUser();
	}
}
