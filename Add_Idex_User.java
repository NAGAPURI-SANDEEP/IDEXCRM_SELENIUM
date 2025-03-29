package Executables;

import java.io.IOException;

import org.testng.annotations.Test;

import PAGES.Add_User_Pg;
import UTILS.Base_Class;

public class Add_Idex_User extends Add_User_Pg {

	@Test
	public static void addIdexuser() throws IOException, InterruptedException {

		Base_Class.UserLogin();
		Add_User_Pg.addIdexUser();

	}
}
