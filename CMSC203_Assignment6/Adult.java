/**
 * Adult Class
 * @author Elizabeth Perez
 */
public class Adult extends Ticket {
	private final double TAX = 9.6;
	private final String TYPE = "ADULT";
	
	public Adult() {
		super();
	}
	
	public Adult(String n, String r, int d, int t, String f) {
		super(n,r,d,t,f);
	}
	
	/**
	 * Calculates the price of the ticket
	 * @return a double - the ticket price
	 */
	public double calculateTicketPrice() {
		double price;
		
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
		
		price = price * (1 + (TAX / 100));
		
		return price;
	}
	
	/**
	 * Gets the viewer's id
	 * @return an integer - the id or -1 if not an Employee or MoviePass member
	 */
	public int getId() {
		return -1;
	}
	
	/**
	 * Gets the type of ticket
	 * @return a string - the type of ticket
	 */
	public String getType() {
		return TYPE;
	}
	
	/**
	 * Details the ticket in text
	 * @return a string - details of ticket
	 */
	@Override
	public String toString() {
		return TYPE + " " + super.toString() + " Price: " + calculateTicketPrice();
	}
}
