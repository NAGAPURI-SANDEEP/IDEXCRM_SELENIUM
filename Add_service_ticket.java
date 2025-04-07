package Executables;



import java.io.IOException;

import org.testng.annotations.Test;

import PAGES.Add_Service_ticket_Pg;


@Test

public class Add_service_ticket extends Add_Service_ticket_Pg{
	
	public static void addticket() throws IOException, InterruptedException {
		
		Add_Service_ticket_Pg.Addticket();
	}

}
