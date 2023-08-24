package string;

public class PalindromeCheck {
public static void main(String[] args) {
	String space="rotator";
	PalindromeCheck check= new PalindromeCheck();
	String reversestring = check.reverseString(space);
	if(space.equals(reversestring)) {
		System.out.println("Palindrome");
	}else {
		System.out.println("Not Palindrome");
	}
	
}
public static String reverseString(String str2) 
{
    String revstr = "";
    for (int i = str2.length() - 1; i >= 0; i--) 
     {
        revstr += str2.charAt(i);
     }
        return revstr;
 }
}
