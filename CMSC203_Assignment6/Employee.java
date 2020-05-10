/**
 * Employee Class
 * @author Elizabeth Perez
 */
public class Employee extends Ticket {
	private final double TAX = 9.6;
	private final String TYPE = "EMPLOYEE";
	private int id; // employee ID
	private int movieCount; // number of movies the employee has seen
	
	public Employee(int id) {
		super();
		this.id = id;
	}
	
	public Employee(String n, String r, int d, int t, String f, int id, int numTimesVisit) {
		super(n,r,d,t,f);
		this.id = id;
		movieCount = numTimesVisit;
	}
	
	/**
	 * Calculates the price of the ticket
	 * @return a double - the ticket price
	 */
	public double calculateTicketPrice() {
		/*
		 * First two movies are free
		 * Additional movies are half off the pre-tax adult price, then add tax
		 */
		double price;
		
		if(movieCount < 2) {
			price = 0.0;
		} else {
			if(getTime() < 18) {
				price = 10.5;
			} else {
				price = 13.5;
			}
			
			if(getFormat() != Format.NONE) {
				if(getFormat() == Format.IMAX) {
					price += 3.0;
				} else {
					price += 2.5;
				}
			}
			
			price /= 2;
			
			price = price * (1 + (TAX / 100));
		}
		
		return price;
	}
	
	/**
	 * Gets the viewer's id
	 * @return an integer - the id or -1 if not an Employee or MoviePass member
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * Gets the type of ticket
	 * @return a string - the type of ticket
	 */
	public String getType() {
		return TYPE;
	}
	
	/**
	 * Sets number of movies that the employee has seen to c
	 * @param c
	 */
	public void setMovieCount(int c) {
		movieCount = c;
	}
	
	/**
	 * Gets the number of movies that the employee has seen
	 * @return movieCount
	 */
	public int getMovieCount() {
		return movieCount;
	}
	
	/**
	 * Details the ticket in text
	 * @return a string - details of ticket
	 */
	@Override
	public String toString() {
		return TYPE + "-" + id + " " + super.toString() + " Price: " + calculateTicketPrice();
	}
}
