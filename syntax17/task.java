
package syntax17;

public class task {
//1st task 
	String createEmail(String name, String lastName, String emailType) {
		String mail = name.toLowerCase() + lastName.toLowerCase() + "@" + emailType.toLowerCase() + ".com";
		return mail;
	}
//2nd task 
	boolean isPrime(int a) {
		boolean prime = false;
		if (a > 1) {
			for (int i = 2; i <= a / i; i++) {
				if (a % i == 0) {
					prime = false;
					break;
				}
			}
		} else {
			prime = false;
		}
		return prime;
	}
}
