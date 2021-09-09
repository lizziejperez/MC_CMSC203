/**
 * A management company class
 * @author Elizabeth Perez
 *
 */
public class ManagementCompany {
	private String name;
	private String taxID;
	private double mgmFeePer;
	private final int MAX_PROPERTY = 5;
	private Property[] properties;
	private final int MGMT_WIDTH = 10;
	private final int MGMT_DEPTH = 10;
	private Plot plot;
	private int count;
	
	public ManagementCompany() {
		name = "";
		taxID = "";
		mgmFeePer = 0;
		plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
		properties = new Property[MAX_PROPERTY];
		count = 0;
	}
	
	public ManagementCompany(String companyName, String id, double fee) {
		name = companyName;
		taxID = id;
		mgmFeePer = fee;
		plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
		properties = new Property[MAX_PROPERTY];
		count = 0;
	}
	
	public ManagementCompany(String companyName, String id, double fee, int x, int y, int width, int depth) {
		name = companyName;
		taxID = id;
		mgmFeePer = fee;
		plot = new Plot(x, y, width, depth);
		properties = new Property[MAX_PROPERTY];
		count = 0;
	}
	
	public ManagementCompany(ManagementCompany company) {
		name = company.name;
		taxID = company.taxID;
		mgmFeePer = company.mgmFeePer;
		plot = company.plot;
		properties = company.properties;
		count = company.count;
	}
	
	public String toString() {
		String message;
		
		message = "List of properties for " + name + ", taxID: " + taxID;
		message += "\n_____________________________________________\n";
		
		for(int i = 0; i < count; i++) {
			message += properties[i].toString();
			message += "\n";
		}
		
		message += "_____________________________________________\n";
		double totalMNGMFee = (totalRent()*mgmFeePer)/100;
		
		message += "Total Management Fee: " + totalMNGMFee;
		
		return message;
	}
	
	public int addProperty(Property property) {
		if(count == MAX_PROPERTY) {
			return -1;
		}
		
		if(property == null) {
			return -2;
		}
		
		if(!plot.encompasses(property.getPlot())) {
			return -3;
		}
		
		for(int i = 0; i < count; i++) {
			if(property.getPlot().overlaps(properties[i].getPlot())) {
				return -4;
			}
		}
		
		Property prop = new Property(property);
		
		properties[count] = prop;
		count++;
		
		return count-1;
		
	}
	
	public int addProperty(String propertyName, String city, double rent, String ownerName) {
		if(count == MAX_PROPERTY) {
			return -1;
		}
		
		Property prop = new Property(propertyName, city, rent, ownerName);
		properties[count] = prop;
		count++;
		
		return count-1;
	}
	
	public int addProperty(String propertyName, String city, double rent, String ownerName, int x, int y, int width, int depth) {
		if(count == MAX_PROPERTY) {
			return -1;
		}
		
		Property prop = new Property(propertyName, city, rent, ownerName, x, y, width, depth);
		
		if(!plot.encompasses(prop.getPlot())) {
			return -3;
		}
		
		for(int i = 0; i < count; i++) {
			if(properties[i].getPlot().overlaps(prop.getPlot())) {
				return -4;
			}
		}
		
		properties[count] = prop;
		count++;
		
		return count-1;
	}
	
	public String displayPropertyAtIndex(int i) {
		return properties[i].toString();
	}
	
	public int getMAX_PROPERTY() {
		return MAX_PROPERTY;
	}
	
	public double maxRentProp() {
		double max = properties[maxRentPropertyIndex()].getRentAmount();
		return max;
	}
	
	public int maxRentPropertyIndex() {
		int index = 0;
		double highest = properties[0].getRentAmount();
		
		for(int i = 1; i < count; i++) {
			if(properties[i].getRentAmount() > highest) {
				highest = properties[i].getRentAmount();
				index = i;
			}
		}
		
		return index;
	}
	
	public double totalRent() {
		double total = 0;
		
		for(int i = 0; i < count; i++) {
			total += properties[i].getRentAmount();
		}
		
		return total;
	}
}
