package com.syntax.class31;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class UserDefinedObjectsInSet {
	
	public static void main(String[] args) {
		
		// we need to store objecgts of Health, Pet, Car
		
		Set<Insurance02>lset = new LinkedHashSet();
		
		lset.add(new Pet("Cat", "Cigna"));
		lset.add(new Car("Tesla", "Geico"));
		lset.add(new Health("Blue Cross"));
		
		// how to access variables and methods
		
		System.out.println("========using enhanced loop==================");
		
		for (Insurance02 ins: lset) {
			System.out.println(ins.insuranceName);
			
			//calling methods//accessing methods
			ins.getQuote();
			ins.cancelInsurance();
			System.out.println("========================================");
		}	
			System.out.println("========using Iterator==================");
			
			Iterator<Insurance02>iterator = lset.iterator();//LSET is our collection  .iterator() is our method
			
			while (iterator.hasNext()) {
//				iterator.next().getQuote();
//				iterator.next().cancelInsurace();
				
				Insurance02 insure = iterator.next();
				System.out.println(insure.insuranceName);
				insure.getQuote();
				insure.cancelInsurance();
				System.out.println("=====================================");
				
			}
			
			
		}
		
		
	}


