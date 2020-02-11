import java.util.Scanner;
/**
 * @author Elizabeth Perez
 * @version 1
 */
public class MovieDriver {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Movie thing = new Movie();
		
		boolean cont = true;
		String response;
		String title;
		String rating;
		int ticketsSold;
		
		do {
			System.out.print("Enter the movie title: ");
			title = input.nextLine();
			thing.setTitle(title);
			
			System.out.print("Enter the movie's rating: ");
			rating = input.next(); 
			thing.setRating(rating);
			

			System.out.print("Enter the number of tickets sold at the theater: ");
			ticketsSold = input.nextInt(); 
			thing.setSoldTickets(ticketsSold);
			
			System.out.println(thing.toString());
			
			System.out.print("Would you like to continue (y or n)? ");
			response = input.next();
			input.nextLine();
			if(!response.equals("y")) {
				cont = false;
				System.out.println("Goodbye.");
			}
		} while (cont);
		
		input.close();
	}

}
