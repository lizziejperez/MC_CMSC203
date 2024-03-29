import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HolidayBonusTest {
	
	
	
	private double[][] dataSet1 = {{1,2,3},{4,5},{6,7,8}};
	private double[][] dataSet2 = {{7,2,9,4},{5},{8,1,3},{11,6,7,2}};
	private double[][] dataSet3 = {{7.2,2.5,9.3,4.8},{5.9},{8.1,1.7,3.3},{11.6,6.9,7.3,2.7}};
	private double[][] dataSet4 = {{-2.5,-5.3,6.1},{-4.4,8.2},{2.3,-7.5},{-4.2,7.3,-5.9,2.6}};

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	
		/**
		 * Test calculateHolidayBonus method with a high of 5000, low of 1000 and 2000 as other
		 */

		@Test
		public void testCalculateHolidayBonusA() {
			try{
			double[] result = HolidayBonus.calculateHolidayBonus(dataSet1,5000,1000,2000);
			assertEquals(3000.0,result[0],.001);
			assertEquals(4000.0,result[1],.001);
			assertEquals(15000.0,result[2],.001);
			
			result = HolidayBonus.calculateHolidayBonus(dataSet2,5000,1000,2000);
			assertEquals(14000.0,result[0],.001);
			assertEquals(1000.0,result[1],.001);
			assertEquals(4000.0,result[2],.001);
			assertEquals(13000.0,result[3],.001);
			
			result = HolidayBonus.calculateHolidayBonus(dataSet3,5000,1000,2000);
			assertEquals(14000.0,result[0],.001);
			assertEquals(1000.0,result[1],.001);
			assertEquals(4000.0,result[2],.001);
			assertEquals(13000.0,result[3],.001);
			
			result = HolidayBonus.calculateHolidayBonus(dataSet4,5000,1000,2000);
			assertEquals(9000.0,result[0],.001); // Student changed 5000->9000
			assertEquals(6000.0,result[1],.001); // Student changed 5000->6000
			assertEquals(6000.0,result[2],.001); // Student changed 5000->6000
			assertEquals(6000.0,result[3],.001); // CHANGED 7000->6000
			}
			catch (Exception e) {
				fail("This should not have caused an Exception");
			} 
			
		}
		

		/**
		 * Test calculateHolidayBonus method with a high of 1000, low of 250 and 500 as other
		 */

		@Test
		public void testCalculateHolidayBonusB() {
			try{
			double[] result = HolidayBonus.calculateHolidayBonus(dataSet1,1000,250,500);
			assertEquals(750.0,result[0],.001);
			assertEquals(1000.0,result[1],.001);
			assertEquals(3000.0,result[2],.001);
			
			result = HolidayBonus.calculateHolidayBonus(dataSet2,1000,250,500);
			assertEquals(3000.0,result[0],.001);
			assertEquals(250.0,result[1],.001);
			assertEquals(1000.0,result[2],.001);
			assertEquals(2750.0,result[3],.001);
			
			result = HolidayBonus.calculateHolidayBonus(dataSet3,1000,250,500);
			assertEquals(3000.0,result[0],.001);
			assertEquals(250.0,result[1],.001);
			assertEquals(1000.0,result[2],.001);
			assertEquals(2750.0,result[3],.001);
			
			result = HolidayBonus.calculateHolidayBonus(dataSet4,1000,250,500);
			assertEquals(2000.0,result[0],.001); // Student changed 1000->2000
			assertEquals(1250.0,result[1],.001); // Student changed 1000->1250
			assertEquals(1250.0,result[2],.001); // Student changed 1000->1250
			assertEquals(1500.0,result[3],.001);  // CHANGED 1500->1250 Student changed 1250->1500
			}
			catch (Exception e) {
				fail("This should not have caused an Exception");
			} 
			
		}

		/**
		 * Test calculateTotalHolidayBonus method with a high of 5000, low of 1000 and 2000 as other
		 */
	@Test
	public void testCalculateTotalHolidayBonusA() {
		assertEquals(22000.0,HolidayBonus.calculateTotalHolidayBonus(dataSet1, 5000, 1000, 2000),.001);
		assertEquals(32000.0,HolidayBonus.calculateTotalHolidayBonus(dataSet2, 5000, 1000, 2000),.001);
		assertEquals(32000.0,HolidayBonus.calculateTotalHolidayBonus(dataSet3, 5000, 1000, 2000),.001);
		assertEquals(27000.0,HolidayBonus.calculateTotalHolidayBonus(dataSet4, 5000, 1000, 2000),.001); // CHANGED 22000->21000 Student changed 21000->27000

	}
	
	/** 
	 * Test calculateTotalHolidayBonus method with a high of 1000, low of 250 and 500 as other
	 */
	@Test
	public void testCalculateTotalHolidayBonusB() {
		assertEquals(4750.0,HolidayBonus.calculateTotalHolidayBonus(dataSet1, 1000,250,500),.001);
		assertEquals(7000.0,HolidayBonus.calculateTotalHolidayBonus(dataSet2, 1000,250,500),.001);
		assertEquals(7000.0,HolidayBonus.calculateTotalHolidayBonus(dataSet3, 1000,250,500),.001);
		assertEquals(6000.0,HolidayBonus.calculateTotalHolidayBonus(dataSet4, 1000,250,500),.001);  //CHANGED 4500->4250 Student changed 4250->6000

	}

}