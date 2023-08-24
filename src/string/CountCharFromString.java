package string;

public class CountCharFromString {
public static void main(String[] args) {
	String s= "Gaurav";
	int count = 0;
	char ch ='a';
	
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)==ch) {
			count++;
		}	
	}
	System.out.println(count);
}

}
