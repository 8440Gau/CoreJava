package BasicStringProgram;

public class ReverseString {
public static void main(String[] args) {
	ReverseString reverseString = new ReverseString();
	System.out.println(reverseString.reverseString("Work"));
	
}

public String reverseString(String originalWord) {
	char ch;
	String reverse="";
	for(int i=0;i<originalWord.length();i++) {
		ch=originalWord.charAt(i);
		reverse = ch+reverse;
	}
	return reverse;
}
}
