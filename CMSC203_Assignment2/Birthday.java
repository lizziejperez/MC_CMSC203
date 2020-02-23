import java.text.DecimalFormat;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 * The class acts as a driver for the toy class
 * @author Elizabeth Perez
 * @version 1
 * 2/23/2020
 */
public class Birthday {

	public static void main(String[] args) {
		String childName;
		int childAge, orderNumber; 
		String response;
		boolean continue1 = true;
		boolean continue2 = true;
		double totalCost = 0.0;
		final String programmerName = "Elizabeth";
		
		DecimalFormat dc = new DecimalFormat("###.00");
		
		// Displays title on console
		System.out.println("Birthday Class");
		System.out.println();
		
		// Displays welcome text in dialog box
		JOptionPane.showMessageDialog(null, "Welcome to the Toy Company to choose gifts for young children");
		
		while(continue2) {
			childName = "";
			Toy toy = new Toy();
			
			while(continue1) {
					// Gets user input for childName
					childName = JOptionPane.showInputDialog("Enter the name of the child");
					
					// Gets user input for childAge
					childAge = Integer.parseInt(JOptionPane.showInputDialog("How old is the child?"));
					toy.setAge(childAge);
				do {
					// Gets user input for toy selection
					toy.setToy(JOptionPane.showInputDialog("Choose a toy: a plushie, blocks, or a book"));
					
					if(toy.getToy().equals("")) {
						JOptionPane.showMessageDialog(null, "Invalid choice. Please try again.");
					}
				} while(toy.getToy().equals(""));
				
				if(!toy.ageOK()) {
					// Asks user if they want to get a different toy
					response = JOptionPane.showInputDialog("Toy is not age-appropriate. "
							+ "Do you want to buy a different toy? yes or no ");
					if(!response.equalsIgnoreCase("yes")) {
						continue1 = false;
					}
				} else {
					JOptionPane.showMessageDialog(null, "Good choice!");
					continue1 = false;
				}
			}
			
			// Sets the cost of the toy request
			toy.setCost(toy.getToy());
			
			// Adds a card to cost if user additionally wants it
			toy.addCard(JOptionPane.showInputDialog("Do you want a card with the gift? Yes or No "));
			
			// Adds a balloon to cost if user additionally wants it
			toy.addBalloon(JOptionPane.showInputDialog("Do you want a balloon with the gift? Yes or No "));
			
			// adds toy cost to totalCost
			totalCost += toy.getCost();
			
			// Display childName, childAge, toy, and cost in console
			System.out.println("Child Name: " + childName);
			System.out.println("Child Age: " + toy.getAge());
			System.out.println("Cost: $" + dc.format(toy.getCost()));
			System.out.println();
			
			// Display childName, childAge, toy, and cost in dialog box
			JOptionPane.showMessageDialog(null, "The gift for " + childName + " at " + toy.getAge() + " years old is a "
					+ toy.getToy() + " for $" + dc.format(toy.getCost()));
			
			// Ask user if they want another toy
			response = JOptionPane.showInputDialog("Do you want another toy? yes or no ");
			continue1 = true;
			if(!response.equalsIgnoreCase("yes")) {
				continue2 = false;
			}
		}
		
		// Creates a random order number between 1 and 10000
		Random rand  = new Random();
		orderNumber = rand.nextInt(10000) + 1;
		
		// Display totalCost, orderNumber, and programmerName in console
		System.out.println("Total Cost: $" + dc.format(totalCost) + "\nOrder Number: " + orderNumber
				+ "\nProgrammer: " + programmerName);
		
		// Display totalCost, orderNumber, and programmerName in dialog box
		JOptionPane.showMessageDialog(null, "Total Cost: $" + dc.format(totalCost) + "\nOrder Number: " + orderNumber
				+ "\nProgrammer: " + programmerName);
	}

}