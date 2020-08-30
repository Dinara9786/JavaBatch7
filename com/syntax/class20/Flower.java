[] argpackage com.syntax.class20;

public class Flower {
	
	String type;
	
	/* if you are not going to create a constructor -- > Compiler WILL create 1 for you
	 * Flower() {// default non argument constructor
	 * 
	 * 
	 */
	
	Flower () { // default constructor
		System.out.println("I am pointless constructor");
	}
	
	// if you create a Constructor then compiler WILL NOT CREATE any other constructor for you
	
	private Flower (String flowerType) { // this is constructor
		type = flowerType;
	}
	
	void Flower(){ // this is method and not constructor
		System.out.println("printing someones");	
		
	}
	
	public void display () { // the goal of method is to perform the action
		System.out.println(type);
	}
	
	public static void main(String[] args) {
		
		Flower flower = new Flower ();
		
		System.out.println(flower.type);
		
		Flower flower2 = new Flower ("Tulip");
		
		System.out.println(flower2.type);
		
		flower2.display();// calling method
		flower2.Flower(); // calling method
	}
}
