/**
 * This class calculates holiday bonuses
 * @author Elizabeth Perez
 */
public class HolidayBonus {
	/**
	 * calculates the bonus for each store and organizes them in an array
	 * @param data
	 * @param high
	 * @param low
	 * @param other
	 * @return bonuses
	 */
	public static double[] calculateHolidayBonus(double[][] data, double high, double low, double other) {
		double[] bonuses = new double[data.length];
		for(int j = 0; j < data.length; j++) {
			bonuses[j] = 0;
			for(int k = 0; k < data[j].length; k++) {
				// if there is only one data value in a column, it gets the low bonus
				if(TwoDimRaggedArrayUtility.getLowestInColumnIndex(data, k) == j) {
					bonuses[j] += low;
				} else if (TwoDimRaggedArrayUtility.getHighestInColumnIndex(data, k) == j) {
					bonuses[j] += high;
				} else {
					bonuses[j] += other;
				}
			}
		}
		return bonuses;
	}
	
	/**
	 * calculates the total amount of bonuses for the stores
	 * @param data
	 * @param high
	 * @param low
	 * @param other
	 * @return total
	 */
	public static double calculateTotalHolidayBonus(double[][] data, double high, double low, double other) {
		double total = 0;
		double[] bonuses = calculateHolidayBonus(data, high, low, other);
		for(int j = 0; j < bonuses.length; j++) {
			total += bonuses[j];
		}
		return total;
	}
}
