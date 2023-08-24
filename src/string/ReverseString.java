package string;

import java.nio.file.spi.FileSystemProvider;

public class ReverseString {
public static void main(String[] args) {
	String s="gXBFDHVXC", nstr="";
	char ch;
	 long count = 0;
	for(int i=0;i<s.length();i++) {
		ch = s.charAt(i);
		nstr= ch+nstr;
		
	}
	System.out.println(nstr);
	count = s.length();
	System.out.println(count);
	
	/************* Reverse string using stringbuffer ***********/
	
	System.out.println("*************** StringBuffer ************************");
	
	StringBuffer buffer = new StringBuffer();
	buffer.append(s);
	
	StringBuffer st = buffer.reverse();

	System.out.println(st);
}
}
