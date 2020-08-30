package com.syntax.class24;

public class BankTest {
	
	public static void main (String [] args) {
	
	BOA boa = new BOA(900);
	double boaFee = boa.chargeFee();
	System.out.println(boaFee);
	
	PNC pnc = new PNC (900);
	double pncFee = pnc.chargeFee();
	System.out.println(pncFee);
	
	Citi citi = new Citi (900);
	double citiFee = citi.chargeFee();
	System.out.println(citiFee);
	
	// BOA is not overriding, BOA only uses the features of Parent
	//  PNC is overriding Parent's method
	// Same with Citi. Citi is not overriding. It uses features of Parent
	
	}
}
