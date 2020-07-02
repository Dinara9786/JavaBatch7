package syntax16;

public class task {

	void num(int a, int b) {
		if (a > b) {
			System.out.println("The number a= " + a + "is larger than b= " + b);
		} else {
			System.out.println("The number b= " + b + "is larger than a= " + a);
		}
	}
	
	void evenORodd(int a) {
		if(a%2==0) {
			System.out.println("the number is even");
		}else {
			System.out.println("the number is odd");
		}
	}
	
	void palindrome(String word) {
		String b = "";
		for (int i = word.length()-1; i >=0; i--) {
			b += word.charAt(i);
		}
		if(b.equals(word)) {
			System.out.println(word + " is palindrome");
		}else {
			System.out.println(word + " isn't palindrome");
		}
	}
	
	void hello(String country) {
		country= country.toLowerCase();
		
		switch (country) {
		case "usa":
			System.out.println("Hello");
			break;
			
		case "turkey":
			System.out.println("Merhaba");
			break;
			
			
		case "arabic":
			System.out.println("Ehlen wa Sahlen");
			break;
			default:
				System.out.println("hi");
			
			
		}

		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
