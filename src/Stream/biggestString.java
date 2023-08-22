package Stream;

import java.util.Arrays;
import java.util.List;

public class biggestString {
public static void main(String[] args) {
	
	List<String> str = Arrays.asList("Hello","Gaurav","Singh","Saurab");
	
	String s=str.stream().reduce((m1,m2)-> m1.length()>m2.length()?m1:m2).get();

   System.out.println(s);
}
}
