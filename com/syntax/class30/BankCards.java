package com.syntax.class30;

import java.util.Iterator;
import java.util.LinkedList;

public class BankCards {
	public static void main(String[] args) {
		
		LinkedList<Card> cards = new LinkedList<>();
		
		cards.add(new CreditCard ("Chase"));
		cards.add(new DebitCard ("Investor"));
		cards.add(new TravelCard ("Tumar"));
		
		System.out.println("============using regular for loop================");
		
		for (int i=0; i<cards.size(); i++) {
			cards.get(i).issueCard();
			cards.get(i).cancelCard();
		}
		
		System.out.println("============using regular enhanced loop================");
		
		for (Card card1:cards) {
			card1.issueCard();
			card1.cancelCard();
		}
		
		System.out.println("============using Iterator===============");
		
		Iterator<Card> it = cards.iterator();
		
		while (it.hasNext()) {
		Card card2 = it.next();
		card2.issueCard();
		card2.cancelCard();
		}
	}

}
