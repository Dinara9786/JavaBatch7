package syntax17;

public class anothertabfortask {
public static void main(String[] args) {
	task t=new task();
	String email  = t.createEmail("Jane", "Mary", "gmail");
	System.out.println(email);
	
	
	boolean prime = t.isPrime(2);
	System.out.println(prime);
}
}
