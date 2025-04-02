package Executables;

import java.io.IOException;

import org.testng.annotations.Test;

import PAGES.Add_User_From_Excelfile;

public class Add_Idex_from_Excelfile extends Add_User_From_Excelfile{
	
	@Test
	public static void Add_Idex() throws IOException, InterruptedException {
		
		
		Add_User_From_Excelfile.addIdexUser();
	}

}
