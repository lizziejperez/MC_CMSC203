/**
 * MoviePass Class
 * @author Elizabeth Perez
 */
public class MoviePass extends Ticket {
	private final double TAX = 9.6;
	private final String TYPE = "MOVIEPASS";
	private int id; // MoviePass ID
	private boolean onlyMovieToday; // if MoviePass member is only seeing one movie on this day
	private boolean hasSeen; // if MoviePass member has seen the movie before
	private int movieCount; // number of movies MoviePass member has seen
	
	public MoviePass(int id) {
		super();
		this.id = id;
	}
	
	public MoviePass(String n, String r, int d, int t, String f, int id, int numTimesVisit, int numTimesWatched, int numTimesToday) {
		super(n,r,d,t,f);
		this.id = id;
		movieCount = numTimesVisit;
		if(numTimesWatched == 0) {
			hasSeen = false;
		} else {
			hasSeen = true;
		}
		if(numTimesToday == 0) {
			onlyMovieToday = true;
		} else {
			onlyMovieToday = false;
		}
	}
	
	/**
	 * Calculates the price of the ticket
	 * @return a double - the ticket price
	 */
	public double calculateTicketPrice() {
		double price;
		
		if(!isRegularFormat() || hasSeen || !onlyMovieToday) {
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
		} else if(movieCount == 0) {
			price = 9.99;
		} else {
			price = 0.0;
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
	 * Details the ticket in text
	 * @return a string - details of ticket
	 */
	@Override
	public String toString() {
		return TYPE + "-" + id + " " + super.toString() + " Price: " + calculateTicketPrice();
	}
	
	/**
	 * Determines if the movie format is NONE or not
	 * @return a boolean - true if format is NONE, false otherwise
	 */
	private boolean isRegularFormat() {
		if(getFormat().equals(Format.IMAX) || getFormat().equals(Format.THREE_D)) {
			return false;
		} else {
			return true;
		}
	}
	
	/**
	 * Sets hasSeen to v
	 * @param v
	 */
	public void setHasSeen(boolean v) {
		hasSeen = v;
	}
	
	/**
	 * Gets weather the moviepass member has seen this movie before or no
	 * @return hasSeen
	 */
	public boolean getHasSeen() {
		return hasSeen;
	}
	
	/**
	 * Sets onlyMovieToday to v
	 * @param v
	 */
	public void setOnlyMovieToday(boolean v) {
		onlyMovieToday = v;
	}
	
	/**
	 * Gets weather this is the only movie the moviepass member is seeing on that day
	 * @return
	 */
	public boolean getOnlyMovieToday() {
		return onlyMovieToday;
	}
	
	/**
	 * Sets number of movies that the moviepass member has seen to c
	 * @param c
	 */
	public void setMovieCount(int c) {
		movieCount = c;
	}
	
	/**
	 * Gets the number of movies that the moviepass member has seen
	 * @return movieCount
	 */
	public int getMovieCount() {
		return movieCount;
	}
}
