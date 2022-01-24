import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TwoDimRaggedArrayUtilitySTUDENT_Test {
	//STUDENT fill in dataSetSTUDENT with values, it must be a ragged array
	private double[][] dataSetSTUDENT = {{4,3,1},{1,5,2,3},{2,1},{3,2,1}};
	
	private File inputFile,outputFile;

	@Before
	public void setUp() throws Exception {
		outputFile = new File("TestOut.txt");
	}

	@After
	public void tearDown() throws Exception {
		dataSetSTUDENT = null;
		inputFile = outputFile = null;
	}

	/**
	 * Student Test getTotal method
	 * Return the total of all the elements in the two dimensional array
	 */
	@Test
	public void testGetTotal() {
		double total = TwoDimRaggedArrayUtility.getTotal(dataSetSTUDENT);
		assertEquals(28.0,total,.001);
	}

	/**
	 * Student Test getAverage method
	 * Return the average of all the elements in the two dimensional array
	 */
	@Test
	public void testGetAverage() {
		double average = TwoDimRaggedArrayUtility.getAverage(dataSetSTUDENT);
		assertEquals(2.333,average,.001);
	}

	/**
	 * Student Test getRowTotal method
	 * Return the total of all the elements of the row.
	 * Row 0 refers to the first row in the two dimensional array
	 */
	@Test
	public void testGetRowTotal() {
		double row0 = TwoDimRaggedArrayUtility.getRowTotal(dataSetSTUDENT, 0);
		assertEquals(8.0,row0,.001);
		double row1 = TwoDimRaggedArrayUtility.getRowTotal(dataSetSTUDENT, 1);
		assertEquals(11.0,row1,.001);
		double row2 = TwoDimRaggedArrayUtility.getRowTotal(dataSetSTUDENT, 2);
		assertEquals(3.0,row2,.001);
		double row3 = TwoDimRaggedArrayUtility.getRowTotal(dataSetSTUDENT, 3);
		assertEquals(6.0,row3,.001);
	}


	/**
	 * Student Test getColumnTotal method
	 * Return the total of all the elements in the column. If a row in the two dimensional array
	 * doesn't have this column index, it is not an error, it doesn't participate in this method.
	 * Column 0 refers to the first column in the two dimensional array
	 */
	@Test
	public void testGetColumnTotal() {
		double col0 = TwoDimRaggedArrayUtility.getColumnTotal(dataSetSTUDENT, 0);
		assertEquals(10.0,col0,.001);
		double col1 = TwoDimRaggedArrayUtility.getColumnTotal(dataSetSTUDENT, 1);
		assertEquals(11.0,col1,.001);
		double col2 = TwoDimRaggedArrayUtility.getColumnTotal(dataSetSTUDENT, 2);
		assertEquals(4.0,col2,.001);
		double col3 = TwoDimRaggedArrayUtility.getColumnTotal(dataSetSTUDENT, 3);
		assertEquals(3.0,col3,.001);
	}


	/**
	 * Student Test getHighestInArray method
	 * Return the largest of all the elements in the two dimensional array.
	 */
	@Test
	public void testGetHighestInArray() {
		double highest = TwoDimRaggedArrayUtility.getHighestInArray(dataSetSTUDENT);
		assertEquals(5.0,highest,.001);	
	}
	

	/**
	 * Test the writeToFile method
	 * write the array to the outputFile File
	 * then read it back to make sure formatted correctly to read
	 * @throws FileNotFoundException 
	 * 
	 */
	@Test
	public void testWriteToFile() throws FileNotFoundException {
		TwoDimRaggedArrayUtility.writeToFile(dataSetSTUDENT, outputFile);
		double[][] array= TwoDimRaggedArrayUtility.readFile(outputFile);
		assertEquals(dataSetSTUDENT[0][0], array[0][0], .001);
		assertEquals(dataSetSTUDENT[0][1], array[0][1], .001);
		assertEquals(dataSetSTUDENT[0][2], array[0][2], .001);
		
		assertEquals(dataSetSTUDENT[1][0], array[1][0], .001);
		assertEquals(dataSetSTUDENT[1][1], array[1][1], .001);
		assertEquals(dataSetSTUDENT[1][2], array[1][2], .001);
		assertEquals(dataSetSTUDENT[1][3], array[1][3], .001);
		
		assertEquals(dataSetSTUDENT[2][0], array[2][0], .001);
		assertEquals(dataSetSTUDENT[2][1], array[2][1], .001);
		
		assertEquals(dataSetSTUDENT[3][0], array[3][0], .001);
		assertEquals(dataSetSTUDENT[3][1], array[3][1], .001);
		assertEquals(dataSetSTUDENT[3][2], array[3][2], .001);
	}
	
	// added tests
	
	/**
	 * Test getHighestInRow method
	 */
	@Test
	public void testGetHighestInRow() {
		double h1 = TwoDimRaggedArrayUtility.getHighestInRow(dataSetSTUDENT, 0);
		assertEquals(4.0,h1,.001);
		double h2 = TwoDimRaggedArrayUtility.getHighestInRow(dataSetSTUDENT, 1);
		assertEquals(5.0,h2,.001);
		double h3 = TwoDimRaggedArrayUtility.getHighestInRow(dataSetSTUDENT, 2);
		assertEquals(2.0,h3,.001);
		double h4 = TwoDimRaggedArrayUtility.getHighestInRow(dataSetSTUDENT, 3);
		assertEquals(3.0,h4,.001);
	}
	
	/**
	 * Test getLowestInRow method
	 */
	@Test
	public void testGetLowestInRow() {
		double l1 = TwoDimRaggedArrayUtility.getLowestInRow(dataSetSTUDENT, 0);
		assertEquals(1.0,l1,.001);
		double l2 = TwoDimRaggedArrayUtility.getLowestInRow(dataSetSTUDENT, 1);
		assertEquals(1.0,l2,.001);
		double l3 = TwoDimRaggedArrayUtility.getLowestInRow(dataSetSTUDENT, 2);
		assertEquals(1.0,l3,.001);
		double l4 = TwoDimRaggedArrayUtility.getLowestInRow(dataSetSTUDENT, 3);
		assertEquals(1.0,l4,.001);
	}
	
	/**
	 * Test getHighestInColumn method
	 */
	@Test
	public void testGetHighestInColumn() {
		double h1 = TwoDimRaggedArrayUtility.getHighestInColumn(dataSetSTUDENT, 0);
		assertEquals(4.0,h1,.001);
		double h2 = TwoDimRaggedArrayUtility.getHighestInColumn(dataSetSTUDENT, 1);
		assertEquals(5.0,h2,.001);
		double h3 = TwoDimRaggedArrayUtility.getHighestInColumn(dataSetSTUDENT, 2);
		assertEquals(2.0,h3,.001);
		double h4 = TwoDimRaggedArrayUtility.getHighestInColumn(dataSetSTUDENT, 3);
		assertEquals(3.0,h4,.001);
	}
	
	/**
	 * Test getLowestInColumn method
	 */
	@Test
	public void testLowestInColumn() {
		double l1 = TwoDimRaggedArrayUtility.getLowestInColumn(dataSetSTUDENT, 0);
		assertEquals(1.0,l1,.001);
		double l2 = TwoDimRaggedArrayUtility.getLowestInColumn(dataSetSTUDENT, 1);
		assertEquals(1.0,l2,.001);
		double l3 = TwoDimRaggedArrayUtility.getLowestInColumn(dataSetSTUDENT, 2);
		assertEquals(1.0,l3,.001);
		double l4 = TwoDimRaggedArrayUtility.getLowestInColumn(dataSetSTUDENT, 3);
		assertEquals(3.0,l4,.001);
	}
	
	/**
	 * Test getLowestInArray method
	 */
	@Test
	public void testLowestInArray() {
		double lowest = TwoDimRaggedArrayUtility.getLowestInArray(dataSetSTUDENT);
		assertEquals(1.0,lowest,.001);	
	}
	
	/**
	 * Test getHighestInColumn method
	 */
	@Test
	public void testHighestInColumnIndex() {
		int in1 = TwoDimRaggedArrayUtility.getHighestInColumnIndex(dataSetSTUDENT, 0);
		assertEquals(0,in1);
		int in2 = TwoDimRaggedArrayUtility.getHighestInColumnIndex(dataSetSTUDENT, 1);
		assertEquals(1,in2);
		int in3 = TwoDimRaggedArrayUtility.getHighestInColumnIndex(dataSetSTUDENT, 2);
		assertEquals(1,in3);
		int in4 = TwoDimRaggedArrayUtility.getHighestInColumnIndex(dataSetSTUDENT, 3);
		assertEquals(1,in4);
	}
	
	/**
	 * Test getLowestInColumnIndex method
	 */
	@Test
	public void testLowestInColumnIndex() {
		int in1 = TwoDimRaggedArrayUtility.getLowestInColumnIndex(dataSetSTUDENT, 0);
		assertEquals(1,in1);
		int in2 = TwoDimRaggedArrayUtility.getLowestInColumnIndex(dataSetSTUDENT, 1);
		assertEquals(2,in2);
		int in3 = TwoDimRaggedArrayUtility.getLowestInColumnIndex(dataSetSTUDENT, 2);
		assertEquals(0,in3);
		int in4 = TwoDimRaggedArrayUtility.getLowestInColumnIndex(dataSetSTUDENT, 3);
		assertEquals(1,in4);
	}
}