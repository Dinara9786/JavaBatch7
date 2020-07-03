package syntax17;

public class methodswithreturn {
	public static void main(String[] args) {
		methodswithreturn obj = new methodswithreturn();
		boolean isiteven = obj.isEven(12);
		
		System.out.println(isiteven);
		System.out.println(obj.isEven(11));
	}
	
	
boolean isEven(int a) {
	boolean even;
if(a%2==0) {
	even=true;
}else {
	even=false;
}
return even;
}

int getlargest(int a, int b) {
	int largest;
	if(a>b) {
		largest=a;
	}else{
		largest = b;
	}
	return largest;
}







}
