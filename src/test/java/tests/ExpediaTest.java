package tests;

import org.junit.Test;

import app.Endpoints;

public class ExpediaTest extends BaseTest{

	public ExpediaTest() {
		super(Endpoints.expedia, "chrome");
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void hotelReservation() 
	{
		page.ExpediaPage ob = new page.ExpediaPage(getDriver());
		ob.hotelReservation();
	}

}
