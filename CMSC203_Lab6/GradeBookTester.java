import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/**
 * Tests the GradeBook class
 * @author Elizabeth Perez
 *
 */
class GradeBookTester {
	private GradeBook tester1 = new GradeBook(5);
	private GradeBook tester2 = new GradeBook(5);
	@BeforeEach
	void setUp() throws Exception {
		tester1.addScore(10.0);
		tester1.addScore(20.0);
		tester1.addScore(30.0);
		tester1.addScore(40.0);
		tester1.addScore(50.0);
		
		tester2.addScore(100.0);
		tester2.addScore(25.0);
		tester2.addScore(75.0);
	}

	@AfterEach
	void tearDown() throws Exception {
		tester1 = null;
		tester2 = null;
	}

	@Test
	void testAddScore() {
		assertTrue(tester1.toString().equals("10.0 20.0 30.0 40.0 50.0 "));
		assertTrue(tester2.toString().equals("100.0 25.0 75.0 "));
		assertEquals(5, tester1.getScoreSize());
		assertEquals(3, tester2.getScoreSize());
	}
	
	@Test
	void testSum() {
		assertEquals(150.0, tester1.sum());
		assertEquals(200.0, tester2.sum());
	}
	
	@Test
	void testMinimum() {
		assertEquals(10.0, tester1.minimum());
		assertEquals(25.0, tester2.minimum());
	}
	
	@Test
	void testFinalScore() {
		assertEquals(140.0, tester1.finalScore());
		assertEquals(175.0, tester2.finalScore());
	}
}
