package string;

public class ReverseString {
public static void main(String[] args) {
	String s="gXBFDHVXC", nstr="";
	char ch;
	
	for(int i=0;i<s.length();i++) {
		ch = s.charAt(i);
		nstr= ch+nstr;
		
	}
	System.out.println(nstr);
}
}
