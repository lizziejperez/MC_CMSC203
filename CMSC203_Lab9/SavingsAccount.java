/**
 * Defines a savings account
 * @author Elizabeth Perez
 */
import java.lang.Math;
public class SavingsAccount extends BankAccount{
	private double rate = 2.5; // annual interest rate
	private int savingsNumber = 0;
	private String accountNumber;
	
	/**
	 * Constructor - initializes the savings account with the name and balance
	 * @param name
	 * @param amount
	 */
	public SavingsAccount(String name, double amount) {
		super(name, amount);
		accountNumber = super.getAccountNumber()+"-"+savingsNumber;
	}
	
	/**
	 * Constructor - initializes the savings account with the info from an old account and balance
	 * @param oldAccount
	 * @param amount
	 */
	public SavingsAccount(SavingsAccount oldAccount, double amount) {
		super(oldAccount, amount);
		String oldAccNum = oldAccount.getAccountNumber();
		savingsNumber = Character.getNumericValue(oldAccNum.charAt(oldAccNum.length()-1)) + 1;
		accountNumber = super.getAccountNumber() +"-"+savingsNumber;
	}
	
	/**
	 * Adds a month of interest to the balance
	 */
	public void postInterest() {
		// Calculation: A = P(1 + r)^t
		double step1 = 1.0 + (rate/100.0);
		double step2 = 1.0/12.0; // one month out of a year since the rate is annual
		double step3 = Math.pow(step1, step2);
		double newBalance = super.getBalance()*step3;
		
		super.setBalance(newBalance);
	}
	
	/***
	 * @return accountNumber
	 */
	public String getAccountNumber() {
		return accountNumber;
	}
}
