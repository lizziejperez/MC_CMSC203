import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MovieTicketManagerSTUDENT_Test {
	private MovieTicketManager ticketList;
	

	@Before
	public void setUp() throws Exception {
		ticketList = new MovieTicketManager();
		
		//Student add adult tickets
		ticketList.addTicket("Movie One", "PG13", 5,20,"NONE","Adult",0);
		ticketList.addTicket("Movie Two", "R", 3,13,"IMAX","Adult",0);
		ticketList.addTicket("Movie Three", "NR", 4,15,"3D","Adult",0);
		
		//Student add children tickets
		ticketList.addTicket("Movie Four", "G", 4,20,"NONE","Child",0);
		ticketList.addTicket("Movie Five", "PG", 1,13,"IMAX","Child",0);
		ticketList.addTicket("Movie Four", "G", 2,15,"3D","Child",0);
		
		//Student add employee tickets
		ticketList.addTicket("Movie One", "PG13", 4,20,"NONE","Employee",12345);
		ticketList.addTicket("Movie Two", "R", 1,13,"IMAX","Employee",23456);
		ticketList.addTicket("Movie Three", "NR", 2,15,"3D","Employee",45678);

		//Student add MoviePass member tickets
		ticketList.addTicket("Movie One", "PG13", 4,20,"NONE","MoviePass",22222);
		ticketList.addTicket("Movie Two", "R", 3,14,"IMAX","MoviePass",55555);
		ticketList.addTicket("Movie Three", "NR", 1,12,"3D","MoviePass",33333);

	}

	@After
	public void tearDown() throws Exception {
		//Student set ticketList to null;
	}

	/**
	 * Student Test the number of visits to the theater within the month
	 * This only applied to those who have id members - Employees or MoviePass members
	 */
	@Test
	public void testNumVisits() {
		//Student test Employees' number of visits
		assertEquals(1,ticketList.numVisits(12345));
		ticketList.addTicket("Movie Two", "R", 5,20,"NONE","Employee",12345);
		assertEquals(2,ticketList.numVisits(12345));
		ticketList.addTicket("Movie Three", "NR", 8,18,"NONE","Employee",12345);
		assertEquals(3,ticketList.numVisits(12345));
	
		//Student test MoviePass members' number of visits
		assertEquals(1,ticketList.numVisits(22222));
		ticketList.addTicket("Movie Two", "R", 5,12,"NONE","MoviePass",22222);
		assertEquals(2,ticketList.numVisits(22222));
		ticketList.addTicket("Movie Three", "NR", 3,11,"NONE","MoviePass",22222);
		assertEquals(3,ticketList.numVisits(22222));
	
	}

	/**
	 * Student Test the number of times this movie has been viewed
	 * This only applied to those who have id numbers - Employees or MoviePass members
	 */
	@Test
	public void testNumThisMovie() {
		//Student test Employees' number of views
		assertEquals(1,ticketList.numThisMovie(12345,"Movie One"));
		ticketList.addTicket("Movie Two", "R", 6,20,"NONE","Employee",12345);
		assertEquals(1,ticketList.numThisMovie(12345,"Movie Two"));
		ticketList.addTicket("Movie Two", "R", 10,19,"NONE","Employee",12345);
		assertEquals(2,ticketList.numThisMovie(12345,"Movie Two"));

		//Student test MoviePass members' number of views
		assertEquals(1,ticketList.numThisMovie(33333,"Movie Three"));
		ticketList.addTicket("Movie Two", "R", 5,13,"NONE","MoviePass",33333);
		assertEquals(1,ticketList.numThisMovie(33333,"Movie Two"));
		ticketList.addTicket("Movie Two", "R", 5,15,"NONE","MoviePass",33333);
		assertEquals(2,ticketList.numThisMovie(33333,"Movie Two"));
		
	}

}