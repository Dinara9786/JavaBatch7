package syntax17;

public class uufffffyaustala {
public static void main(String[] args) {

uufffffyaustala obj = null;
@SuppressWarnings("null")
String[] words = obj.getWords("good night everyone");
for(String word : words) {
	System.out.println(word);
	}
}

String[] getWords(String str) {
	return str.split(" ");
}

}
