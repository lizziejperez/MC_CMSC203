import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MoviePassTest {
	MoviePass m1,m2,m3,m4,m5,m6;

	@Before
	public void setUp() throws Exception {
		// first movie
		m1 = new MoviePass("Movie One", "PG13", 3,18,"NONE",12345,0,0,0);
		// only movie of day, not seen before, not imax or 3d
		m2 = new MoviePass("Movie Two", "R", 4,10,"NONE",23456,1,0,0);
		// not only movie of day
		m3 = new MoviePass("Movie Three", "NR", 5,19,"NONE",34567,1,0,1);
		// has seen before
		m4 = new MoviePass("Movie One", "PG13", 2,12,"NONE",45678,2,1,0);
		// is imax
		m5 = new MoviePass("Movie Two", "R", 4,20,"IMAX",56789,1,0,0);
		// is 3d
		m6 = new MoviePass("Movie Three", "NR", 1,15,"3D",67890,1,0,0);
	}

	@After
	public void tearDown() throws Exception {
		m1=m2=m3=m4=m5=m6=null;
	}

	@Test
	public void test() {
		assertEquals(9.99,m1.calculateTicketPrice(),.01);
		assertEquals(0.0,m2.calculateTicketPrice(),.01);
		assertEquals(14.8,m3.calculateTicketPrice(),.01);
		assertEquals(11.51,m4.calculateTicketPrice(),.01);
		assertEquals(18.08,m5.calculateTicketPrice(),.01);
		assertEquals(14.25,m6.calculateTicketPrice(),.01);
	}

}
