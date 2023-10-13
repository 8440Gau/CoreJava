package durgaSir;

import java.util.function.Predicate;

public class StringLengthPredicate {
public static void main(String[] args) {
	
	Predicate<String> str = str1-> str1.length()>5;
	
	System.out.println(str.test("Test"));
	System.out.println(str.test("testworkingorNot"));
	
}
}

