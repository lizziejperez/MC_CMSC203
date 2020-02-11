/*
 * WindChill Assignment: Prints the calculated wind chill based on user input for temperature and wind speed
 * Author: Elizabeth Perez
 */
import java.util.Scanner;

public class WindChill {

	public static void main(String[] args) {
		final double X = 35.74;
		final double Y = 0.6215;
		final double Z = 0.4275;
		final double A = 35.75;
		
		double temp = 0.0; // Temperature in Fahrenheit
		double windSpeed = 0.0; // Speed in MPH
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the temperature in Fahrenheit (-45.0 to 40.0): ");
		temp = input.nextDouble(); // gets user input for temp
		
		if(temp >= -45.0 && temp <= 40.0) { // checks if input fits parameters
			System.out.println("The value entered has been accepted.");
			
			System.out.println("Enter the speed of the wind in MPH (5.0 to 60.0): ");
			windSpeed = input.nextDouble(); // gets user input for windSpeed
			
			if(windSpeed >= 5.0 && windSpeed <= 60.0) { // checks if input fits parameters
				System.out.println("The value entered has been accepted.");
				
				// calculates wind chill
				double part1 = Math.pow(windSpeed, 0.16);
				double part2 = X + (Y * temp) + (Z * temp * part1);
				double windChill = part2 - (part1 * A);
				
				System.out.println("Wind chill: " + windChill + " degrees Fahrengeit"); // prints the wind chill
			} else {
				System.out.println("The value entered is not accepted.");
			}
		} else {
			System.out.println("The value entered is not accepted.");
		}
		
		input.close();
	}

}
