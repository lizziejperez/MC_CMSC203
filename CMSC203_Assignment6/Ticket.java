/**
 * Ticket Class
 * @author Elizabeth Perez
 */
public abstract class Ticket {
	private Format format; // movie format
	private String movieName; // movie name
	private String rating; // movie rating (G, PG, PG13, R, or NR)
	private int day; // showing day (1-31)
	private int time; // showing time in military format (8-23)
	
	public Ticket() {
		format = Format.NONE;
		movieName = "";
		rating = "G";
		day = 1;
		time = 8;
	}
	
	public Ticket(String n, String r, int d, int t, String f) {
		movieName = n;
		rating = r;
		day = d;
		time = t;
		
		if(f.equals("IMAX")) {
			format = Format.IMAX;
		} else if(f.equals("3D")) {
			format = Format.THREE_D;
		} else {
			format = Format.NONE;
		}
	}
	
	/**
	 * Calculates the price of the ticket
	 * @return a double - the ticket price
	 */
	public abstract double calculateTicketPrice();
	
	/**
	 * Gets the viewer's id
	 * @return an integer - the id or -1 if not an Employee or MoviePass member
	 */
	public abstract int getId();
	
	/**
	 * Gets the type of ticket
	 * @return a string - the type of ticket
	 */
	public abstract String getType();
	
	/**
	 * Details the ticket in text
	 * @return a string - details of ticket
	 */
	public String toString() {
		String text = "";
		
		if(format.equals(Format.IMAX)) {
			text += "IMAX ";
		}
		if(format.equals(Format.THREE_D)) {
			text += "3D ";
		}
		
		text += "Movie: " + movieName + " Rating: " + rating + " Day: " + day + " Time: " + time;
		
		return text;
	}
	
	/**
	 * Sets the ticket format to f
	 * @param f
	 */
	public void setFormat(Format f) {
		format = f;
	}
	
	/**
	 * Gets the tickets format
	 * @return format
	 */
	public Format getFormat() {
		return format;
	}
	
	/**
	 * Sets the movie's name to n
	 * @param n
	 */
	public void setMovieName(String n) {
		movieName = n;
	}
	
	/**
	 * Gets the movie's name
	 * @return movieName
	 */
	public String getMovieName() {
		return movieName;
	}
	
	/**
	 * Sets the movie's rating to r
	 * @param r
	 */
	public void setRating(String r) {
		rating = r;
	}
	
	/**
	 * Gets the movie's rating
	 * @return rating
	 */
	public String getRating() {
		return rating;
	}
	
	/**
	 * Sets the day of the movie to d
	 * @param d
	 */
	public void setDay(int d) {
		day = d;
	}
	
	/**
	 * Gets the day of the movie
	 * @return day
	 */
	public int getDay() {
		return day;
	}
	
	/**
	 * Sets the time of the movie to t
	 * @param t
	 */
	public void setTime(int t) {
		time = t;
	}
	
	/**
	 * Gets the time of the movie
	 * @return time
	 */
	public int getTime() {
		return time;
	}
	
}
