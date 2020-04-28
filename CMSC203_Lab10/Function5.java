/**
 * Function #5
 * @author Elizabeth Perez
 *
 */
public class Function5 extends Function{
	/**
	 * Calculates the value f(x) of the function at x
	 * @param x - The x value at which the function will be evaluated
	 * @return a double - The value of the function at x
	 */
	@Override
	public double fnValue(double x) {
		if (x==0.0) 
			return Math.sin(Double.MAX_VALUE);
		else 
			return Math.sin(1/x);
	}
	
	/**
	 * @return a String - The function
	 */
	public String toString() {
		return "sin(1/x)";
	}
}
