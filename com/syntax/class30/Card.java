package com.syntax.class30;

public abstract class Card {
	
//	Create a Card class that will have implemented  and unimplemented methods and a constructor 
//	that will initializes credit card type.  Create 3 subclasses of a Card card. Create 3 objects 
//	of different card and store them into LinkedList. 
//	Using for loop/advanced for loop/ iterator access all methods of the class.

	public String cardType;
	
	Card (String cardType) {
		this.cardType = cardType;
		
	}
	
	public abstract void issueCard();
	
	public void cancelCard () {
		
		System.out.println("cancel card " + cardType);
	}
}

class CreditCard extends Card {
	
	CreditCard (String cardType){
	super(cardType);
}

public void issueCard () {
	System.out.println("The Bank will issue credit card " + cardType);
}
}

class DebitCard extends Card {
	
	DebitCard (String cardType){
		super(cardType);
	}

	public void issueCard () {
		System.out.println("The Bank will issue debit card " + cardType);
	}
	}
class TravelCard extends Card {
	TravelCard (String cardType) {
		super(cardType);
	}
	public void issueCard () {
		System.out.println("The Bank will issue travel card");
	}
}