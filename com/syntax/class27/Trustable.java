package com.syntax.class27;

public interface Trustable{

	void trust();// interface collection of public abstract methods
}

interface Bank extends Trustable {// relationship interface to interface
	
	boolean MONEY=true; // public static final
	
	void deposit(); // public abstract
	void withdraw();
	// from java8 version. inside interface, we cam have default methods and static
	 // only default can be implemented . we can have define methods
	
	default void transferMoney() { 
		System.out.println("All banks must do transfer"); // and children can override it
	}
	
	static void checkCreditScore() {
		System.out.println("All banks must check credit score");
	} 
}
// we cannot override static
class PNC extends Mortgage implements Bank, Investments {
	
	public void deposit() {
		System.out.println("PNC bank takes depostis ");
	}
	public void withdraw () {
		System.out.println("PNC gives you your money");
	}

	public void trust() {
	System.out.println("PNC will trust with your money");
}
@Override
	public void giveMortgage () {
		System.out.println("PNC gives mortgage");
	}
	
	public void doInvestments() {
		System.out.println("PNC Does Investments");
	}
}
class BOA implements Bank, Investments {
	public void deposit() {
		System.out.println("BOA bank takes depostis ");
	}
	public void withdraw () {
		System.out.println("BOA gives you your money");
	}
	public void trust() {
		System.out.println("BOA will trust with your money");
}
	public void doInvestments() {
		System.out.println("BOA will investment with your money");
}
	public void givesLoan() {
		System.out.println("BOA will trust with your money");
}
}
	