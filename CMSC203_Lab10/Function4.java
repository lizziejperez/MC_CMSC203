/**
 * Function #4
 * @author Elizabeth Perez
 *
 */
public class Function4 extends Function{
	/**
	 * Calculates the value f(x) of the function at x
	 * @param x - The x value at which the function will be evaluated
	 * @return a double - The value of the function at x
	 */
	@Override
	public double fnValue(double x) {
		return (Math.pow(x,3) - (7*Math.pow(x,2)) + 15*x - 9);
	}
	
	/**
	 * @return a String - The function
	 */
	public String toString () {
		return "x^3 - 7*x^2 + 15*x - 9";
	}
}
