/**
 * A property class
 * @author Elizabeth Perez
 *
 */
public class Property {
	private String propertyName;
	private String city;
	private double rentAmount;
	private String owner;
	private Plot plot;
	
	public Property() {
		propertyName = "";
		city = "";
		rentAmount = 0;
		owner = "";
		plot = new Plot();
	}
	
	public Property(Property property) {
		propertyName = property.getPropertyName();
		city = property.getCity();
		rentAmount = property.getRentAmount();
		owner = property.getOwner();
		plot = property.getPlot();
	}
	
	public Property(String name, String location, double rentalFee, String propertyOwner) {
		propertyName = name;
		city = location;
		rentAmount = rentalFee;
		owner = propertyOwner;
	}
	
	public Property(String name, String location, double rentalFee, String propertyOwner, int x, int y, int width, int depth) {
		propertyName = name;
		city = location;
		rentAmount = rentalFee;
		owner = propertyOwner;
		plot = new Plot(x, y, width, depth);
	}
	
	public String toString() {
		String message;
		message = "Property Name: " + propertyName + "\nLocated in " + city + "\nBelonging to " + owner + "\nRent Amount: " + rentAmount ;
		return message;
	}
	
	public void setPropertyName(String name) {
		propertyName = name;
	}
	
	public String getPropertyName() {
		return propertyName;
	}
	
	public void setCity(String location) {
		city = location;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setRentAmount(double rentalFee) {
		rentAmount = rentalFee;
	}
	
	public double getRentAmount() {
		return rentAmount;
	}
	
	public void setOwner(String propertyOwner) {
		owner = propertyOwner;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public void setPlot(int x, int y, int width, int depth) {
		plot = new Plot(x, y, width, depth);
	}
	
	public Plot getPlot() {
		return plot;
	}
}
