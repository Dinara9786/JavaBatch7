
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
	
//3rd task
	char grade(int a) {
		if(a>50 && a<=70) {
			return 'D';
		}else if(a>70 && a<=80) {
			return 'C';
		}else if(a>80 && a<=90) {
			return 'B';
		}else if(a>90 && a<=100) {
			return 'A';
		}else {
			return 'F';
		}
	}
	
	
	
	
	
	
}
