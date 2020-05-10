/**
 * Movie Ticket Manager Class
 * @author Elizabeth Perez
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class MovieTicketManager implements MovieTicketManagerInterface {
	private java.text.NumberFormat currencyFormat;
	private ArrayList<Ticket> ticketList;
	
	public MovieTicketManager() {
		ticketList = new ArrayList<Ticket>();
		currencyFormat = NumberFormat.getCurrencyInstance(Locale.US);
	}
	
	/**
	 * Sorts the arraylist of Ticket objects by day
	 */
	private void sortByDay() {
		Ticket temp;
		for(int i = 1; i < ticketList.size(); i++) {
			for(int j = i; j > 0; j--) {
				if(ticketList.get(j).getDay() < ticketList.get(j-1).getDay()) {
					temp = ticketList.get(j);
					ticketList.remove(j);
					ticketList.add(j, ticketList.get(j-1));
					ticketList.remove(j-1);
					ticketList.add(j-1, temp);
				}
			}
		}
	}
	
	/**
	 * Sorts the arraylist of Ticket objects by id
	 */
	private void sortById() {
		Ticket temp;
		for(int i = 1; i < ticketList.size(); i++) {
			for(int j = i; j > 0; j--) {
				if(ticketList.get(j).getId() < ticketList.get(j-1).getId()) {
					temp = ticketList.get(j);
					ticketList.remove(j);
					ticketList.add(j, ticketList.get(j-1));
					ticketList.remove(j-1);
					ticketList.add(j-1, temp);
				}
			}
		}
	}
	
	/**
	 * Returns the number of times this patron has visited the theater this month
	 * @param id of the patron
	 * @return the number of times this patron has visited the theater this month
	 */
	public int numVisits(int id) {
		int count = 0;
		
		for(int i = 0; i < ticketList.size(); i++) {
			if(ticketList.get(i).getId() == id) {
				count++;
			}
		}
		
		return count;
	}
	
	/**
	 * Returns the number of times the patron has seen this movie
	 * @param id the id of the patron
	 * @param movie name of the movie
	 */
	public int numThisMovie(int id, String movie) {
		int count = 0;
		
		for(int i = 0; i < ticketList.size(); i++) {
			if(ticketList.get(i).getId() == id) {
				if(ticketList.get(i).getMovieName().equals(movie)) {
					count++;
				}
			}
		}
		
		return count;
	}
	
	/**
	 * Checks to see if this patron already saw a movie today
	 * @param id id of patron
	 * @param date current date
	 * @return number of movies the patron has seen today
	 */
	public int numMoviesToday(int id, int date) {
		int count = 0;
		
		for(int i = 0; i < ticketList.size(); i++) {
			if(ticketList.get(i).getId() == id) {
				if(ticketList.get(i).getDay() == date) {
					count++;
				}
			}
		}
		
		return count;
	}
	
	/**
	 * Adds a patron to the list and returns the ticket price
	 * @param m movie to be watched
	 * @param rating movie rating
	 * @param d date
	 * @param t time
	 * @param f feature
	 * @param type type of patron
	 * @param id id of the patron
	 * @return the price of the ticket. Returns -1 if type is invalid
	 */
	public double addTicket(String movieN, String rating, int d, int t, String f, String type, int id) {
		sortByDay();
		Ticket add;
		
		if(type.equals("Adult")) {
			add = new Adult(movieN, rating, d, t, f);
		} else if (type.equals("Child")) {
			add = new Child(movieN, rating, d, t, f);
		} else if (type.equals("Employee")) {
			add = new Employee(movieN, rating, d, t, f, id, numVisits(id));
		} else if(type.equals("MoviePass")) {
			add = new MoviePass(movieN, rating, d, t, f, id, numVisits(id), numThisMovie(id, movieN), numMoviesToday(id, d));
		} else {
			return -1;
		}
		
		ticketList.add(add);
		return add.calculateTicketPrice();
	}
	
	
	/**
	 * Returns the sales for the entire month
	 * @return the sales for the entire month
	 */
	public double totalSalesMonth() {
		double total = 0.0;
		
		for(int i = 0; i < ticketList.size(); i++) {
			total += ticketList.get(i).calculateTicketPrice();
		}
		
		return total;
	}
	
	public String monthlySalesReport() {
		sortByDay();
		String text = "";
		int adultCount = 0;
		double adultSales = 0;
		int childCount = 0;
		double childSales = 0;
		int employeeCount = 0;
		double employeeSales = 0;
		int moviepassCount = 0;
		double moviepassSales = 0;
		
		for(int i = 0; i < ticketList.size(); i++) {
			if(ticketList.get(i).getType().equals("ADULT")) {
				adultCount++;
				adultSales += ticketList.get(i).calculateTicketPrice();
			} else if (ticketList.get(i).getType().equals("CHILD")) {
				childCount++;
				childSales += ticketList.get(i).calculateTicketPrice();
			} else if (ticketList.get(i).getType().equals("EMPLOYEE")) {
				employeeCount++;
				employeeSales += ticketList.get(i).calculateTicketPrice();
			} else {
				moviepassCount++;
				moviepassSales += ticketList.get(i).calculateTicketPrice();
			}
		}
		
		text +=   "____Monthly Sales Report\n";
		text += "\n_____________Sales____Number";
		text += "\nADULT________" + currencyFormat.format(adultSales) + "____" + adultCount;
		text += "\nCHILD________" + currencyFormat.format(childSales) + "____" + childCount;
		text += "\nEMPLOYEE_____" + currencyFormat.format(employeeSales) + "____" + employeeCount;
		text += "\nMOVIEPASS____" + currencyFormat.format(moviepassSales) + "____" + moviepassCount;
		text += "\n\nTotal Monthly Sales: " + currencyFormat.format(totalSalesMonth());
		
		return text;
	}
	
	/**
	 * Returns an arraylist of strings that represent 3D tickets sorted by day
	 * @return an arraylist of strings that represent 3D tickets sorted by day
	 */
	public ArrayList<String> get3DTickets() {
		sortByDay();
		ArrayList<String> tickets = new ArrayList<String>();
		
		for(int i = 0; i < ticketList.size(); i++) {
			if(ticketList.get(i).getFormat().equals(Format.THREE_D)) {
				tickets.add(ticketList.get(i).toString());
			}
		}
		
		return tickets;		
	}
	/**
	 * Returns an arrayList of strings which represent tickets, in chronological order
	 * use the toString of each Ticket in the ticketList
	 * @return an arrayList of strings which represent tickets, in chronological order
	 */
	public ArrayList<String> getAllTickets() {
		sortByDay();
		ArrayList<String> tickets = new ArrayList<String>();
		
		for(int i = 0; i < ticketList.size(); i++) {
			tickets.add(ticketList.get(i).toString());
		}
		
		return tickets;
	}

	/**
	 * Returns an Arraylist of string representation of MoviePass tickets sorted by movieId
	 * @return an Arraylist of string representation of MoviePass tickets sorted by movieId
	 */
	public ArrayList<String> getMoviePassTickets() {
		sortById();
		ArrayList<String> tickets = new ArrayList<String>();
		
		for(int i = 0; i < ticketList.size(); i++) {
			if(ticketList.get(i).getType().equals("MOVIEPASS")) {
				tickets.add(ticketList.get(i).toString());
			}
		}
		
		return tickets;
	}
	
	/**
	 * Reads from a file and populates an arraylist of Ticket objects
	 * @param file file to be read from
	 * @throws FileNotFoundException when file is not found
	 */
	public void readFile(File file) throws FileNotFoundException {
		Scanner input = new Scanner(file);
		String line;
		String[] brokenUp;
		String movieN, rating, f, type;
		int d, t, id;
		
		while(input.hasNextLine()) {
			line = input.nextLine();
			brokenUp = line.split(":");
			movieN = brokenUp[0];
			rating = brokenUp[1];
			d = Integer.parseInt(brokenUp[2]);
			t = Integer.parseInt(brokenUp[3]);
			f = brokenUp[4];
			type = brokenUp[5];
			id = Integer.parseInt(brokenUp[6]);
			addTicket(movieN, rating, d, t, f, type, id);
		}
		
		input.close();
	}
	
}
