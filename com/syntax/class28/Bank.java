package com.syntax.class28;

public class Bank {

	private long accountNumber;
	private double balance;
	
	// create setter
	
	public void setAccountNumber (long accNumber) {
		// here can be some validation point 
		this.accountNumber=accountNumber;
	}
	
	public void setBalance(double balance ) {
		// here can be some validation point 
		this.balance= balance;
	}
	
	//create getter
	public long getAccountNumber () {
		//we can add many validation points too
		return accountNumber;
	}
	public double getBalance() {
		return balance;
	}

}
