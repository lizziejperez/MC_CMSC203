import java.util.Scanner;

public class SphereVolume {

	public static void main(String[] args) {
		System.out.println("Program Purpose: To calculate the volume of a sphere.");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the diameter of the sphere: ");
		double diam = input.nextDouble();
		input.close();
		double radius = diam/2;
		double volume = (4.0/3.0)*Math.PI*(Math.pow(radius, 3));
		System.out.println("Volume is " + volume);
	}

}
