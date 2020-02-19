/**
 * The purpose of this class is to model a television
 * @author Elizabeth Perez
 * 2/18/2020
 */
public class Television {
	// fields
	final private String MANUFACTURER; // the TV manufacturer
	final private int SCREEN_SIZE; // the TV screen size
	private boolean powerOn; // the TV power on or off
	private int channel; // the channel displayed
	private int volume; // the TV volume
	
	/**
	 * 
	 * @param manufacturer - the TV manufacturer
	 * @param screenSize - the TV screen size
	 */
	public Television(String manufacturer, int screenSize) {
		MANUFACTURER = manufacturer;
		SCREEN_SIZE = screenSize;
		powerOn = false;
		channel = 2;
		volume = 20;
	}
	
	/**
	 * returns the TV volume
	 * @return volume
	 */
	public int getVolume() {
		return volume;
	}
	
	/**
	 * returns the channel on the TV
	 * @return channel
	 */
	public int getChannel() {
		return channel;
	}
	
	/**
	 * returns the TV manufacturer
	 * @return MANUFACTURER
	 */
	public String getManufacturer() {
		return MANUFACTURER;
	}
	
	/**
	 * returns the TV screen size
	 * @return SCREEN_SIZE
	 */
	public int getScreenSize() {
		return SCREEN_SIZE;
	}
	
	/**
	 * sets TV channel to change
	 * @param change - new channel choice
	 */
	public void setChannel(int change) {
		channel = change;
	}
	
	/**
	 * changes power status of TV
	 */
	public void power() {
		powerOn = !powerOn;
	}
	
	/**
	 * increases the TV volume by 1
	 */
	public void increaseVolume() {
		volume++;
	}
	
	/**
	 * decreases the TV volume by 1
	 */
	public void decreaseVolume() {
		volume--;
	}
}
