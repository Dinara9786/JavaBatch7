package com.syntax.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class InsuranceInfo {
	
	public static void main(String[] args) {
		
		ArrayList<Insurance> insurances = new ArrayList<>();
		
		insurances.add(new Car ("CargoInsurance", "Toyota"));
		insurances.add(new Pet ("PetFriends", "Husky"));
		insurances.add(new Health ("HealthyInsurance"));
		
		System.out.println("======using regular loop===========");
		
		for (int i=0; i<insurances.size(); i++) {
			insurances.get(i).getQuote();
			insurances.get(i).cancelInsurance();
		}
		
		System.out.println("======using enhanced loop===========");

		for (Insurance insure: insurances) {
			insure.getQuote();
			insure.cancelInsurance();
		}
		
		System.out.println("======usinIterator===========");

		Iterator <Insurance> it = insurances.iterator();
		
		while (it.hasNext()) {
			Insurance insurance1 = it.next();
			insurance1.getQuote();
			insurance1.cancelInsurance();
		}
		
		
	}

}
