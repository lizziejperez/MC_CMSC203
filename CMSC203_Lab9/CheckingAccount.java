/**
 * Defines a checking accounts
 * @author Elizabeth Perez
 */
public class CheckingAccount extends BankAccount{
	private static final double FEE = 0.15;
	
	/**
	 * Constructor - initializes the checking account with the name and balance
	 * @param name
	 * @param amount
	 */
	public CheckingAccount(String name, double amount) {
		super(name, amount);
		super.setAccountNumber(getAccountNumber() + "-10");
	}
	
	/**
	 * Withdraws amount plus a fee from balance if possible
	 * @param amount
	 * @return completed - true if the withdraw was made, false otherwise
	 */
	public boolean withdraw(double amount) {
		boolean completed = false;
		
		if (amount+FEE <= super.getBalance()) {
			super.setBalance(super.getBalance()-(amount+FEE));
			completed = true;
		}
		
		return completed;
	}
}
