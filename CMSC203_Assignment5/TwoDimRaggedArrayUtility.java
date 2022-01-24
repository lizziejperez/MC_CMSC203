/**
 * This class deals with ragged arrays
 * @author Elizabeth Perez
 */
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDimRaggedArrayUtility {
	/**
	 * gets a file and puts the data into a ragged array
	 * @param file
	 * @return data
	 * @throws FileNotFoundException
	 */
	public static double[][] readFile(java.io.File file) throws FileNotFoundException {
		Scanner input = new Scanner(file);
		int rows = 0;
		
		while(input.hasNextLine()) {
			rows++;
			input.nextLine();
		}
		input.close();
		
		double[][] data = new double[rows][];
		Scanner input2 = new Scanner(file);
		
		for(int j = 0; j < data.length; j++) {
			String line = input2.nextLine();
			String[] separated = line.split(" ");
			data[j] = new double[separated.length];
			for(int k = 0; k < data[j].length; k++) {
				data[j][k] = Double.valueOf(separated[k]);
			}
		}
		input2.close();
		
		return data;
	}
	
	/**
	 * gets a ragged array and prints the data to a file
	 * @param data
	 * @param outputFile
	 * @throws FileNotFoundException
	 */
	public static void writeToFile(double[][] data, java.io.File outputFile) throws FileNotFoundException {
		PrintWriter writer = new PrintWriter(outputFile);
		for(int j = 0; j < data.length; j++) {
			for(int k = 0; k < data[j].length; k++) {
				writer.print(data[j][k]);
				writer.print(" ");
			}
			writer.print("\n");
		}
		writer.close();
	}
	
	/**
	 * calculates the total of all the values in a ragged array
	 * @param data
	 * @return total
	 */
	public static double getTotal(double[][] data) {
		double total = 0;
		for(int j = 0; j < data.length; j++) {
			for(int k = 0; k < data[j].length; k++) {
				total += data[j][k];
			}
		}
		return total;
	}
	
	/**
	 * calculated the average of the values in a ragged array
	 * @param data
	 * @return average
	 */
	public static double getAverage(double[][] data) {
		double count = 0;
		for(int j = 0; j < data.length; j++) {
			for(int k = 0; k < data[j].length; k++) {
				count++;
			}
		}
		double average = getTotal(data) / count;
		return average;
	}

	/**
	 * calculates the total of the values in a specified row of a ragged array
	 * @param data
	 * @param row
	 * @return total
	 */
	public static double getRowTotal(double[][] data, int row) {
		double total = 0;
		for(int j = 0; j < data[row].length; j++) {
			total += data[row][j];
		}
		return total;
	}

	/**
	 * calculates the total of the values in a specified column of a ragged array
	 * @param data
	 * @param col
	 * @return total
	 */
	public static double getColumnTotal(double[][] data, int col) {
		double total = 0;
		int row = 0;
		while(row < data.length) {
			if(data[row].length > col) {
				total += data[row][col];
			}
			row++;
		}
		return total;
	}

	/**
	 * finds the highest value in a specified row in a ragged array
	 * @param data
	 * @param row
	 * @return highest
	 */
	public static double getHighestInRow(double[][] data, int row) {
		double highest = data[row][0];
		for(int j = 1; j < data[row].length; j++) {
			if(data[row][j] > highest) {
				highest = data[row][j];
			}
		}
		return highest;
	}

	/**
	 * finds the lowest value in a specified row in a ragged array
	 * @param data
	 * @param row
	 * @return lowest
	 */
	public static double getLowestInRow(double[][] data, int row) {
		double lowest = data[row][0];
		for(int j = 1; j < data[row].length; j++) {
			if(data[row][j] < lowest) {
				lowest = data[row][j];
			}
		}
		return lowest;
	}

	/**
	 * finds the highest value in a specified column in a ragged array
	 * @param data
	 * @param col
	 * @return highest
	 */
	public static double getHighestInColumn(double[][] data, int col) {
		double highest = 0;
		int row = 0;
		while(highest == 0) {
			if(data[row].length > col) {
				highest = data[row][col];
			}
			row++;
		}
		while(row < data.length) {
			if(data[row].length > col) {
				if(data[row][col] > highest) {
					highest = data[row][col];
				}
			}
			row++;
		}
		return highest;
	}

	/**
	 * find the lowest value in a specified column in a ragged array
	 * @param data
	 * @param col
	 * @return lowest
	 */
	public static double getLowestInColumn(double[][] data, int col) {
		double lowest = 0;
		int row = 0;
		while(lowest == 0) {
			if(data[row].length > col) {
				lowest = data[row][col];
			}
			row++;
		}
		while(row < data.length) {
			if(data[row].length > col) {
				if(data[row][col] < lowest) {
					lowest = data[row][col];
				}
			}
			row++;
		}
		return lowest;
	}

	/**
	 * finds the highest value in a ragged array
	 * @param data
	 * @return highest
	 */
	public static double getHighestInArray(double[][] data) {
		double highest = data[0][0];
		for(int j = 0; j < data.length; j++) {
			for(int k = 0; k < data[j].length; k++) {
				if(data[j][k] > highest) {
					highest = data[j][k];
				}
			}
		}
		return highest;
	}

	/**
	 * finds the lowest value in a ragged array
	 * @param data
	 * @return lowest
	 */
	public static double getLowestInArray(double[][] data) {
		double lowest = data[0][0];
		for(int j = 0; j < data.length; j++) {
			for(int k = 0; k < data[j].length; k++) {
				if(data[j][k] < lowest) {
					lowest = data[j][k];
				}
			}
		}
		return lowest;
	}
	
	/**
	 * finds the row index of the highest value in a specified column in a ragged array
	 * @param data
	 * @param col
	 * @return index
	 */
	public static int getHighestInColumnIndex(double[][] data, int col) {
		int index = 0;
		double highest = 0;
		int row = 0;
		while(highest == 0) {
			if(data[row].length > col) {
				highest = data[row][col];
				index = row;
			}
			row++;
		}
		while(row < data.length) {
			if(data[row].length > col) {
				if(data[row][col] > highest) {
					highest = data[row][col];
					index = row;
				}
			}
			row++;
		}
		return index;
	}
	
	/**
	 * finds the row index of the lowest value in a specified column in a ragged array
	 * @param data
	 * @param col
	 * @return index
	 */
	public static int getLowestInColumnIndex(double[][] data, int col) {
		int index = 0;
		double lowest = 0;
		int row = 0;
		while(lowest == 0) {
			if(data[row].length > col) {
				lowest = data[row][col];
				index = row;
			}
			row++;
		}
		while(row < data.length) {
			if(data[row].length > col) {
				if(data[row][col] < lowest) {
					lowest = data[row][col];
					index = row;
				}
			}
			row++;
		}
		return index;
	}
}
