package com.syntax.class24;

public class BirdTest {

	public static void main(String[] args) {

		Bird bird = new BabyBird ();// we perform casing of non=primitive. This is upcasting == > object of subclass is referred by a Superclass
				// child type refer to parent type
		
		// achieving runtime polymorphism, coz during runtime Java decides which method to execute
		bird.fly();
		bird.eat();
		bird.sleep();
		
		BabyBird bb = new BabyBird();
		bb.cry();
		bb.fly();
		bb.eat();
		bb.sleep();
		//bird.cry is not available, coz during compilation, compiler gives an access only to the methods based on reference type which is on left part
		// in this case parent type representing child type
	} // override method is executed FIRST

}
